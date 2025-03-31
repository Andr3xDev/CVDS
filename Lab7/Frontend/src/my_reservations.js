// DATOS -> RELACIONAR CON BACK
// Código del calendario
// Tabla
const schedules = [
    "7:00 - 8:30", "8:30 - 10:00", "10:00 - 11:30", "11:30 - 1:00",
    "1:00 - 2:30", "2:30 - 4:00", "4:00 - 5:30", "5:30 - 7:00"
];

var reservations = [
    { id:"12345", fecha: "Lunes, 17 de marzo", lugar: "LABISW", hora: "8:00 - 9:00" },
    { id:"12346", fecha: "Martes, 18 de marzo", lugar: "LABISW", hora: "10:00 - 12:00" },
    { id:"12347", fecha: "Viernes, 21 de marzo", lugar: "Multimedia", hora: "5:30 - 7:00" },
    { id:"12348", fecha: "Sábado, 22 de marzo", lugar: "LABICO", hora: "10:00 - 11:00" }
];

const days = 6;
let currentDate = new Date();
const tableBody = $("#weekTable-body");

// Generar la tabla con horarios
schedules.forEach(() => {
    let row = $("<tr></tr>");
    tableBody.append(row);
    for (let i = 0; i < days; i++) {
        row.append($("<td></td>"));
    }
});

// Formatear la fecha
function formatDate(date) {
    const options = {
        weekday: 'long',
        month: 'long',
        day: 'numeric'
    };
    const fullDate = date.toLocaleDateString('es-CO', options);
    return fullDate[0].toUpperCase() + fullDate.slice(1);
}

// Mostrar la semana en la tabla
function show(date) {
    let count = 0;
    for (let i = 0; count < days; i++) {
        const nextDay = new Date(date);
        nextDay.setDate(date.getDate() + i);
        if (nextDay.getDay() !== 0) { // Evitar domingos
            $("#day" + count).text(formatDate(nextDay));
            count++;
        }
    }
    showReservations(); // Actualizar reservas al cambiar de semana
}

// Navegar a la siguiente semana
$("#right_arrow").on("click", function () {
    currentDate.setDate(currentDate.getDate() + 7);
    $("#header_week").text("Semana Siguiente")
    show(currentDate);
});

// Navegar a la semana anterior
$("#left_arrow").on("click", function () {
    currentDate.setDate(currentDate.getDate() - 7);
    $("#header_week").text("Semana Actual")
    show(currentDate);
});

// Mostrar reservas en la tabla
function showReservations() {
    $("#weekTable-body td").empty(); 

    reservations.forEach(reservation => {
        $("#weekTable-head th").each(function(index) {
            if ($(this).text().trim() === reservation.fecha) {
                let columnIndex = index;
                let cell = $("#weekTable-body tr").find("td").eq(columnIndex);
                
                let reservaBox = $("<div></div>").addClass("reserve_box");
                let id = $("<span></span>").addClass("reserva-id").text(reservation.id);
                let lugar = $("<span></span>").text(reservation.lugar);
                let hora = $("<span></span>").text(reservation.hora);

                let modifyBtn = $("<button></button>")
                    .addClass("modify_button")
                    .append('<i class="fas fa-edit"></i>')
                    .on("click", function() {
                        /*modifyReservation(reservation);*/
                    });

                let deleteBtn = $("<button></button>")
                    .addClass("delete_button")
                    .append('<i class="fas fa-trash"></i>')
                    .on("click", function() {
                        //SIMULACIÓN - BORRAR
                        let reservaDiv = $(this).closest(".reserve_box"); 
                        reservaDiv.fadeOut(300, function() { // Efecto de desaparición
                        reservaDiv.remove(); // Elimina el div del DOM
                        });

                        let reservaId = $(this).closest(".reserve_box").find(".reserva-id").text();
                        deleteReserve(reservaId);
                    });

                reservaBox.append(id).append("<br>").append(lugar).append("<br>").append(hora).append("<br>");
                reservaBox.append(modifyBtn).append(deleteBtn);

                cell.append(reservaBox);
            }
        });
    });
}

//LISTENERS
$(document).on("click", ".modify_button, .delete_button", function() {
    let reservaBox = $(this).closest(".reserve_box");

    reservaBox.addClass("highlight");

    // Remover la animación después de terminar para que se pueda volver a activar
    setTimeout(() => {
        reservaBox.removeClass("highlight");
    }, 500);
});


show(currentDate);


const API_URL = "https://isibook-btewcucxb4djcsha.canadacentral-01.azurewebsites.net/"; // Reemplaza con tu API

function deleteReserve(reserveId) {
    const responseMessage = document.getElementById("responseMessage");

    fetch(`${API_URL}/${reserveId}`, {
        method: "DELETE"
    })
    .then(response => {
        if (response.ok) {
            alert("✅ Reserva eliminada con éxito");
            document.querySelector("form").reset(); 
        } else {
            alert("❌ Error al eliminar la reserva");
        }
    })
    .catch(error => {
        alert("⚠️ Error al conectar con el servidor.");
    });
}
