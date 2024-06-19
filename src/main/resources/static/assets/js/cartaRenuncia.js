crearCardsRenunce() //evento click chatcito
function crearCardsRenunce(){

	var objData = new FormData();
	objData.append("verificacion","si")

	fetch('/cartaRenuncia/cards',{
		method:"POST",
		body:objData
	}).then(response => response.json()).catch(error => {
		console.log(error)
	}).then(response => {
		if (response["codigo"] == "200") {

		var cardContainer2 = document.getElementById("cardContainer2")
		
		response["informacion"].forEach(function(item,index){
			
			
			
			var card = document.createElement("a")
			console.log(item);
			card.href = "http://localhost:8080/cartaRenuncia/" + item.id 
			card.textContent = item.letterName;


			cardContainer2.appendChild(card)
		});

		}
	})

}