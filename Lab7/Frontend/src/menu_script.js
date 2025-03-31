document.addEventListener("DOMContentLoaded", function () {
    fetch("menu.html")
        .then(response => response.text())
        .then(data => {
            document.getElementById("menu_container").innerHTML = data;

            setTimeout(() => {
                const menuButton = document.getElementById("open_button");
                const closeButton = document.getElementById("close_button");
                const menu = document.getElementById("menu");
                const mainContent = document.querySelector(".main-content"); // Contenido principal

                if (menuButton && closeButton && menu && mainContent) {
                    menuButton.addEventListener("click", function () {
                        menu.classList.add("menu_visible");
                        mainContent.classList.add("menu_active"); // Desplazar contenido
                    });

                    closeButton.addEventListener("click", function () {
                        menu.classList.remove("menu_visible");
                        mainContent.classList.remove("menu_active"); // Restaurar contenido
                    });
                } else {
                    console.error("No se encontraron los elementos del menú o el contenido.");
                }
            }, 0);
        })
        .catch(error => console.error("Error al cargar el menú:", error));
});
