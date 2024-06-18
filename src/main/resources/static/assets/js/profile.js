document.addEventListener('DOMContentLoaded', (event) => {
    const form = document.getElementById('nombreForm');
    const mensaje = document.getElementById('mensaje');

    form.addEventListener('submit', function(event) {
        event.preventDefault(); // Evitar el envío normal del formulario

        const formData = new FormData(form);
        const data = new URLSearchParams(formData);

        fetch(form.getAttribute('action'), {
            method: 'POST',
            body: data,
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            }
        })
        .then(response => response.text())
        .then(text => {
            mensaje.textContent = text;
            mensaje.style.display = 'block';
            setTimeout(() => {
                mensaje.style.display = 'none';
            }, 3000);
        })
        .catch(error => {
            console.error('Error:', error);
            mensaje.textContent = 'Error al actualizar el nombre de usuario.';
            mensaje.style.display = 'block';
            setTimeout(() => {
                mensaje.style.display = 'none';
            }, 3000);
        });
    });
});
