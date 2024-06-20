// Función para deshabilitar la tarjeta y bloquear acceso directo
function deshabilitarTarjeta() {
	var card = document.getElementById('miCard');
	card.classList.add('card-blocked');  // Añade la clase 'card-blocked' para deshabilitar la tarjeta
	card.setAttribute('data-disabled', 'true'); // Agrega un atributo 'data-disabled' para indicar que la tarjeta está deshabilitada

	// Verificar si se accede directamente a la URL de la tarjeta
	if (window.location.pathname.includes('miCard')) {
		// Si se intenta acceder directamente a la tarjeta deshabilitada, redirigir a la página principal u otra página apropiada
		window.location.href = '/';  // Cambiar '/ruta-a-tu-pagina' por la URL a la que quieres redirigir
	}
}

// Función para habilitar la tarjeta después de un pago exitoso
function habilitarTarjeta() {
	var card = document.getElementById('miCard');
	card.classList.remove('card-blocked', 'formatos');  // Remover la clase 'card-blocked' para habilitar la tarjeta
	card.removeAttribute('data-disabled'); // Remover el atributo 'data-disabled'
}

// Simulación de un pago exitoso (esto debería ser manejado por la lógica de Stripe o tu backend)
function simularPagoExitoso() {
	// Simulación de un tiempo de espera antes de habilitar la tarjeta (para emular una solicitud a un servidor)
	setTimeout(function() {
		// Llamar a la función para habilitar la tarjeta después de un tiempo de espera simulado
		habilitarTarjeta();
		alert('Pago completado con éxito. Ahora puedes disfrutar de nuestros formatos.');
	}, 2000); // Tiempo de espera simulado de 2 segundos (2000 milisegundos)
}

// Llamada a la función para deshabilitar la tarjeta al cargar la página
document.addEventListener('DOMContentLoaded', function() {
	deshabilitarTarjeta();


});