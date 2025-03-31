//DATOS -> RELACIONAR CON BACK
//Código del calendario
//Tabla
var reservations = [ //SON SOLO DE HOY
    { lugar: "C - 304", hora: "8:00 - 9:00"},
    { lugar: "LABICO", hora: "8:00 - 9:00"}, 
    { lugar: "LABICO", hora: "10:00 - 1:00"},
    { lugar: "LABISW", hora: "11:00 - 1:00"},
    { lugar: "Multimedia", hora: "6:00 - 7:00"}
];

var salones = [...new Set(reservations.map(r => r.lugar))];

var tableHead = document.getElementById("tableHead");

var title = document.querySelector("h1");
var currentDate = new Date(); 
function formatDate(date) {
    const options = { weekday: 'long', month: 'long', day: 'numeric' };
    let fullDate = date.toLocaleDateString('es-CO', options);
    fullDate = fullDate.replace(',', '');
    return fullDate[0].toUpperCase() + fullDate.slice(1);
}

title.textContent = "Hoy, " + formatDate(currentDate); 

salones.forEach(salon => {
    var th = document.createElement("th");
    let reservaDiv = document.createElement("div");
    
    reservaDiv.classList.add("reserve_indicator");
    reservaDiv.textContent = salon; // Mostrar el nombre del salón en el div
    
    th.appendChild(reservaDiv); // Agregar el div dentro del <th>
    tableHead.appendChild(th); // Agregar el <th> a la cabecera de la tabla
});


// Organizar reservas por salón en orden cronológico
var reservasPorSalon = {};
salones.forEach(salon => reservasPorSalon[salon] = []);

reservations.forEach(reserva => {
    reservasPorSalon[reserva.lugar].push(reserva.hora);
});

// Ordenar horarios dentro de cada salón
for (let salon in reservasPorSalon) {
    reservasPorSalon[salon].sort(); // REVISAR
}

// Encontrar el número máximo de reservas en un solo salón
var maxReservas = Math.max(...Object.values(reservasPorSalon).map(arr => arr.length));

// Crear filas de la tabla según el número máximo de reservas
var tableBody = document.getElementById("tableBody");

for (let i = 0; i < maxReservas; i++) {
    let row = document.createElement("tr");

    salones.forEach(salon => {
        let td = document.createElement("td");

        if (reservasPorSalon[salon][i]) { // Solo crear el div si hay una reserva
            let reservaDiv = document.createElement("div");
            reservaDiv.classList.add("reserve_indicator");
            reservaDiv.textContent = reservasPorSalon[salon][i];
            td.appendChild(reservaDiv);
        }

        row.appendChild(td);
    });

    tableBody.appendChild(row);
}









