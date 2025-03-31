document.addEventListener("DOMContentLoaded", () => {
    // Referencias a elementos del DOM
    const currentPasswordInput = document.getElementById("current-password")
    const newPasswordInput = document.getElementById("new-password")
    const confirmPasswordInput = document.getElementById("confirm-password")
    const togglePasswordButton = document.querySelector(".toggle-password")
    const eyeIcon = document.querySelector(".eye-icon")
    const eyeOffIcon = document.querySelector(".eye-off-icon")
    const changePasswordBtn = document.getElementById("change-password-btn")
    const resetPasswordBtn = document.getElementById("reset-password-btn")
  
    // Estado para controlar la visibilidad de las contraseñas
    let passwordsVisible = false
  
    // Función para alternar la visibilidad de las contraseñas
    function togglePasswordVisibility() {
      passwordsVisible = !passwordsVisible
  
      // Cambiar el tipo de los campos de contraseña
      const inputType = passwordsVisible ? "text" : "password"
      currentPasswordInput.type = inputType
      newPasswordInput.type = inputType
      confirmPasswordInput.type = inputType
  
      // Alternar los iconos
      eyeIcon.classList.toggle("hidden")
      eyeOffIcon.classList.toggle("hidden")
    }
  
    // Función para cambiar la contraseña
    function handleChangePassword() {
      // Validar que las contraseñas nuevas coincidan
      if (newPasswordInput.value !== confirmPasswordInput.value) {
        alert("Las contraseñas nuevas no coinciden")
        return
      }
  
      // Validar que se haya ingresado la contraseña actual
      if (!currentPasswordInput.value) {
        alert("Por favor ingrese su contraseña actual")
        return
      }
  
      // Validar que se haya ingresado una nueva contraseña
      if (!newPasswordInput.value) {
        alert("Por favor ingrese una nueva contraseña")
        return
      }
  
      // Aquí iría la lógica para cambiar la contraseña en un servidor
      // Por ahora, solo mostramos un mensaje de éxito
      alert("Contraseña actualizada correctamente")
  
      // Limpiar los campos
      currentPasswordInput.value = ""
      newPasswordInput.value = ""
      confirmPasswordInput.value = ""
    }
  
    // Función para restablecer la contraseña
    function handleResetPassword() {
      // Aquí iría la lógica para solicitar un restablecimiento de contraseña
      // Por ahora, solo mostramos un mensaje
      alert("Solicitud de restablecimiento de contraseña enviada")
    }
  
    // Agregar event listeners
    togglePasswordButton.addEventListener("click", togglePasswordVisibility)
    changePasswordBtn.addEventListener("click", handleChangePassword)
    resetPasswordBtn.addEventListener("click", handleResetPassword)
  })
  
  