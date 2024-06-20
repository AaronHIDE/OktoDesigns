document.addEventListener('DOMContentLoaded', (event) => {
    const form = document.getElementById('nombreForm');
    const mensaje = document.getElementById('mensaje');

    form.addEventListener('submit', function(event) {
        event.preventDefault(); // Evitar el envío normal del formulario

        const formData = new FormData(form);
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
});
