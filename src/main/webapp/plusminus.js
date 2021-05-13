var url = "ws://" + window.location.host + "/hpda";

let subirPlusMinus = function(datos_raw) {
	const info = {
		type: 'plusminus',
		id : "J27_Cisne29-25BMGuadalajara",
		player1 : datos_raw[0]['Player'],
		played1 : datos_raw[0]['Played'],
		PMI1 : datos_raw[0]['PMI'],
		PMB1 : datos_raw[0]['PMB'],
		ataque1 : datos_raw[0]['AttackPlusMinus'],
		defensa1 : datos_raw[0]['DefPlusMinus'],
		player2 : datos_raw[1]['Player'],
		played2 : datos_raw[1]['Played'],
		PMI2 : datos_raw[1]['PMI'],
		PMB2 : datos_raw[1]['PMB'],
		ataque2 : datos_raw[1]['AttackPlusMinus'],
		defensa2 : datos_raw[1]['DefPlusMinus'],
		player3 : datos_raw[2]['Player'],
		played3 : datos_raw[2]['Played'],
		PMI3 : datos_raw[2]['PMI'],
		PMB3 : datos_raw[2]['PMB'],
		ataque3 : datos_raw[2]['AttackPlusMinus'],
		defensa3 : datos_raw[2]['DefPlusMinus'],
		player4 : datos_raw[3]['Player'],
		played4 : datos_raw[3]['Played'],
		PMI4 : datos_raw[3]['PMI'],
		PMB4 : datos_raw[3]['PMB'],
		ataque4 : datos_raw[3]['AttackPlusMinus'],
		defensa4 : datos_raw[3]['DefPlusMinus'],
		player5 : datos_raw[4]['Player'],
		played5 : datos_raw[4]['Played'],
		PMI5 : datos_raw[4]['PMI'],
		PMB5 : datos_raw[4]['PMB'],
		ataque5 : datos_raw[4]['AttackPlusMinus'],
		defensa5 : datos_raw[4]['DefPlusMinus'],
		player6 : datos_raw[5]['Player'],
		played6 : datos_raw[5]['Played'],
		PMI6 : datos_raw[5]['PMI'],
		PMB6 : datos_raw[5]['PMB'],
		ataque6 : datos_raw[5]['AttackPlusMinus'],
		defensa6 : datos_raw[5]['DefPlusMinus'],
		player7 : datos_raw[6]['Player'],
		played7 : datos_raw[6]['Played'],
		PMI7 : datos_raw[6]['PMI'],
		PMB7 : datos_raw[6]['PMB'],
		ataque7 : datos_raw[6]['AttackPlusMinus'],
		defensa7 : datos_raw[6]['DefPlusMinus'],
		player8 : datos_raw[7]['Player'],
		played8 : datos_raw[7]['Played'],
		PMI8 : datos_raw[7]['PMI'],
		PMB8 : datos_raw[7]['PMB'],
		ataque8 : datos_raw[7]['AttackPlusMinus'],
		defensa8 : datos_raw[7]['DefPlusMinus'],
		player9 : datos_raw[8]['Player'],
		played9 : datos_raw[8]['Played'],
		PMI9 : datos_raw[8]['PMI'],
		PMB9 : datos_raw[8]['PMB'],
		ataque9 : datos_raw[8]['AttackPlusMinus'],
		defensa9 : datos_raw[8]['DefPlusMinus'],
		player10 : datos_raw[9]['Player'],
		played10 : datos_raw[9]['Played'],
		PMI10 : datos_raw[9]['PMI'],
		PMB10 : datos_raw[9]['PMB'],
		ataque10 : datos_raw[9]['AttackPlusMinus'],
		defensa10 : datos_raw[9]['DefPlusMinus'],
		player11 : datos_raw[10]['Player'],
		played11 : datos_raw[10]['Played'],
		PMI11 : datos_raw[10]['PMI'],
		PMB11 : datos_raw[10]['PMB'],
		ataque11 : datos_raw[10]['AttackPlusMinus'],
		defensa11 : datos_raw[10]['DefPlusMinus'],
		player12 : datos_raw[11]['Player'],
		played12 : datos_raw[11]['Played'],
		PMI12 : datos_raw[11]['PMI'],
		PMB12 : datos_raw[11]['PMB'],
		ataque12 : datos_raw[11]['AttackPlusMinus'],
		defensa12 : datos_raw[11]['DefPlusMinus'],
		player13 : datos_raw[12]['Player'],
		played13 : datos_raw[12]['Played'],
		PMI13 : datos_raw[12]['PMI'],
		PMB13 : datos_raw[12]['PMB'],
		ataque13 : datos_raw[12]['AttackPlusMinus'],
		defensa13 : datos_raw[12]['DefPlusMinus'],
		player14 : datos_raw[13]['Player'],
		played14 : datos_raw[13]['Played'],
		PMI14 : datos_raw[13]['PMI'],
		PMB14 : datos_raw[13]['PMB'],
		ataque14 : datos_raw[13]['AttackPlusMinus'],
		defensa14 : datos_raw[13]['DefPlusMinus'],
		player15 : datos_raw[14]['Player'],
		played15 : datos_raw[14]['Played'],
		PMI15 : datos_raw[14]['PMI'],
		PMB15 : datos_raw[14]['PMB'],
		ataque15 : datos_raw[14]['AttackPlusMinus'],
		defensa15 : datos_raw[14]['DefPlusMinus']
	};
	const data = {
		data: JSON.stringify(info),
		url: 'plusminus',
		type: 'POST',
		contentType: 'application/json'
	};
	$.ajax(data);
};

