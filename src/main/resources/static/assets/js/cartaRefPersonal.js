document.addEventListener("DOMContentLoaded", function() {
    const form = document.getElementById("cartaRefPersonal");
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
                const cartaRefPersonal = data;
                const cardContainer = document.getElementById("containerSave2");
                const card = document.createElement("div");
                card.className = "cardSave2";
                card.innerHTML = `
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
