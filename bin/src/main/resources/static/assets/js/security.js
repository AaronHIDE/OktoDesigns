document.getElementById('updatePasswordForm').addEventListener('submit', function(event) {
    event.preventDefault();
    
    const currentPassword = document.getElementById('currentPassword').value;
    const newPassword = document.getElementById('newPassword').value;
    const confirmNewPassword = document.getElementById('confirmNewPassword').value;

    if (newPassword !== confirmNewPassword) {
        alert('Las nuevas contraseñas no coinciden. Por favor, verifica y vuelve a intentarlo.');
        return;
    }

    // Aquí puedes añadir la lógica para enviar los datos al servidor
    // Por ejemplo, usando fetch() o axios.post()

    alert('Contraseña actualizada exitosamente.');
});
