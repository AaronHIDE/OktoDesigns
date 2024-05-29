
// funcion para que se seeleccione una imagen y se vea en vista previa
// archivo cartaRefPersonal lineas 155 a 163
const imageInput = document.getElementById('image-input');
const imagePreview = document.querySelector('.image-preview img');

imageInput.addEventListener('change', (e) => {
	const file = imageInput.files[0];
	const reader = new FileReader();

	reader.onload = (e) => {
		imagePreview.src = e.target.result;
	};

	reader.readAsDataURL(file);
});