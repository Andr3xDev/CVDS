    document.addEventListener("DOMContentLoaded", () => {
    const bloqueSelect = document.getElementById("bloque-select")
    const salonesContainer = document.getElementById("salones-container")
    const modal = document.getElementById("salon-modal")
    const modalTitle = document.getElementById("modal-title")
    const modalDescription = document.getElementById("modal-description")
    const closeButton = document.querySelector(".close-button")
  
    // Datos de ejemplo de los salones por bloque con descripciones
    const salonesPorBloque = {
      A: [
        {
          nombre: "Laboratorio de Software",
          descripcion: {
            Capacidad: "30 estudiantes",
            Computadores: "30 equipos HP EliteDesk",
            Software: "Visual Studio, Eclipse, MATLAB, MySQL",
            Proyector: "Sí",
            "Aire acondicionado": "Sí",
            Horario: "7:00 AM - 9:00 PM",
          },
        },
        {
          nombre: "Aula 101",
          descripcion: {
            Capacidad: "40 estudiantes",
            Computadores: "No tiene",
            Proyector: "Sí",
            Tablero: "Acrílico",
            "Aire acondicionado": "Sí",
            Horario: "7:00 AM - 9:00 PM",
          },
        },
        {
          nombre: "Aula 102",
          descripcion: {
            Capacidad: "35 estudiantes",
            Computadores: "No tiene",
            Proyector: "Sí",
            Tablero: "Digital interactivo",
            "Aire acondicionado": "Sí",
            Horario: "7:00 AM - 9:00 PM",
          },
        },
        {
          nombre: "Aula 103",
          descripcion: {
            Capacidad: "25 estudiantes",
            Computadores: "1 para el profesor",
            Proyector: "Sí",
            Tablero: "Acrílico",
            "Aire acondicionado": "No",
            Horario: "7:00 AM - 7:00 PM",
          },
        },
        {
          nombre: "Aula 104",
          descripcion: {
            Capacidad: "30 estudiantes",
            Computadores: "No tiene",
            Proyector: "Sí",
            Tablero: "Acrílico",
            "Aire acondicionado": "Sí",
            Horario: "7:00 AM - 9:00 PM",
          },
        },
      ],
      B: [
        {
          nombre: "Laboratorio de Redes",
          descripcion: {
            Capacidad: "25 estudiantes",
            Computadores: "25 equipos Dell Optiplex",
            "Equipos especiales": "Routers Cisco, Switches, Racks",
            Software: "Packet Tracer, Wireshark, VMware",
            Proyector: "Sí",
            "Aire acondicionado": "Sí",
            Horario: "8:00 AM - 8:00 PM",
          },
        },
        {
          nombre: "Aula 201",
          descripcion: {
            Capacidad: "45 estudiantes",
            Computadores: "No tiene",
            Proyector: "Sí",
            Tablero: "Acrílico",
            "Aire acondicionado": "Sí",
            Horario: "7:00 AM - 9:00 PM",
          },
        },
        {
          nombre: "Aula 202",
          descripcion: {
            Capacidad: "30 estudiantes",
            Computadores: "No tiene",
            Proyector: "Sí",
            Tablero: "Acrílico",
            "Aire acondicionado": "No",
            Horario: "7:00 AM - 7:00 PM",
          },
        },
        {
          nombre: "Aula 203",
          descripcion: {
            Capacidad: "35 estudiantes",
            Computadores: "No tiene",
            Proyector: "Sí",
            Tablero: "Acrílico",
            "Aire acondicionado": "Sí",
            Horario: "7:00 AM - 9:00 PM",
          },
        },
      ],
      C: [
        {
          nombre: "Laboratorio de Electrónica",
          descripcion: {
            Capacidad: "20 estudiantes",
            Computadores: "10 estaciones de trabajo",
            "Equipos especiales": "Osciloscopios, Generadores de señales, Multímetros",
            Software: "Proteus, Multisim, Arduino IDE",
            Proyector: "Sí",
            "Aire acondicionado": "Sí",
            Horario: "8:00 AM - 6:00 PM",
          },
        },
        {
          nombre: "Aula 301",
          descripcion: {
            Capacidad: "40 estudiantes",
            Computadores: "No tiene",
            Proyector: "Sí",
            Tablero: "Acrílico",
            "Aire acondicionado": "Sí",
            Horario: "7:00 AM - 9:00 PM",
          },
        },
        {
          nombre: "Aula 302",
          descripcion: {
            Capacidad: "30 estudiantes",
            Computadores: "No tiene",
            Proyector: "Sí",
            Tablero: "Acrílico",
            "Aire acondicionado": "No",
            Horario: "7:00 AM - 7:00 PM",
          },
        },
        {
          nombre: "Aula 303",
          descripcion: {
            Capacidad: "35 estudiantes",
            Computadores: "No tiene",
            Proyector: "Sí",
            Tablero: "Digital interactivo",
            "Aire acondicionado": "Sí",
            Horario: "7:00 AM - 9:00 PM",
          },
        },
      ],
      D: [
        {
          nombre: "Sala de Conferencias",
          descripcion: {
            Capacidad: "100 personas",
            Computadores: "1 para presentaciones",
            Proyector: "Sí, de alta definición",
            "Sistema de sonido": "Amplificado con 8 altavoces",
            Micrófonos: "4 (2 de mano, 2 de solapa)",
            "Aire acondicionado": "Sí",
            Horario: "8:00 AM - 8:00 PM",
            "Reserva especial": "Requiere autorización previa",
          },
        },
        {
          nombre: "Aula 401",
          descripcion: {
            Capacidad: "50 estudiantes",
            Computadores: "No tiene",
            Proyector: "Sí",
            Tablero: "Acrílico",
            "Aire acondicionado": "Sí",
            Horario: "7:00 AM - 9:00 PM",
          },
        },
        {
          nombre: "Aula 402",
          descripcion: {
            Capacidad: "45 estudiantes",
            Computadores: "No tiene",
            Proyector: "Sí",
            Tablero: "Acrílico",
            "Aire acondicionado": "Sí",
            Horario: "7:00 AM - 9:00 PM",
          },
        },
        {
          nombre: "Aula 403",
          descripcion: {
            Capacidad: "40 estudiantes",
            Computadores: "No tiene",
            Proyector: "Sí",
            Tablero: "Digital interactivo",
            "Aire acondicionado": "Sí",
            Horario: "7:00 AM - 9:00 PM",
          },
        },
      ],
    }
  
    // Función para mostrar los salones del bloque seleccionado
    function mostrarSalones(bloque) {
      // Limpiar el contenedor
      salonesContainer.innerHTML = ""
  
      // Obtener los salones del bloque seleccionado
      const salones = salonesPorBloque[bloque]
  
      // Crear y agregar los botones de salones
      salones.forEach((salon) => {
        const salonButton = document.createElement("button")
        salonButton.className = "salon-button"
        salonButton.textContent = salon.nombre
  
        // Agregar evento click para seleccionar el salón y mostrar el modal
        salonButton.addEventListener("click", function () {
          // Remover la clase selected de todos los botones
          document.querySelectorAll(".salon-button").forEach((btn) => {
            btn.classList.remove("selected")
          })
  
          // Agregar la clase selected al botón clickeado
          this.classList.add("selected")
  
          // Mostrar información en el modal
          mostrarInformacionSalon(salon)
        })
  
        salonesContainer.appendChild(salonButton)
      })
    }
  
    // Función para mostrar la información del salón en el modal
    function mostrarInformacionSalon(salon) {
      modalTitle.textContent = salon.nombre
  
      // Limpiar la descripción anterior
      modalDescription.innerHTML = ""
  
      // Crear elementos para cada detalle de la descripción
      for (const [clave, valor] of Object.entries(salon.descripcion)) {
        const infoItem = document.createElement("div")
        infoItem.className = "info-item"
  
        const infoLabel = document.createElement("div")
        infoLabel.className = "info-label"
        infoLabel.textContent = clave + ":"
  
        const infoValue = document.createElement("div")
        infoValue.className = "info-value"
        infoValue.textContent = valor
  
        infoItem.appendChild(infoLabel)
        infoItem.appendChild(infoValue)
  
        modalDescription.appendChild(infoItem)
      }
  
      // Mostrar el modal
      modal.style.display = "block"
    }
  
    // Cerrar el modal cuando se hace clic en la X
    closeButton.addEventListener("click", () => {
      modal.style.display = "none"
    })
  
    // Cerrar el modal cuando se hace clic fuera del contenido
    window.addEventListener("click", (event) => {
      if (event.target === modal) {
        modal.style.display = "none"
      }
    })
  
    // Mostrar los salones iniciales
    mostrarSalones("A")
  
    // Actualizar los salones cuando cambie el bloque seleccionado
    bloqueSelect.addEventListener("change", function () {
      mostrarSalones(this.value)
    })
  })