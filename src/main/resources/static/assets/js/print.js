function imprimir() {
    var botonImprimir = document.querySelector('.btn.btn-danger');
    botonEnviar = document.querySelector('.btn.btn-info');
    navbar = document.querySelector('#header');
    footer = document.querySelector('#footer');
    botonImprimir.style.display = 'none';
    botonEnviar.style.display = 'none';
    navbar.style.display = 'none';
    footer.style.display = 'none';
    window.print();
    botonImprimir.style.display = 'block'; // Restaura la visualización del botón después de imprimir
    botonEnviar.style.display = 'block'; // Restaura la visualización del botón después de imprimir
    navbar.style.display = 'block';
    footer.style.display = 'block';
}