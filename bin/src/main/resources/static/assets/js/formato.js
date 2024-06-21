document.addEventListener("DOMContentLoaded", function() {
    const form = document.getElementById("formato");
    form.addEventListener("submit", function(event) {
        event.preventDefault();
        
        const formData = new FormData(form);
        const jsonObject = {};
        formData.forEach((value, key) => {
            jsonObject[key] = value;
        });

        console.log("Datos del formulario:", jsonObject);

        fetch(form.action, {
            method: form.method,
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(jsonObject)
        })
        .then(response => {
            if (!response.ok) {
                throw new Error('Error en la respuesta del servidor');
            }
            return response.json();
        })
        .then(data => {
            console.log("Datos recibidos:", data);
            if (data) {
                const formato = data;
                const cardContainer = document.getElementById("containerSave1");
                const card = document.createElement("div");
                card.className = "cardSave1";
                card.innerHTML = `
                    <h6>${formato.nombre}</h6>
                    <p>${formato.descripcion}</p>
                `;
                cardContainer.appendChild(card);
                form.reset();
            } else {
                console.error("La respuesta no contiene datos");
            }
        })
        .catch(error => console.error("Error:", error));
    });
});