$("#subirArchivo").on("change", function(e){
    var reader = new FileReader();
    reader.readAsArrayBuffer(e.target.files[0]);
  	reader.onload = function(e) {
        var data = new Uint8Array(reader.result);
        var wb = XLSX.read(data,{type:'array'});
        var hojaName = wb.SheetNames[0];
        const datos_raw = XLSX.utils.sheet_to_json(wb.Sheets[hojaName]);
        console.log(datos_raw);
		document.getElementById('id').innerHTML = "J27_Cisne29-25BMGuadalajara";
		// Jugador 1
		document.getElementById('player1').innerHTML = datos_raw[0]['Player'];
		document.getElementById('played1').innerHTML = datos_raw[0]['Played'];
		document.getElementById('PMI1').innerHTML = datos_raw[0]['PMI'];
		document.getElementById('PMB1').innerHTML = datos_raw[0]['PMB'];
		document.getElementById('ataque1').innerHTML = datos_raw[0]['AttackPlusMinus'];
		document.getElementById('defensa1').innerHTML = datos_raw[0]['DefPlusMinus'];
		// Jugador 2
		document.getElementById('player2').innerHTML = datos_raw[1]['Player'];
		document.getElementById('played2').innerHTML = datos_raw[1]['Played'];
		document.getElementById('PMI2').innerHTML = datos_raw[1]['PMI'];
		document.getElementById('PMB2').innerHTML = datos_raw[1]['PMB'];
		document.getElementById('ataque2').innerHTML = datos_raw[1]['AttackPlusMinus'];
		document.getElementById('defensa2').innerHTML = datos_raw[1]['DefPlusMinus'];
		// Jugador 3
		document.getElementById('player3').innerHTML = datos_raw[2]['Player'];
		document.getElementById('played3').innerHTML = datos_raw[2]['Played'];
		document.getElementById('PMI3').innerHTML = datos_raw[2]['PMI'];
		document.getElementById('PMB3').innerHTML = datos_raw[2]['PMB'];
		document.getElementById('ataque3').innerHTML = datos_raw[2]['AttackPlusMinus'];
		document.getElementById('defensa3').innerHTML = datos_raw[2]['DefPlusMinus'];
		// Jugador 4
		document.getElementById('player4').innerHTML = datos_raw[3]['Player'];
		document.getElementById('played4').innerHTML = datos_raw[3]['Played'];
		document.getElementById('PMI4').innerHTML = datos_raw[3]['PMI'];
		document.getElementById('PMB4').innerHTML = datos_raw[3]['PMB'];
		document.getElementById('ataque4').innerHTML = datos_raw[3]['AttackPlusMinus'];
		document.getElementById('defensa4').innerHTML = datos_raw[3]['DefPlusMinus'];
		// Jugador 5
		document.getElementById('player5').innerHTML = datos_raw[4]['Player'];
		document.getElementById('played5').innerHTML = datos_raw[4]['Played'];
		document.getElementById('PMI5').innerHTML = datos_raw[4]['PMI'];
		document.getElementById('PMB5').innerHTML = datos_raw[4]['PMB'];
		document.getElementById('ataque5').innerHTML = datos_raw[4]['AttackPlusMinus'];
		document.getElementById('defensa5').innerHTML = datos_raw[4]['DefPlusMinus'];
		// Jugador 6
		document.getElementById('player6').innerHTML = datos_raw[5]['Player'];
		document.getElementById('played6').innerHTML = datos_raw[5]['Played'];
		document.getElementById('PMI6').innerHTML = datos_raw[5]['PMI'];
		document.getElementById('PMB6').innerHTML = datos_raw[5]['PMB'];
		document.getElementById('ataque6').innerHTML = datos_raw[5]['AttackPlusMinus'];
		document.getElementById('defensa6').innerHTML = datos_raw[5]['DefPlusMinus'];
		// Jugador 7
		document.getElementById('player7').innerHTML = datos_raw[6]['Player'];
		document.getElementById('played7').innerHTML = datos_raw[6]['Played'];
		document.getElementById('PMI7').innerHTML = datos_raw[6]['PMI'];
		document.getElementById('PMB7').innerHTML = datos_raw[6]['PMB'];
		document.getElementById('ataque7').innerHTML = datos_raw[6]['AttackPlusMinus'];
		document.getElementById('defensa7').innerHTML = datos_raw[6]['DefPlusMinus'];
		// Jugador 8
		document.getElementById('player8').innerHTML = datos_raw[7]['Player'];
		document.getElementById('played8').innerHTML = datos_raw[7]['Played'];
		document.getElementById('PMI8').innerHTML = datos_raw[7]['PMI'];
		document.getElementById('PMB8').innerHTML = datos_raw[7]['PMB'];
		document.getElementById('ataque8').innerHTML = datos_raw[7]['AttackPlusMinus'];
		document.getElementById('defensa8').innerHTML = datos_raw[7]['DefPlusMinus'];
		// Jugador 9
		document.getElementById('player9').innerHTML = datos_raw[8]['Player'];
		document.getElementById('played9').innerHTML = datos_raw[8]['Played'];
		document.getElementById('PMI9').innerHTML = datos_raw[8]['PMI'];
		document.getElementById('PMB9').innerHTML = datos_raw[8]['PMB'];
		document.getElementById('ataque9').innerHTML = datos_raw[8]['AttackPlusMinus'];
		document.getElementById('defensa9').innerHTML = datos_raw[8]['DefPlusMinus'];
		// Jugador 10
		document.getElementById('player10').innerHTML = datos_raw[9]['Player'];
		document.getElementById('played10').innerHTML = datos_raw[9]['Played'];
		document.getElementById('PMI10').innerHTML = datos_raw[9]['PMI'];
		document.getElementById('PMB10').innerHTML = datos_raw[9]['PMB'];
		document.getElementById('ataque10').innerHTML = datos_raw[9]['AttackPlusMinus'];
		document.getElementById('defensa10').innerHTML = datos_raw[9]['DefPlusMinus'];	
		// Jugador 11
		document.getElementById('player11').innerHTML = datos_raw[10]['Player'];
		document.getElementById('played11').innerHTML = datos_raw[10]['Played'];
		document.getElementById('PMI11').innerHTML = datos_raw[10]['PMI'];
		document.getElementById('PMB11').innerHTML = datos_raw[10]['PMB'];
		document.getElementById('ataque11').innerHTML = datos_raw[10]['AttackPlusMinus'];
		document.getElementById('defensa11').innerHTML = datos_raw[10]['DefPlusMinus'];
		// Jugador 12
		document.getElementById('player12').innerHTML = datos_raw[11]['Player'];
		document.getElementById('played12').innerHTML = datos_raw[11]['Played'];
		document.getElementById('PMI12').innerHTML = datos_raw[11]['PMI'];
		document.getElementById('PMB12').innerHTML = datos_raw[11]['PMB'];
		document.getElementById('ataque12').innerHTML = datos_raw[11]['AttackPlusMinus'];
		document.getElementById('defensa12').innerHTML = datos_raw[11]['DefPlusMinus'];
		// Jugador 13
		document.getElementById('player13').innerHTML = datos_raw[12]['Player'];
		document.getElementById('played13').innerHTML = datos_raw[12]['Played'];
		document.getElementById('PMI13').innerHTML = datos_raw[12]['PMI'];
		document.getElementById('PMB13').innerHTML = datos_raw[12]['PMB'];
		document.getElementById('ataque13').innerHTML = datos_raw[12]['AttackPlusMinus'];
		document.getElementById('defensa13').innerHTML = datos_raw[12]['DefPlusMinus'];
		// Jugador 14
		document.getElementById('player14').innerHTML = datos_raw[13]['Player'];
		document.getElementById('played14').innerHTML = datos_raw[13]['Played'];
		document.getElementById('PMI14').innerHTML = datos_raw[13]['PMI'];
		document.getElementById('PMB14').innerHTML = datos_raw[13]['PMB'];
		document.getElementById('ataque14').innerHTML = datos_raw[13]['AttackPlusMinus'];
		document.getElementById('defensa14').innerHTML = datos_raw[13]['DefPlusMinus'];
		// Jugador 15
		document.getElementById('player15').innerHTML = datos_raw[14]['Player'];
		document.getElementById('played15').innerHTML = datos_raw[14]['Played'];
		document.getElementById('PMI15').innerHTML = datos_raw[14]['PMI'];
		document.getElementById('PMB15').innerHTML = datos_raw[14]['PMB'];
		document.getElementById('ataque15').innerHTML = datos_raw[14]['AttackPlusMinus'];
		document.getElementById('defensa15').innerHTML = datos_raw[14]['DefPlusMinus'];
				
		subirPlusMinus(datos_raw); // para subir el JSON a la BD		
		const datos = conversion(datos_raw); // conversion a JSON
		$.ajax({
            type: "POST",
            url: "plusminus",
            data: datos,
            dataType: 'json',
			contentType: 'application/json'
        });
	};
});

function conversion(json) {
    return json;
}
