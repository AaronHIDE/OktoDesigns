crearCardsInformal() //evento click chatcito
function crearCardsInformal(){

	var objData = new FormData();
	objData.append("verificacion","si")

	fetch('/invitacionInformal/cards',{
		method:"POST",
		body:objData
	}).then(response => response.json()).catch(error => {
		console.log(error)
	}).then(response => {
		if (response["codigo"] == "200") {

		var cardContainer3 = document.getElementById("cardContainer3")
		
		response["informacion"].forEach(function(item,index){
			
			
			
			var card = document.createElement("a")
			console.log(item);
			card.href = "http://localhost:8080/invitacionInformal/" + item.id 
			card.textContent = item.saludo;


			cardContainer3.appendChild(card)
		});

		}
	})

}