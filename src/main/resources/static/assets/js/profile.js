document.addEventListener('DOMContentLoaded', (event) => {
    const nombreForm = document.getElementById('nombreForm');
    const passwordForm = document.getElementById('passwordForm');
    const mensaje = document.getElementById('mensaje');

    nombreForm.addEventListener('submit', function(event) {
        event.preventDefault(); // Evitar el envío normal del formulario

        const formData = new FormData(nombreForm);
        const data = new URLSearchParams();
        for (const pair of formData) {
            data.append(pair[0], pair[1]);
        }

        fetch('/cambiar-nombre', {
            method: 'POST',
            body: data,
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            }
        })
        .then(response => response.text())
        .then(text => {
            mensaje.textContent = text;
            mensaje.className = 'alert alert-success';
            mensaje.style.display = 'block';
            setTimeout(() => {
                mensaje.style.display = 'none';
            }, 3000);
        })
        .catch(error => {
            console.error('Error:', error);
            mensaje.textContent = 'Error al actualizar el nombre de usuario.';
            mensaje.className = 'alert alert-danger';
            mensaje.style.display = 'block';
            setTimeout(() => {
                mensaje.style.display = 'none';
            }, 3000);
        });
    });

    passwordForm.addEventListener('submit', function(event) {
        event.preventDefault(); // Evitar el envío normal del formulario

        const currentPassword = document.getElementById('currentPassword').value;
        const newPassword = document.getElementById('newPassword').value;
        const confirmPassword = document.getElementById('confirmPassword').value;

        if (newPassword !== confirmPassword) {
            mensaje.textContent = 'Las contraseñas no coinciden.';
            mensaje.className = 'alert alert-danger';
            mensaje.style.display = 'block';
            setTimeout(() => {
                mensaje.style.display = 'none';
            }, 3000);
            return;
        }

        const formData = new FormData(passwordForm);
        const data = new URLSearchParams();
        for (const pair of formData) {
            data.append(pair[0], pair[1]);
        }

        fetch('/cambiar-contrasena', {
            method: 'POST',
            body: data,
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            }
        })
        .then(response => response.text())
        .then(text => {
            mensaje.textContent = text;
            mensaje.className = 'alert alert-success';
            mensaje.style.display = 'block';
            setTimeout(() => {
                mensaje.style.display = 'none';
            }, 3000);
        })
        .catch(error => {
            console.error('Error:', error);
            mensaje.textContent = 'Error al actualizar la contraseña.';
            mensaje.className = 'alert alert-danger';
            mensaje.style.display = 'block';
            setTimeout(() => {
                mensaje.style.display = 'none';
            }, 3000);
        });
    });
});
