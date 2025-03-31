
//LISTENERS
document.getElementById("repetitive").addEventListener("change", function() {
    const selectElement = document.getElementById("repetitive_select");
    selectElement.style.display = this.checked ? "block" : "none";
});



//ENDPOINTS

document.querySelector("form").addEventListener("submit", async function (event) {
    event.preventDefault(); // Evita que la página se recargue al enviar el formulario
    const reserve = {
        userId: "12345", //REVISAR
        classroomId: document.getElementById("classroom").value,
        startDate: document.getElementById("date").value,
        finishDate: document.getElementById("start_time").value,
        status: "Activa",
        endTime: document.getElementById("end_time").value,
        repetitive: document.getElementById("repetitive").value,
        repetitive_time: document.getElementById("repetitive_select").value,
        purpose: document.getElementById("reason").value
    };

    try {
        const response = await fetch("https://isibook-btewcucxb4djcsha.canadacentral-01.azurewebsites.net/", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(reserve)
        });

        if (response.ok) {
            alert("✅ Reserva creada con éxito!");
            document.querySelector("form").reset(); 
        } else {
            alert("❌ Error al crear la reserva. Intenta de nuevo.");
        }
    } catch (error) {
        alert("⚠️ Error al conectar con el servidor.");
    }
});

