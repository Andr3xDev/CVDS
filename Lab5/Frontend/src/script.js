document.addEventListener("DOMContentLoaded", function () {
    setTimeout(function () {
        document.getElementById("loadingScreen").style.display = "none";
        document.getElementById("loginContainer").style.display = "block";
    }, 5000); // 5 segundos

    const loginForm = document.getElementById("loginForm");

    loginForm.addEventListener("submit", function (event) {
        event.preventDefault(); // Evita que la página se recargue

        const username = document.getElementById("username").value;
        const password = document.getElementById("password").value;

        console.log("Usuario:", username);
        console.log("Contraseña:", password);

        if (username === "admin" && password === "1234") { 
            alert("Login exitoso. Redirigiendo...");
            setTimeout(function () {
                window.location.href = "dashboard.html";
            }, 2000);
        } else {
            alert("Usuario o contraseña incorrectos.");
            setTimeout(function () {
                window.location.href = "Sys_Reservas_Login.html";
            }, 8000);
        }
    });
});
