var url = "ws://" + window.location.host + "/hpda";

let uploadexcel = function(datos_raw) {
	const info = {
		type: 'mapasRendimiento',
		id: datos_raw[0]['COL1']+'_'+datos_raw[1]['COL1']+'_'+datos_raw[0]['COL2']+datos_raw[1]['COL2'],
		equipo_local: datos_raw[0]['COL1'],
		equipo_visitante: datos_raw[1]['COL1'],
		goles_local: datos_raw[0]['COL2'],
		goles_visitante: datos_raw[1]['COL2'],
		ritmo_local: datos_raw[2]['COL4'],
		ritmo_visitante: datos_raw[2]['COL9'],
		at_posicional_local: datos_raw[3]['COL2'],
		at_posicional_visitante: datos_raw[3]['COL7'],
		contraataque_local: datos_raw[4]['COL2'],
		contraataque_visitante: datos_raw[4]['COL7'],
		saquegol_local: datos_raw[5]['COL2'],
		saquegol_visitante: datos_raw[5]['COL7'],
		perdidas_local: datos_raw[6]['COL2'],
		perdidas_visitante: datos_raw[6]['COL7'],
		superioridad_local: datos_raw[3]['COL4'],
		superioridad_visitante: datos_raw[3]['COL9'],
		paradas_local: datos_raw[4]['COL4'],
		paradas_visitante: datos_raw[4]['COL9'],
		defensa_local: datos_raw[5]['COL4'],
		defensa_visitante: datos_raw[5]['COL9'],
		ataques_local: datos_raw[6]['COL4'],
		ataques_visitante: datos_raw[6]['COL9'],
		penalti_local: datos_raw[7]['COL4'],
		penalti_visitante: datos_raw[7]['COL9'],
		gol7m_local: datos_raw[7]['COL4'],
		gol7m_visitante: datos_raw[7]['COL9'],
		a7x6_local: datos_raw[8]['COL4'],
		a7x6_visitante: datos_raw[8]['COL9'],
		db2_paradas_plocal : datos_raw[25]['COL3'],
		db2_paradas_pvisitante : datos_raw[30]['COL3'],
		db2_fuera_plocal : datos_raw[25]['COL4'],
		db2_fuera_pvisitante : datos_raw[30]['COL4'],
		db2_perdidas_plocal : datos_raw[25]['COL5'],
		db2_perdidas_pvisitante : datos_raw[30]['COL5'],
		db2_posesiones_plocal : datos_raw[25]['COL6'],
		db2_posesiones_pvisitante : datos_raw[30]['COL6'],
		db2_porceficacia_plocal : datos_raw[25]['COL7'],
		db2_porceficacia_pvisitante : datos_raw[30]['COL7'],
		db2_porclanz_plocal : datos_raw[25]['COL8'],
		db2_porclanz_pvisitante : datos_raw[30]['COL8'],
		db2_porcperdidas_plocal : datos_raw[25]['COL9'],
		db2_porcperdidas_pvisitante : datos_raw[30]['COL9'],	
		db2_paradas_clocal : datos_raw[26]['COL3'],
		db2_paradas_cvisitante : datos_raw[31]['COL3'],
		db2_fuera_clocal : datos_raw[26]['COL4'],
		db2_fuera_cvisitante : datos_raw[31]['COL4'],
		db2_perdidas_clocal : datos_raw[26]['COL5'],
		db2_perdidas_cvisitante : datos_raw[31]['COL5'],
		db2_posesiones_clocal : datos_raw[26]['COL6'],
		db2_posesiones_cvisitante : datos_raw[31]['COL6'],
		db2_porceficacia_clocal : datos_raw[26]['COL7'],
		db2_porceficacia_cvisitante : datos_raw[31]['COL7'],
		db2_porclanz_clocal : datos_raw[26]['COL8'],
		db2_porclanz_cvisitante : datos_raw[31]['COL8'],
		db2_porcperdidas_clocal : datos_raw[26]['COL9'],
		db2_porcperdidas_cvisitante : datos_raw[31]['COL9'],
		db2_paradas_slocal : datos_raw[27]['COL3'],
		db2_paradas_svisitante : datos_raw[32]['COL3'],
		db2_fuera_slocal : datos_raw[27]['COL4'],
		db2_fuera_svisitante : datos_raw[32]['COL4'],
		db2_perdidas_slocal : datos_raw[27]['COL5'],
		db2_perdidas_svisitante : datos_raw[32]['COL5'],
		db2_posesiones_slocal : datos_raw[27]['COL6'],
		db2_posesiones_svisitante : datos_raw[32]['COL6'],
		db2_porceficacia_slocal : datos_raw[27]['COL7'],
		db2_porceficacia_svisitante : datos_raw[32]['COL7'],
		db2_porclanz_slocal : datos_raw[27]['COL8'],
		db2_porclanz_svisitante : datos_raw[32]['COL8'],
		db2_porcperdidas_slocal : datos_raw[27]['COL9'],
		db2_porcperdidas_svisitante : datos_raw[32]['COL9'],
		db3_jugador1 : datos_raw[3]['COL13'],
		db3_goles1 : datos_raw[3]['COL14'],
		db3_paradas1 : datos_raw[3]['COL15'],
		db3_fuera1 : datos_raw[3]['COL16'],
		db3_perdidas1 : datos_raw[3]['COL17'],
		db3_posesiones1 : datos_raw[3]['COL18'],
		db3_eficacia1 : datos_raw[3]['COL19'],
		db3_lanz1 : datos_raw[3]['COL20'],
		db3_porcperdidas1 : datos_raw[3]['COL21'],
		db3_jugador2 : datos_raw[4]['COL13'],
		db3_goles2 : datos_raw[4]['COL14'],
		db3_paradas2 : datos_raw[4]['COL15'],
		db3_fuera2 : datos_raw[4]['COL16'],
		db3_perdidas2 : datos_raw[4]['COL17'],
		db3_posesiones2 : datos_raw[4]['COL18'],
		db3_eficacia2 : datos_raw[4]['COL19'],
		db3_lanz2 : datos_raw[4]['COL20'],
		db3_porcperdidas2 : datos_raw[4]['COL21'],
		db3_jugador3 : datos_raw[5]['COL13'],
		db3_goles3 : datos_raw[5]['COL14'],
		db3_paradas3 : datos_raw[5]['COL15'],
		db3_fuera3 : datos_raw[5]['COL16'],
		db3_perdidas3 : datos_raw[5]['COL17'],
		db3_posesiones3 : datos_raw[5]['COL18'],
		db3_eficacia3 : datos_raw[5]['COL19'],
		db3_lanz3 : datos_raw[5]['COL20'],
		db3_porcperdidas3 : datos_raw[5]['COL21'],
		db3_jugador4 : datos_raw[6]['COL13'],
		db3_goles4 : datos_raw[6]['COL14'],
		db3_paradas4 : datos_raw[6]['COL15'],
		db3_fuera4 : datos_raw[6]['COL16'],
		db3_perdidas4 : datos_raw[6]['COL17'],
		db3_posesiones4 : datos_raw[6]['COL18'],
		db3_eficacia4 : datos_raw[6]['COL19'],
		db3_lanz4 : datos_raw[6]['COL20'],
		db3_porcperdidas4 : datos_raw[6]['COL21'],
		db3_jugador5 : datos_raw[7]['COL13'],
		db3_goles5 : datos_raw[7]['COL14'],
		db3_paradas5 : datos_raw[7]['COL15'],
		db3_fuera5 : datos_raw[7]['COL16'],
		db3_perdidas5 : datos_raw[7]['COL17'],
		db3_posesiones5 : datos_raw[7]['COL18'],
		db3_eficacia5 : datos_raw[7]['COL19'],
		db3_lanz5 : datos_raw[7]['COL20'],
		db3_porcperdidas5 : datos_raw[7]['COL21'],
		db3_jugador6 : datos_raw[8]['COL13'],
		db3_goles6 : datos_raw[8]['COL14'],
		db3_paradas6 : datos_raw[8]['COL15'],
		db3_fuera6 : datos_raw[8]['COL16'],
		db3_perdidas6 : datos_raw[8]['COL17'],
		db3_posesiones6 : datos_raw[8]['COL18'],
		db3_eficacia6 : datos_raw[8]['COL19'],
		db3_lanz6 : datos_raw[8]['COL20'],
		db3_porcperdidas6 : datos_raw[8]['COL21'],
		db3_jugador7 : datos_raw[9]['COL13'],
		db3_goles7 : datos_raw[9]['COL14'],
		db3_paradas7 : datos_raw[9]['COL15'],
		db3_fuera7 : datos_raw[9]['COL16'],
		db3_perdidas7 : datos_raw[9]['COL17'],
		db3_posesiones7 : datos_raw[9]['COL18'],
		db3_eficacia7 : datos_raw[9]['COL19'],
		db3_lanz7 : datos_raw[9]['COL20'],
		db3_porcperdidas7 : datos_raw[9]['COL21'],
		db3_jugador8 : datos_raw[10]['COL13'],
		db3_goles8 : datos_raw[10]['COL14'],
		db3_paradas8 : datos_raw[10]['COL15'],
		db3_fuera8 : datos_raw[10]['COL16'],
		db3_perdidas8 : datos_raw[10]['COL17'],
		db3_posesiones8 : datos_raw[10]['COL18'],
		db3_eficacia8 : datos_raw[10]['COL19'],
		db3_lanz8 : datos_raw[10]['COL20'],
		db3_porcperdidas8 : datos_raw[10]['COL21'],
		db3_jugador9 : datos_raw[11]['COL13'],
		db3_goles9 : datos_raw[11]['COL14'],
		db3_paradas9 : datos_raw[11]['COL15'],
		db3_fuera9 : datos_raw[11]['COL16'],
		db3_perdidas9 : datos_raw[11]['COL17'],
		db3_posesiones9 : datos_raw[11]['COL18'],
		db3_eficacia9 : datos_raw[11]['COL19'],
		db3_lanz9 : datos_raw[11]['COL20'],
		db3_porcperdidas9 : datos_raw[11]['COL21'],
		db3_jugador10 : datos_raw[12]['COL13'],
		db3_goles10 : datos_raw[12]['COL14'],
		db3_paradas10 : datos_raw[12]['COL15'],
		db3_fuera10 : datos_raw[12]['COL16'],
		db3_perdidas10 : datos_raw[12]['COL17'],
		db3_posesiones10 : datos_raw[12]['COL18'],
		db3_eficacia10 : datos_raw[12]['COL19'],
		db3_lanz10 : datos_raw[12]['COL20'],
		db3_porcperdidas10 : datos_raw[12]['COL21'],
		db3_jugador11 : datos_raw[13]['COL13'],
		db3_goles11 : datos_raw[13]['COL14'],
		db3_paradas11 : datos_raw[13]['COL15'],
		db3_fuera11 : datos_raw[13]['COL16'],
		db3_perdidas11 : datos_raw[13]['COL17'],
		db3_posesiones11 : datos_raw[13]['COL18'],
		db3_eficacia11 : datos_raw[13]['COL19'],
		db3_lanz11 : datos_raw[13]['COL20'],
		db3_porcperdidas11 : datos_raw[13]['COL21'],
		db3_jugador12 : datos_raw[14]['COL13'],
		db3_goles12 : datos_raw[14]['COL14'],
		db3_paradas12 : datos_raw[14]['COL15'],
		db3_fuera12 : datos_raw[14]['COL16'],
		db3_perdidas12 : datos_raw[14]['COL17'],
		db3_posesiones12 : datos_raw[14]['COL18'],
		db3_eficacia12 : datos_raw[14]['COL19'],
		db3_lanz12 : datos_raw[14]['COL20'],
		db3_porcperdidas12 : datos_raw[14]['COL21']
	};
	const data = {
		data: JSON.stringify(info),
		url: 'mapasRendimiento',
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
        var hojaName = wb.SheetNames[2];
        const datos_raw = XLSX.utils.sheet_to_json(wb.Sheets[hojaName]);
        console.log(datos_raw);
		document.getElementById('equipo_local').innerHTML = datos_raw[0]['COL1'];
		document.getElementById('goles_local').innerHTML = datos_raw[0]['COL2'];
		document.getElementById('equipo_visitante').innerHTML = datos_raw[1]['COL1'];
		document.getElementById('goles_visitante').innerHTML = datos_raw[1]['COL2'];
		document.getElementById('ritmo_local').innerHTML = datos_raw[2]['COL4'];
		document.getElementById('ritmo_visitante').innerHTML = datos_raw[2]['COL9'];
		document.getElementById('at_posicional_local').innerHTML = datos_raw[3]['COL2'];
		document.getElementById('at_posicional_visitante').innerHTML = datos_raw[3]['COL7'];
		document.getElementById('contraataque_local').innerHTML = datos_raw[4]['COL2'];
		document.getElementById('contraataque_visitante').innerHTML = datos_raw[4]['COL7'];
		document.getElementById('saquegol_local').innerHTML = datos_raw[5]['COL2'];
		document.getElementById('saquegol_visitante').innerHTML = datos_raw[5]['COL7'];
		document.getElementById('perdidas_local').innerHTML = datos_raw[6]['COL2'];
		document.getElementById('perdidas_visitante').innerHTML = datos_raw[6]['COL7'];
		document.getElementById('superioridad_local').innerHTML = datos_raw[3]['COL4'];
		document.getElementById('superioridad_visitante').innerHTML = datos_raw[3]['COL9'];
		document.getElementById('paradas_local').innerHTML = datos_raw[4]['COL4'];
		document.getElementById('paradas_visitante').innerHTML = datos_raw[4]['COL9'];
		document.getElementById('defensa_local').innerHTML = datos_raw[5]['COL4'];
		document.getElementById('defensa_visitante').innerHTML = datos_raw[5]['COL9'];
		document.getElementById('ataque_local').innerHTML = datos_raw[6]['COL4'];
		document.getElementById('ataque_visitante').innerHTML = datos_raw[6]['COL9'];
		document.getElementById('penalti_local').innerHTML = datos_raw[7]['COL2'];
		document.getElementById('penalti_visitante').innerHTML = datos_raw[7]['COL9'];
		document.getElementById('gol7m_local').innerHTML = datos_raw[7]['COL4'];
		document.getElementById('gol7m_visitante').innerHTML = datos_raw[7]['COL9'];
		document.getElementById('a7x6_local').innerHTML = datos_raw[8]['COL4'];
		document.getElementById('a7x6_visitante').innerHTML = datos_raw[8]['COL9'];
		// dashboard 2 posicional
		document.getElementById('db2_paradas_plocal').innerHTML = datos_raw[25]['COL3'];
		document.getElementById('db2_paradas_pvisitante').innerHTML = datos_raw[30]['COL3'];
		document.getElementById('db2_fuera_plocal').innerHTML = datos_raw[25]['COL4'];
		document.getElementById('db2_fuera_pvisitante').innerHTML = datos_raw[30]['COL4'];
		document.getElementById('db2_perdidas_plocal').innerHTML = datos_raw[25]['COL5'];
		document.getElementById('db2_perdidas_pvisitante').innerHTML = datos_raw[30]['COL5'];
		document.getElementById('db2_posesiones_plocal').innerHTML = datos_raw[25]['COL6'];
		document.getElementById('db2_posesiones_pvisitante').innerHTML = datos_raw[30]['COL6'];
		document.getElementById('db2_porceficacia_plocal').innerHTML = datos_raw[25]['COL7'];
		document.getElementById('db2_porceficacia_pvisitante').innerHTML = datos_raw[30]['COL7'];
		document.getElementById('db2_porclanz_plocal').innerHTML = datos_raw[25]['COL8'];
		document.getElementById('db2_porclanz_pvisitante').innerHTML = datos_raw[30]['COL8'];
		document.getElementById('db2_porcperdidas_plocal').innerHTML = datos_raw[25]['COL9'];
		document.getElementById('db2_porcperdidas_pvisitante').innerHTML = datos_raw[30]['COL9'];
		// db2 contraataques
		document.getElementById('db2_paradas_clocal').innerHTML = datos_raw[26]['COL3'];
		document.getElementById('db2_paradas_cvisitante').innerHTML = datos_raw[31]['COL3'];
		document.getElementById('db2_fuera_clocal').innerHTML = datos_raw[26]['COL4'];
		document.getElementById('db2_fuera_cvisitante').innerHTML = datos_raw[31]['COL4'];
		document.getElementById('db2_perdidas_clocal').innerHTML = datos_raw[26]['COL5'];
		document.getElementById('db2_perdidas_cvisitante').innerHTML = datos_raw[31]['COL5'];
		document.getElementById('db2_posesiones_clocal').innerHTML = datos_raw[26]['COL6'];
		document.getElementById('db2_posesiones_cvisitante').innerHTML = datos_raw[31]['COL6'];
		document.getElementById('db2_porceficacia_clocal').innerHTML = datos_raw[26]['COL7'];
		document.getElementById('db2_porceficacia_cvisitante').innerHTML = datos_raw[31]['COL7'];
		document.getElementById('db2_porclanz_clocal').innerHTML = datos_raw[26]['COL8'];
		document.getElementById('db2_porclanz_cvisitante').innerHTML = datos_raw[31]['COL8'];
		document.getElementById('db2_porcperdidas_clocal').innerHTML = datos_raw[26]['COL9'];
		document.getElementById('db2_porcperdidas_cvisitante').innerHTML = datos_raw[31]['COL9'];
		// db2 saquegol
		document.getElementById('db2_paradas_slocal').innerHTML = datos_raw[27]['COL3'];
		document.getElementById('db2_paradas_svisitante').innerHTML = datos_raw[32]['COL3'];
		document.getElementById('db2_fuera_slocal').innerHTML = datos_raw[27]['COL4'];
		document.getElementById('db2_fuera_svisitante').innerHTML = datos_raw[32]['COL4'];
		document.getElementById('db2_perdidas_slocal').innerHTML = datos_raw[27]['COL5'];
		document.getElementById('db2_perdidas_svisitante').innerHTML = datos_raw[32]['COL5'];
		document.getElementById('db2_posesiones_slocal').innerHTML = datos_raw[27]['COL6'];
		document.getElementById('db2_posesiones_svisitante').innerHTML = datos_raw[32]['COL6'];
		document.getElementById('db2_porceficacia_slocal').innerHTML = datos_raw[27]['COL7'];
		document.getElementById('db2_porceficacia_svisitante').innerHTML = datos_raw[32]['COL7'];
		document.getElementById('db2_porclanz_slocal').innerHTML = datos_raw[27]['COL8'];
		document.getElementById('db2_porclanz_svisitante').innerHTML = datos_raw[32]['COL8'];
		document.getElementById('db2_porcperdidas_slocal').innerHTML = datos_raw[27]['COL9'];
		document.getElementById('db2_porcperdidas_svisitante').innerHTML = datos_raw[32]['COL9'];
		// db3 jugadores
		document.getElementById('db3_jugador1').innerHTML = datos_raw[3]['COL13'];
		document.getElementById('db3_goles1').innerHTML = datos_raw[3]['COL14'];
		document.getElementById('db3_paradas1').innerHTML = datos_raw[3]['COL15'];
		document.getElementById('db3_fuera1').innerHTML = datos_raw[3]['COL16'];
		document.getElementById('db3_perdidas1').innerHTML = datos_raw[3]['COL17'];
		document.getElementById('db3_posesiones1').innerHTML = datos_raw[3]['COL18'];
		document.getElementById('db3_eficacia1').innerHTML = datos_raw[3]['COL19'];
		document.getElementById('db3_lanz1').innerHTML = datos_raw[3]['COL20'];
		document.getElementById('db3_porcperdidas1').innerHTML = datos_raw[3]['COL21'];
		// jugador2
		document.getElementById('db3_jugador2').innerHTML = datos_raw[4]['COL13'];
		document.getElementById('db3_goles2').innerHTML = datos_raw[4]['COL14'];
		document.getElementById('db3_paradas2').innerHTML = datos_raw[4]['COL15'];
		document.getElementById('db3_fuera2').innerHTML = datos_raw[4]['COL16'];
		document.getElementById('db3_perdidas2').innerHTML = datos_raw[4]['COL17'];
		document.getElementById('db3_posesiones2').innerHTML = datos_raw[4]['COL18'];
		document.getElementById('db3_eficacia2').innerHTML = datos_raw[4]['COL19'];
		document.getElementById('db3_lanz2').innerHTML = datos_raw[4]['COL20'];
		document.getElementById('db3_porcperdidas2').innerHTML = datos_raw[4]['COL21'];
		// jugador 3
		document.getElementById('db3_jugador3').innerHTML = datos_raw[5]['COL13'];
		document.getElementById('db3_goles3').innerHTML = datos_raw[5]['COL14'];
		document.getElementById('db3_paradas3').innerHTML = datos_raw[5]['COL15'];
		document.getElementById('db3_fuera3').innerHTML = datos_raw[5]['COL16'];
		document.getElementById('db3_perdidas3').innerHTML = datos_raw[5]['COL17'];
		document.getElementById('db3_posesiones3').innerHTML = datos_raw[5]['COL18'];
		document.getElementById('db3_eficacia3').innerHTML = datos_raw[5]['COL19'];
		document.getElementById('db3_lanz3').innerHTML = datos_raw[5]['COL20'];
		document.getElementById('db3_porcperdidas3').innerHTML = datos_raw[5]['COL21'];
		// jugador 4	
		document.getElementById('db3_jugador4').innerHTML = datos_raw[6]['COL13'];
		document.getElementById('db3_goles4').innerHTML = datos_raw[6]['COL14'];
		document.getElementById('db3_paradas4').innerHTML = datos_raw[6]['COL15'];
		document.getElementById('db3_fuera4').innerHTML = datos_raw[6]['COL16'];
		document.getElementById('db3_perdidas4').innerHTML = datos_raw[6]['COL17'];
		document.getElementById('db3_posesiones4').innerHTML = datos_raw[6]['COL18'];
		document.getElementById('db3_eficacia4').innerHTML = datos_raw[6]['COL19'];
		document.getElementById('db3_lanz4').innerHTML = datos_raw[6]['COL20'];
		document.getElementById('db3_porcperdidas4').innerHTML = datos_raw[6]['COL21'];
		// jugador 5
		document.getElementById('db3_jugador5').innerHTML = datos_raw[7]['COL13'];
		document.getElementById('db3_goles5').innerHTML = datos_raw[7]['COL14'];
		document.getElementById('db3_paradas5').innerHTML = datos_raw[7]['COL15'];
		document.getElementById('db3_fuera5').innerHTML = datos_raw[7]['COL16'];
		document.getElementById('db3_perdidas5').innerHTML = datos_raw[7]['COL17'];
		document.getElementById('db3_posesiones5').innerHTML = datos_raw[7]['COL18'];
		document.getElementById('db3_eficacia5').innerHTML = datos_raw[7]['COL19'];
		document.getElementById('db3_lanz5').innerHTML = datos_raw[7]['COL20'];
		document.getElementById('db3_porcperdidas5').innerHTML = datos_raw[7]['COL21'];
		// jugador 6
		document.getElementById('db3_jugador6').innerHTML = datos_raw[8]['COL13'];
		document.getElementById('db3_goles6').innerHTML = datos_raw[8]['COL14'];
		document.getElementById('db3_paradas6').innerHTML = datos_raw[8]['COL15'];
		document.getElementById('db3_fuera6').innerHTML = datos_raw[8]['COL16'];
		document.getElementById('db3_perdidas6').innerHTML = datos_raw[8]['COL17'];
		document.getElementById('db3_posesiones6').innerHTML = datos_raw[8]['COL18'];
		document.getElementById('db3_eficacia6').innerHTML = datos_raw[8]['COL19'];
		document.getElementById('db3_lanz6').innerHTML = datos_raw[8]['COL20'];
		document.getElementById('db3_porcperdidas6').innerHTML = datos_raw[8]['COL21'];
		// jugador 7
		document.getElementById('db3_jugador7').innerHTML = datos_raw[9]['COL13'];
		document.getElementById('db3_goles7').innerHTML = datos_raw[9]['COL14'];
		document.getElementById('db3_paradas7').innerHTML = datos_raw[9]['COL15'];
		document.getElementById('db3_fuera7').innerHTML = datos_raw[9]['COL16'];
		document.getElementById('db3_perdidas7').innerHTML = datos_raw[9]['COL17'];
		document.getElementById('db3_posesiones7').innerHTML = datos_raw[9]['COL18'];
		document.getElementById('db3_eficacia7').innerHTML = datos_raw[9]['COL19'];
		document.getElementById('db3_lanz7').innerHTML = datos_raw[9]['COL20'];
		document.getElementById('db3_porcperdidas7').innerHTML = datos_raw[9]['COL21'];
		// jugador 8
		document.getElementById('db3_jugador8').innerHTML = datos_raw[10]['COL13'];
		document.getElementById('db3_goles8').innerHTML = datos_raw[10]['COL14'];
		document.getElementById('db3_paradas8').innerHTML = datos_raw[10]['COL15'];
		document.getElementById('db3_fuera8').innerHTML = datos_raw[10]['COL16'];
		document.getElementById('db3_perdidas8').innerHTML = datos_raw[10]['COL17'];
		document.getElementById('db3_posesiones8').innerHTML = datos_raw[10]['COL18'];
		document.getElementById('db3_eficacia8').innerHTML = datos_raw[10]['COL19'];
		document.getElementById('db3_lanz8').innerHTML = datos_raw[10]['COL20'];
		document.getElementById('db3_porcperdidas8').innerHTML = datos_raw[10]['COL21'];
		// jugador 9
		document.getElementById('db3_jugador9').innerHTML = datos_raw[11]['COL13'];
		document.getElementById('db3_goles9').innerHTML = datos_raw[11]['COL14'];
		document.getElementById('db3_paradas9').innerHTML = datos_raw[11]['COL15'];
		document.getElementById('db3_fuera9').innerHTML = datos_raw[11]['COL16'];
		document.getElementById('db3_perdidas9').innerHTML = datos_raw[11]['COL17'];
		document.getElementById('db3_posesiones9').innerHTML = datos_raw[11]['COL18'];
		document.getElementById('db3_eficacia9').innerHTML = datos_raw[11]['COL19'];
		document.getElementById('db3_lanz9').innerHTML = datos_raw[11]['COL20'];
		document.getElementById('db3_porcperdidas9').innerHTML = datos_raw[11]['COL21'];
		// jugador 10
		document.getElementById('db3_jugador10').innerHTML = datos_raw[12]['COL13'];
		document.getElementById('db3_goles10').innerHTML = datos_raw[12]['COL14'];
		document.getElementById('db3_paradas10').innerHTML = datos_raw[12]['COL15'];
		document.getElementById('db3_fuera10').innerHTML = datos_raw[12]['COL16'];
		document.getElementById('db3_perdidas10').innerHTML = datos_raw[12]['COL17'];
		document.getElementById('db3_posesiones10').innerHTML = datos_raw[12]['COL18'];
		document.getElementById('db3_eficacia10').innerHTML = datos_raw[12]['COL19'];
		document.getElementById('db3_lanz10').innerHTML = datos_raw[12]['COL20'];
		document.getElementById('db3_porcperdidas10').innerHTML = datos_raw[12]['COL21'];
		// jugador 11
		document.getElementById('db3_jugador11').innerHTML = datos_raw[13]['COL13'];
		document.getElementById('db3_goles11').innerHTML = datos_raw[13]['COL14'];
		document.getElementById('db3_paradas11').innerHTML = datos_raw[13]['COL15'];
		document.getElementById('db3_fuera11').innerHTML = datos_raw[13]['COL16'];
		document.getElementById('db3_perdidas11').innerHTML = datos_raw[13]['COL17'];
		document.getElementById('db3_posesiones11').innerHTML = datos_raw[13]['COL18'];
		document.getElementById('db3_eficacia11').innerHTML = datos_raw[13]['COL19'];
		document.getElementById('db3_lanz11').innerHTML = datos_raw[13]['COL20'];
		document.getElementById('db3_porcperdidas11').innerHTML = datos_raw[13]['COL21'];
		// jugador 12
		document.getElementById('db3_jugador12').innerHTML = datos_raw[14]['COL13'];
		document.getElementById('db3_goles12').innerHTML = datos_raw[14]['COL14'];
		document.getElementById('db3_paradas12').innerHTML = datos_raw[14]['COL15'];
		document.getElementById('db3_fuera12').innerHTML = datos_raw[14]['COL16'];
		document.getElementById('db3_perdidas12').innerHTML = datos_raw[14]['COL17'];
		document.getElementById('db3_posesiones12').innerHTML = datos_raw[14]['COL18'];
		document.getElementById('db3_eficacia12').innerHTML = datos_raw[14]['COL19'];
		document.getElementById('db3_lanz12').innerHTML = datos_raw[14]['COL20'];
		document.getElementById('db3_porcperdidas12').innerHTML = datos_raw[14]['COL21'];
		
		const datos = conversion(datos_raw);
		uploadexcel(datos_raw);
		const id = datos_raw[0]['COL1']+'_'+datos_raw[1]['COL1']+'_'+datos_raw[0]['COL2']+datos_raw[1]['COL2'];
		$.ajax({
            type: "POST",
            url: "mapasRendimiento",
            data: datos,
            success: function() {
				obtenerImagen(id, $("#imagenBD")[0], 1);
				obtenerImagen(id, $("#imagenBD2")[0], 2);
				obtenerImagen(id, $("#imagenBD3")[0], 3);
				obtenerImagen(id, $("#imagenBD4")[0], 4);
            },
			error: function() {
				obtenerImagen(id, $("#imagenBD1")[0], 1);
				obtenerImagen(id, $("#imagenBD2")[0], 2);
				obtenerImagen(id, $("#imagenBD3")[0], 3);
				obtenerImagen(id, $("#imagenBD4")[0], 4);
			},
            dataType: 'json',
			contentType: 'application/json'
        });
	};
});
function obtenerImagen(id, img, n) {
		$.ajax({
			type: "GET",
			url: "obtenerImagen",
			data: {
				id: id + "_img"+n
			},
			success: function(result){
				img.src = result;
			}
	});
}

function conversion(json) {
    return json;
}