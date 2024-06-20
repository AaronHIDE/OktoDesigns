document.addEventListener('DOMContentLoaded', (event) => {
    const canvas = document.getElementById('canvas');
    const ctx = canvas.getContext('2d');
    const clearButton = document.getElementById('clear');
    const downloadButton = document.getElementById('download');

    let drawing = false;

    // Función para iniciar el dibujo
    const startDrawing = (event) => {
        drawing = true;
        draw(event);
    };

    // Función para detener el dibujo
    const stopDrawing = () => {
        drawing = false;
        ctx.beginPath();
    };

    // Función para dibujar en el canvas
    const draw = (event) => {
        if (!drawing) return;

        ctx.lineWidth = 2;
        ctx.lineCap = 'round';

        ctx.lineTo(event.clientX - canvas.offsetLeft, event.clientY - canvas.offsetTop);
        ctx.stroke();
        ctx.beginPath();
        ctx.moveTo(event.clientX - canvas.offsetLeft, event.clientY - canvas.offsetTop);
    };

    // Eventos del mouse
    canvas.addEventListener('mousedown', startDrawing);
    canvas.addEventListener('mouseup', stopDrawing);
    canvas.addEventListener('mousemove', draw);

    // Botón para borrar el canvas
    clearButton.addEventListener('click', () => {
        ctx.clearRect(0, 0, canvas.width, canvas.height);
    });

    // Botón para descargar la imagen del canvas
    downloadButton.addEventListener('click', () => {
        const link = document.createElement('a');
        link.download = 'firma.png';
        link.href = canvas.toDataURL('image/png');
        link.click();
    });
});

