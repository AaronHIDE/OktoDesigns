crearCardsSena() //evento click chatcito
function crearCardsSena(){

	var objData = new FormData();
	objData.append("verificacion","si")

	fetch('/formatoSena/cards',{
		method:"POST",
		body:objData
	}).then(response => response.json()).catch(error => {
		console.log(error)
	}).then(response => {
		if (response["codigo"] == "200") {

		var cardContainer = document.getElementById("cardContainer")
		
		response["informacion"].forEach(function(item,index){
			
			
			
			var card = document.createElement("a")
			console.log(item);
			card.href = "http://localhost:8080/formatoSena/" + item.id 
			card.textContent = item.nombre_completo;


			cardContainer.appendChild(card)
		});

		}
	})

}


		// // $("#cardSave").html("") // convertir a js puro 
		// var dataSet = '';

			// // 	dataSet += '<h6>' +elemento[0]+ '</h6>' // estilos de la card
			// // $("#cardSave").html(dataSet) //convertir a js puro // append = html
			// // console.log(item.cargo)//verificar foreach
			// console.log(item)