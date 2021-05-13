var url = "ws://" + window.location.host + "/hpda";

let subirScoring = function(datos_raw) {
	const info = {
		type: 'scoring',
		id : datos_raw[0]['Match'],
		jugador1: datos_raw[0]['Player'],
		equipo1: datos_raw[0]['Team'],
		score1: datos_raw[0]['Score'],
		jugador2: datos_raw[1]['Player'],
		equipo2: datos_raw[1]['Team'],
		score2: datos_raw[1]['Score'],
		jugador3: datos_raw[2]['Player'],
		equipo3: datos_raw[2]['Team'],
		score3: datos_raw[2]['Score'],
		jugador4: datos_raw[3]['Player'],
		equipo4: datos_raw[3]['Team'],
		score4: datos_raw[3]['Score'],
		jugador5: datos_raw[4]['Player'],
		equipo5: datos_raw[4]['Team'],
		score5: datos_raw[4]['Score'],
		jugador6: datos_raw[5]['Player'],
		equipo6: datos_raw[5]['Team'],
		score6: datos_raw[5]['Score'],
		jugador7: datos_raw[6]['Player'],
		equipo7: datos_raw[6]['Team'],
		score7: datos_raw[6]['Score'],
		jugador8: datos_raw[7]['Player'],
		equipo8: datos_raw[7]['Team'],
		score8: datos_raw[7]['Score'],
		jugador9: datos_raw[8]['Player'],
		equipo9: datos_raw[8]['Team'],
		score9: datos_raw[8]['Score'],
		jugador10: datos_raw[9]['Player'],
		equipo10: datos_raw[9]['Team'],
		score10: datos_raw[9]['Score'],
		jugador11: datos_raw[10]['Player'],
		equipo11: datos_raw[10]['Team'],
		score11: datos_raw[10]['Score'],
	    jugador12: datos_raw[11]['Player'],
		equipo12: datos_raw[11]['Team'],
		score12: datos_raw[11]['Score'],
		jugador13: datos_raw[12]['Player'],
		equipo13: datos_raw[12]['Team'],
		score13: datos_raw[12]['Score'],
		jugador14: datos_raw[13]['Player'],
		equipo14: datos_raw[13]['Team'],
		score14: datos_raw[13]['Score'],
		jugador15: datos_raw[14]['Player'],
		equipo15: datos_raw[14]['Team'],
		score15: datos_raw[14]['Score'],
		jugador16: datos_raw[15]['Player'],
		equipo16: datos_raw[15]['Team'],
		score16: datos_raw[15]['Score'],
		jugador17: datos_raw[16]['Player'],
		equipo17: datos_raw[16]['Team'],
		score17: datos_raw[16]['Score'],
		jugador18: datos_raw[17]['Player'],
		equipo18: datos_raw[17]['Team'],
		score18: datos_raw[17]['Score'],
		jugador19: datos_raw[18]['Player'],
		equipo19: datos_raw[18]['Team'],
		score19: datos_raw[18]['Score'],
		jugador20: datos_raw[19]['Player'],
		equipo20: datos_raw[19]['Team'],
		score20: datos_raw[19]['Score'],
		jugador21: datos_raw[20]['Player'],
		equipo21: datos_raw[20]['Team'],
		score21: datos_raw[20]['Score'],
		jugador22: datos_raw[21]['Player'],
		equipo22: datos_raw[21]['Team'],
		score22: datos_raw[21]['Score'],
		jugador23: datos_raw[22]['Player'],
		equipo23: datos_raw[22]['Team'],
		score23: datos_raw[22]['Score'],
		jugador24: datos_raw[23]['Player'],
		equipo24: datos_raw[23]['Team'],
		score24: datos_raw[23]['Score'],
		jugador25: datos_raw[24]['Player'],
		equipo25: datos_raw[24]['Team'],
		score25: datos_raw[24]['Score'],
		jugador26: datos_raw[25]['Player'],
		equipo26: datos_raw[25]['Team'],
		score26: datos_raw[25]['Score'],
		jugador27: datos_raw[26]['Player'],
		equipo27: datos_raw[26]['Team'],
		score27: datos_raw[26]['Score'],
		jugador28: datos_raw[27]['Player'],
		equipo28: datos_raw[27]['Team'],
		score28: datos_raw[27]['Score']
	};
	const data = {
		data: JSON.stringify(info),
		url: 'scoring',
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
		document.getElementById('id').innerHTML = datos_raw[0]['Match'];
		document.getElementById('jugador1').innerHTML = datos_raw[0]['Player'];
		document.getElementById('equipo1').innerHTML = datos_raw[0]['Team'];
		document.getElementById('score1').innerHTML = datos_raw[0]['Score'];
		document.getElementById('jugador2').innerHTML = datos_raw[1]['Player'];
		document.getElementById('equipo2').innerHTML = datos_raw[1]['Team'];
		document.getElementById('score2').innerHTML = datos_raw[1]['Score'];
		document.getElementById('jugador3').innerHTML = datos_raw[2]['Player'];
		document.getElementById('equipo3').innerHTML = datos_raw[2]['Team'];
		document.getElementById('score3').innerHTML = datos_raw[2]['Score'];
		document.getElementById('jugador4').innerHTML = datos_raw[3]['Player'];
		document.getElementById('equipo4').innerHTML = datos_raw[3]['Team'];
		document.getElementById('score4').innerHTML = datos_raw[3]['Score'];
		document.getElementById('jugador5').innerHTML = datos_raw[4]['Player'];
		document.getElementById('equipo5').innerHTML = datos_raw[4]['Team'];
		document.getElementById('score5').innerHTML = datos_raw[4]['Score'];
		document.getElementById('jugador6').innerHTML = datos_raw[5]['Player'];
		document.getElementById('equipo6').innerHTML = datos_raw[5]['Team'];
		document.getElementById('score6').innerHTML = datos_raw[5]['Score'];
		document.getElementById('jugador7').innerHTML = datos_raw[6]['Player'];
		document.getElementById('equipo7').innerHTML = datos_raw[6]['Team'];
		document.getElementById('score7').innerHTML = datos_raw[6]['Score'];
		document.getElementById('jugador8').innerHTML = datos_raw[7]['Player'];
		document.getElementById('equipo8').innerHTML = datos_raw[7]['Team'];
		document.getElementById('score8').innerHTML = datos_raw[7]['Score'];
		document.getElementById('jugador9').innerHTML = datos_raw[8]['Player'];
		document.getElementById('equipo9').innerHTML = datos_raw[8]['Team'];
		document.getElementById('score9').innerHTML = datos_raw[8]['Score'];
		document.getElementById('jugador10').innerHTML = datos_raw[9]['Player'];
		document.getElementById('equipo10').innerHTML = datos_raw[9]['Team'];
		document.getElementById('score10').innerHTML = datos_raw[9]['Score'];
		document.getElementById('jugador11').innerHTML = datos_raw[10]['Player'];
		document.getElementById('equipo11').innerHTML = datos_raw[10]['Team'];
		document.getElementById('score11').innerHTML = datos_raw[10]['Score'];
		document.getElementById('jugador12').innerHTML = datos_raw[11]['Player'];
		document.getElementById('equipo12').innerHTML = datos_raw[11]['Team'];
		document.getElementById('score12').innerHTML = datos_raw[11]['Score'];
		document.getElementById('jugador13').innerHTML = datos_raw[12]['Player'];
		document.getElementById('equipo13').innerHTML = datos_raw[12]['Team'];
		document.getElementById('score13').innerHTML = datos_raw[12]['Score'];
		document.getElementById('jugador14').innerHTML = datos_raw[13]['Player'];
		document.getElementById('equipo14').innerHTML = datos_raw[13]['Team'];
		document.getElementById('score14').innerHTML = datos_raw[13]['Score'];
		document.getElementById('jugador15').innerHTML = datos_raw[14]['Player'];
		document.getElementById('equipo15').innerHTML = datos_raw[14]['Team'];
		document.getElementById('score15').innerHTML = datos_raw[14]['Score'];
		document.getElementById('jugador16').innerHTML = datos_raw[15]['Player'];
		document.getElementById('equipo16').innerHTML = datos_raw[15]['Team'];
		document.getElementById('score16').innerHTML = datos_raw[15]['Score'];
		document.getElementById('jugador17').innerHTML = datos_raw[16]['Player'];
		document.getElementById('equipo17').innerHTML = datos_raw[16]['Team'];
		document.getElementById('score17').innerHTML = datos_raw[16]['Score'];
		document.getElementById('jugador18').innerHTML = datos_raw[17]['Player'];
		document.getElementById('equipo18').innerHTML = datos_raw[17]['Team'];
		document.getElementById('score18').innerHTML = datos_raw[17]['Score'];
		document.getElementById('jugador19').innerHTML = datos_raw[18]['Player'];
		document.getElementById('equipo19').innerHTML = datos_raw[18]['Team'];
		document.getElementById('score19').innerHTML = datos_raw[18]['Score'];
		document.getElementById('jugador20').innerHTML = datos_raw[19]['Player'];
		document.getElementById('equipo20').innerHTML = datos_raw[19]['Team'];
		document.getElementById('score20').innerHTML = datos_raw[19]['Score'];
		document.getElementById('jugador21').innerHTML = datos_raw[20]['Player'];
		document.getElementById('equipo21').innerHTML = datos_raw[20]['Team'];
		document.getElementById('score21').innerHTML = datos_raw[20]['Score'];
		document.getElementById('jugador22').innerHTML = datos_raw[21]['Player'];
		document.getElementById('equipo22').innerHTML = datos_raw[21]['Team'];
		document.getElementById('score22').innerHTML = datos_raw[21]['Score'];
		document.getElementById('jugador23').innerHTML = datos_raw[22]['Player'];
		document.getElementById('equipo23').innerHTML = datos_raw[22]['Team'];
		document.getElementById('score23').innerHTML = datos_raw[22]['Score'];
		document.getElementById('jugador24').innerHTML = datos_raw[23]['Player'];
		document.getElementById('equipo24').innerHTML = datos_raw[23]['Team'];
		document.getElementById('score24').innerHTML = datos_raw[23]['Score'];
		document.getElementById('jugador25').innerHTML = datos_raw[24]['Player'];
		document.getElementById('equipo25').innerHTML = datos_raw[24]['Team'];
		document.getElementById('score25').innerHTML = datos_raw[24]['Score'];
		document.getElementById('jugador26').innerHTML = datos_raw[25]['Player'];
		document.getElementById('equipo26').innerHTML = datos_raw[25]['Team'];
		document.getElementById('score26').innerHTML = datos_raw[25]['Score'];
		document.getElementById('jugador27').innerHTML = datos_raw[26]['Player'];
		document.getElementById('equipo27').innerHTML = datos_raw[26]['Team'];
		document.getElementById('score27').innerHTML = datos_raw[26]['Score'];
		document.getElementById('jugador28').innerHTML = datos_raw[27]['Player'];
		document.getElementById('equipo28').innerHTML = datos_raw[27]['Team'];
		document.getElementById('score28').innerHTML = datos_raw[27]['Score'];
		/*	2º FORMA
		var scorelist = {
 			"id" : id,
  			"jugador1" : [{
      			"nombre" : datos_raw[0]['Player'],
      			"equipo" : datos_raw[0]['Team'],
      			"score" : datos_raw[0]['Score']
    		}],
			"jugador2" : [{
				"nombre" : datos_raw[1]['Player'],
      			"equipo" : datos_raw[1]['Team'],
      			"score" : datos_raw[1]['Score']
			}]
		}
		*/
		subirScoring(datos_raw); // para subir el JSON a la BD
		var lst_scores = ordenarScores(datos_raw); // para ordenar la lista por scores
		
		var top1 = lst_scores[0];
		var nombre_top1 = top1['jugador'];
		document.getElementById('nombre_top1').innerHTML = top1['jugador'];
		var equipo_top1 = top1['equipo'];
		document.getElementById('equipo_top1').innerHTML = top1['equipo'];
		var score_top1 = top1['score'];
		document.getElementById('score_top1').innerHTML = top1['score'];

		var top2 = lst_scores[1];
		var nombre_top2 = top2['jugador'];
		document.getElementById('nombre_top2').innerHTML = top2['jugador'];
		var equipo_top2 = top2['equipo'];
		document.getElementById('equipo_top2').innerHTML = top2['equipo'];
		var score_top2 = top2['score'];
		document.getElementById('score_top2').innerHTML = top2['score'];
		
		var top3 = lst_scores[2];
		var nombre_top3 = top3['jugador'];
		document.getElementById('nombre_top3').innerHTML = top3['jugador'];
		var equipo_top3 = top3['equipo'];
		document.getElementById('equipo_top3').innerHTML = top3['equipo'];
		var score_top3 = top3['score'];
		document.getElementById('score_top3').innerHTML = top3['score'];

		var top4 = lst_scores[3];
		var nombre_top4 = top4['jugador'];
		document.getElementById('nombre_top4').innerHTML = top4['jugador'];
		var equipo_top4 = top4['equipo'];
		document.getElementById('equipo_top4').innerHTML = top4['equipo'];
		var score_top4 = top4['score'];
		document.getElementById('score_top4').innerHTML = top4['score'];
		
		var top5 = lst_scores[4];
		var nombre_top5 = top5['jugador'];
		document.getElementById('nombre_top5').innerHTML = top5['jugador'];
		var equipo_top5 = top5['equipo'];
		document.getElementById('equipo_top5').innerHTML = top5['equipo'];
		var score_top5 = top5['score'];
		document.getElementById('score_top5').innerHTML = top5['score'];
		
		var top6 = lst_scores[5];
		var nombre_top6 = top6['jugador'];
		document.getElementById('nombre_top6').innerHTML = top6['jugador'];
		var equipo_top6 = top6['equipo'];
		document.getElementById('equipo_top6').innerHTML = top6['equipo'];
		var score_top6 = top6['score'];
		document.getElementById('score_top6').innerHTML = top6['score'];
		
		var top7 = lst_scores[6];
		var nombre_top7 = top7['jugador'];
		document.getElementById('nombre_top7').innerHTML = top7['jugador'];
		var equipo_top7 = top7['equipo'];
		document.getElementById('equipo_top7').innerHTML = top7['equipo'];
		var score_top7 = top7['score'];
		document.getElementById('score_top7').innerHTML = top7['score'];
		
		const datos = conversion(datos_raw); // conversion a JSON
		$.ajax({
            type: "POST",
            url: "scoring",
            data: datos,
            dataType: 'json',
			contentType: 'application/json'
        });
	};
});

function conversion(json) {
    return json;
}

function ordenarScores(datos_raw) {
	var listaTOP = [];
	for (var i = 0; i < datos_raw.length; i++) {
	    var singleObj = {};
	    singleObj['jugador'] = datos_raw[i]['Player'];
	    singleObj['equipo'] = datos_raw[i]['Team'];
	    singleObj['score'] = datos_raw[i]['Score'];
	    listaTOP.push(singleObj);
	}	
	listaTOP.sort((a, b) => {
	    return b.score - a.score;
	});
	console.log(listaTOP);
	return listaTOP;
}