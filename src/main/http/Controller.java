package backend.http;

import java.io.IOException;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import backend.dominio.Manager;

@RestController
public class Controller {

	@PostMapping("/login")
	public void login(@RequestBody Map<String, Object> credenciales) throws IOException {
		JSONObject jso = new JSONObject(credenciales);
		String name = jso.getString("username");
		String password = jso.getString("pwd");
		Manager.get().login(name, password);
	}
	
	@PostMapping("/register")
	public void register(@RequestBody Map<String, Object> credenciales) {
		JSONObject jso = new JSONObject(credenciales);

		String username = jso.getString("username");
		String email = jso.getString("email");
		String pwd1 = jso.getString("pwd1");
		String pwd2 = jso.getString("pwd2");
		String name = jso.getString("name");
		String apellidos = jso.getString("apellidos");
		String imagen = jso.getString("imagen");
		
		Manager.get().register(username, email, pwd1, pwd2, name, apellidos, imagen);
	}
	
	@PostMapping("/mapasRendimiento")
	public void mapasRendimiento(@RequestBody Map<String, Object> credenciales) {
		JSONObject jso = new JSONObject(credenciales);
		String id = jso.getString("id");
		String equipo_local = jso.getString("equipo_local");
		String equipo_visitante = jso.getString("equipo_visitante");
		int goles_local = jso.getInt("goles_local");
		int goles_visitante = jso.getInt("goles_visitante");
		double ritmo_local = jso.getDouble("ritmo_local");
		double ritmo_visitante = jso.getDouble("ritmo_visitante");
		double at_posicional_local = jso.getDouble("at_posicional_local");
		double at_posicional_visitante = jso.getDouble("at_posicional_visitante");
		double contraataque_local = jso.getDouble("contraataque_local");
		double contraataque_visitante = jso.getDouble("contraataque_visitante");
		double saquegol_local = jso.getDouble("saquegol_local");
		double saquegol_visitante = jso.getDouble("saquegol_visitante");
		double perdidas_local = jso.getDouble("perdidas_local");
		double perdidas_visitante = jso.getDouble("perdidas_visitante");
		double superioridad_local = jso.getDouble("superioridad_local");
		double superioridad_visitante = jso.getDouble("superioridad_visitante");
		double paradas_local = jso.getDouble("paradas_local");
		double paradas_visitante = jso.getDouble("paradas_visitante");
		double defensa_local = jso.getDouble("defensa_local");
		double defensa_visitante = jso.getDouble("defensa_visitante");
		double ataques_local = jso.getDouble("ataques_local");
		double ataques_visitante = jso.getDouble("ataques_visitante");
		int penalti_local = jso.getInt("penalti_local");
		int penalti_visitante = jso.getInt("penalti_visitante");
		int gol7m_local = jso.getInt("gol7m_local");
		int gol7m_visitante = jso.getInt("gol7m_visitante");
		String a7x6_local = jso.getString("a7x6_local");
		String a7x6_visitante = jso.getString("a7x6_visitante");
		//db2 posicional
		int db2_paradas_plocal = jso.getInt("db2_paradas_plocal");
		int db2_paradas_pvisitante = jso.getInt("db2_paradas_pvisitante");
		int db2_fuera_plocal = jso.getInt("db2_fuera_plocal");
		int db2_fuera_pvisitante = jso.getInt("db2_fuera_pvisitante");
		int db2_perdidas_plocal = jso.getInt("db2_perdidas_plocal");
		int db2_perdidas_pvisitante = jso.getInt("db2_perdidas_pvisitante");
		int db2_posesiones_plocal = jso.getInt("db2_posesiones_plocal");
		int db2_posesiones_pvisitante = jso.getInt("db2_posesiones_pvisitante");
		double db2_porceficacia_plocal = jso.getDouble("db2_porceficacia_plocal");
		double db2_porceficacia_pvisitante = jso.getDouble("db2_porceficacia_pvisitante");
		double db2_porclanz_plocal = jso.getDouble("db2_porclanz_plocal");
		double db2_porclanz_pvisitante = jso.getDouble("db2_porclanz_pvisitante");
		double db2_porcperdidas_plocal = jso.getDouble("db2_porcperdidas_plocal");
		double db2_porcperdidas_pvisitante = jso.getDouble("db2_porcperdidas_pvisitante");
		//db2 contraataques
		int db2_paradas_clocal = jso.getInt("db2_paradas_clocal");
		int db2_paradas_cvisitante = jso.getInt("db2_paradas_cvisitante");
		int db2_fuera_clocal = jso.getInt("db2_fuera_clocal");
		int db2_fuera_cvisitante = jso.getInt("db2_fuera_cvisitante");
		int db2_perdidas_clocal = jso.getInt("db2_perdidas_clocal");
		int db2_perdidas_cvisitante = jso.getInt("db2_perdidas_cvisitante");
		int db2_posesiones_clocal = jso.getInt("db2_posesiones_clocal");
		int db2_posesiones_cvisitante = jso.getInt("db2_posesiones_cvisitante");
		double db2_porceficacia_clocal = jso.getDouble("db2_porceficacia_clocal");
		double db2_porceficacia_cvisitante = jso.getDouble("db2_porceficacia_cvisitante");
		double db2_porclanz_clocal = jso.getDouble("db2_porclanz_clocal");
		double db2_porclanz_cvisitante = jso.getDouble("db2_porclanz_cvisitante");
		double db2_porcperdidas_clocal = jso.getDouble("db2_porcperdidas_clocal");
		double db2_porcperdidas_cvisitante = jso.getDouble("db2_porcperdidas_cvisitante");
		//db2 saquegol
		int db2_paradas_slocal = jso.getInt("db2_paradas_slocal");
		int db2_paradas_svisitante = jso.getInt("db2_paradas_svisitante");
		int db2_fuera_slocal = jso.getInt("db2_fuera_slocal");
		int db2_fuera_svisitante = jso.getInt("db2_fuera_svisitante");
		int db2_perdidas_slocal = jso.getInt("db2_perdidas_slocal");
		int db2_perdidas_svisitante = jso.getInt("db2_perdidas_svisitante");
		int db2_posesiones_slocal = jso.getInt("db2_posesiones_slocal");
		int db2_posesiones_svisitante = jso.getInt("db2_posesiones_svisitante");
		double db2_porceficacia_slocal = jso.getDouble("db2_porceficacia_slocal");
		double db2_porceficacia_svisitante = jso.getDouble("db2_porceficacia_svisitante");
		double db2_porclanz_slocal = jso.getDouble("db2_porclanz_slocal");
		double db2_porclanz_svisitante = jso.getDouble("db2_porclanz_svisitante");
		double db2_porcperdidas_slocal = jso.getDouble("db2_porcperdidas_slocal");
		double db2_porcperdidas_svisitante = jso.getDouble("db2_porcperdidas_svisitante");
		// dashboard jugadores
		String db3_jugador1 = jso.getString("db3_jugador1");
		int db3_goles1 = jso.getInt("db3_goles1");
		int db3_paradas1 = jso.getInt("db3_paradas1");
		int db3_fuera1 = jso.getInt("db3_fuera1");
		int db3_perdidas1 = jso.getInt("db3_perdidas1");
		int db3_posesiones1 = jso.getInt("db3_posesiones1");
		double db3_eficacia1 = jso.getDouble("db3_eficacia1");
		double db3_lanz1 = jso.getDouble("db3_lanz1");
		double db3_porcperdidas1 = jso.getDouble("db3_porcperdidas1");
		// jugador 2
		String db3_jugador2 = jso.getString("db3_jugador2");
		int db3_goles2 = jso.getInt("db3_goles2");
		int db3_paradas2 = jso.getInt("db3_paradas2");
		int db3_fuera2 = jso.getInt("db3_fuera2");
		int db3_perdidas2 = jso.getInt("db3_perdidas2");
		int db3_posesiones2 = jso.getInt("db3_posesiones2");
		double db3_eficacia2 = jso.getDouble("db3_eficacia2");
		double db3_lanz2 = jso.getDouble("db3_lanz2");
		double db3_porcperdidas2 = jso.getDouble("db3_porcperdidas2");
		// jugador 3
		String db3_jugador3 = jso.getString("db3_jugador3");
		int db3_goles3 = jso.getInt("db3_goles3");
		int db3_paradas3 = jso.getInt("db3_paradas3");
		int db3_fuera3 = jso.getInt("db3_fuera3");
		int db3_perdidas3 = jso.getInt("db3_perdidas3");
		int db3_posesiones3 = jso.getInt("db3_posesiones3");
		double db3_eficacia3 = jso.getDouble("db3_eficacia3");
		double db3_lanz3 = jso.getDouble("db3_lanz3");
		double db3_porcperdidas3 = jso.getDouble("db3_porcperdidas3");
		// jugador 4
		String db3_jugador4 = jso.getString("db3_jugador4");
		int db3_goles4 = jso.getInt("db3_goles4");
		int db3_paradas4 = jso.getInt("db3_paradas4");
		int db3_fuera4 = jso.getInt("db3_fuera4");
		int db3_perdidas4 = jso.getInt("db3_perdidas4");
		int db3_posesiones4 = jso.getInt("db3_posesiones4");
		double db3_eficacia4 = jso.getDouble("db3_eficacia4");
		double db3_lanz4 = jso.getDouble("db3_lanz4");
		double db3_porcperdidas4 = jso.getDouble("db3_porcperdidas4");
		// jugador 5
		String db3_jugador5 = jso.getString("db3_jugador5");
		int db3_goles5 = jso.getInt("db3_goles5");
		int db3_paradas5 = jso.getInt("db3_paradas5");
		int db3_fuera5 = jso.getInt("db3_fuera5");
		int db3_perdidas5 = jso.getInt("db3_perdidas5");
		int db3_posesiones5 = jso.getInt("db3_posesiones5");
		double db3_eficacia5 = jso.getDouble("db3_eficacia5");
		double db3_lanz5 = jso.getDouble("db3_lanz5");
		double db3_porcperdidas5 = jso.getDouble("db3_porcperdidas5");
		// jugador 6
		String db3_jugador6 = jso.getString("db3_jugador6");
		int db3_goles6 = jso.getInt("db3_goles6");
		int db3_paradas6 = jso.getInt("db3_paradas6");
		int db3_fuera6 = jso.getInt("db3_fuera6");
		int db3_perdidas6 = jso.getInt("db3_perdidas6");
		int db3_posesiones6 = jso.getInt("db3_posesiones6");
		double db3_eficacia6 = jso.getDouble("db3_eficacia6");
		double db3_lanz6 = jso.getDouble("db3_lanz6");
		double db3_porcperdidas6 = jso.getDouble("db3_porcperdidas6");
		// jugador 7
		String db3_jugador7 = jso.getString("db3_jugador7");
		int db3_goles7 = jso.getInt("db3_goles7");
		int db3_paradas7 = jso.getInt("db3_paradas7");
		int db3_fuera7 = jso.getInt("db3_fuera7");
		int db3_perdidas7 = jso.getInt("db3_perdidas7");
		int db3_posesiones7 = jso.getInt("db3_posesiones7");
		double db3_eficacia7 = jso.getDouble("db3_eficacia7");
		double db3_lanz7 = jso.getDouble("db3_lanz7");
		double db3_porcperdidas7 = jso.getDouble("db3_porcperdidas7");
		// jugador 8
		String db3_jugador8 = jso.getString("db3_jugador8");
		int db3_goles8 = jso.getInt("db3_goles8");
		int db3_paradas8 = jso.getInt("db3_paradas8");
		int db3_fuera8 = jso.getInt("db3_fuera8");
		int db3_perdidas8 = jso.getInt("db3_perdidas8");
		int db3_posesiones8 = jso.getInt("db3_posesiones8");
		double db3_eficacia8 = jso.getDouble("db3_eficacia8");
		double db3_lanz8 = jso.getDouble("db3_lanz8");
		double db3_porcperdidas8 = jso.getDouble("db3_porcperdidas8");
		// jugador 9
		String db3_jugador9 = jso.getString("db3_jugador9");
		int db3_goles9 = jso.getInt("db3_goles9");
		int db3_paradas9 = jso.getInt("db3_paradas9");
		int db3_fuera9 = jso.getInt("db3_fuera9");
		int db3_perdidas9 = jso.getInt("db3_perdidas9");
		int db3_posesiones9 = jso.getInt("db3_posesiones9");
		String db3_eficacia9 = jso.getString("db3_eficacia9");
		String db3_lanz9 = jso.getString("db3_lanz9");
		String db3_porcperdidas9 = jso.getString("db3_porcperdidas9");
		// jugador 10
		String db3_jugador10 = jso.getString("db3_jugador10");
		int db3_goles10 = jso.getInt("db3_goles10");
		int db3_paradas10 = jso.getInt("db3_paradas10");
		int db3_fuera10 = jso.getInt("db3_fuera10");
		int db3_perdidas10 = jso.getInt("db3_perdidas10");
		int db3_posesiones10 = jso.getInt("db3_posesiones10");
		double db3_eficacia10 = jso.getDouble("db3_eficacia10");
		double db3_lanz10 = jso.getDouble("db3_lanz10");
		double db3_porcperdidas10 = jso.getDouble("db3_porcperdidas10");
		// jugador 11
		String db3_jugador11 = jso.getString("db3_jugador11");
		int db3_goles11 = jso.getInt("db3_goles11");
		int db3_paradas11 = jso.getInt("db3_paradas11");
		int db3_fuera11 = jso.getInt("db3_fuera11");
		int db3_perdidas11 = jso.getInt("db3_perdidas11");
		int db3_posesiones11 = jso.getInt("db3_posesiones11");
		double db3_eficacia11 = jso.getDouble("db3_eficacia11");
		double db3_lanz11 = jso.getDouble("db3_lanz11");
		double db3_porcperdidas11 = jso.getDouble("db3_porcperdidas11");
		// jugador 12
		String db3_jugador12 = jso.getString("db3_jugador12");
		int db3_goles12 = jso.getInt("db3_goles12");
		int db3_paradas12 = jso.getInt("db3_paradas12");
		int db3_fuera12 = jso.getInt("db3_fuera12");
		int db3_perdidas12 = jso.getInt("db3_perdidas12");
		int db3_posesiones12 = jso.getInt("db3_posesiones12");
		String db3_eficacia12 = jso.getString("db3_eficacia12");
		String db3_lanz12 = jso.getString("db3_lanz12");
		String db3_porcperdidas12 = jso.getString("db3_porcperdidas12");
		
		Manager.get().uploadexcel(id, equipo_local, equipo_visitante, goles_local, 
				goles_visitante, ritmo_local, ritmo_visitante, at_posicional_local,
				at_posicional_visitante, contraataque_local, contraataque_visitante,
				saquegol_local, saquegol_visitante, perdidas_local, perdidas_visitante,
				superioridad_local, superioridad_visitante, paradas_local, paradas_visitante,
				defensa_local, defensa_visitante, ataques_local, ataques_visitante, penalti_local,
				penalti_visitante, gol7m_local, gol7m_visitante, a7x6_local, a7x6_visitante,
				db2_paradas_plocal, db2_paradas_plocal,db2_fuera_plocal, 
				db2_fuera_pvisitante, db2_perdidas_plocal, db2_perdidas_pvisitante,
				db2_posesiones_plocal, db2_posesiones_pvisitante, db2_porceficacia_plocal,
				db2_porceficacia_pvisitante,db2_porclanz_plocal,db2_porclanz_pvisitante,
				db2_porcperdidas_plocal, db2_porcperdidas_pvisitante,
				db2_paradas_clocal, db2_paradas_clocal,db2_fuera_clocal, 
				db2_fuera_cvisitante, db2_perdidas_clocal, db2_perdidas_cvisitante,
				db2_posesiones_clocal, db2_posesiones_cvisitante, db2_porceficacia_clocal,
				db2_porceficacia_cvisitante,db2_porclanz_clocal,db2_porclanz_cvisitante,
				db2_porcperdidas_clocal, db2_porcperdidas_cvisitante,
				db2_paradas_slocal, db2_paradas_slocal,db2_fuera_plocal, 
				db2_fuera_svisitante, db2_perdidas_slocal, db2_perdidas_svisitante,
				db2_posesiones_slocal, db2_posesiones_svisitante, db2_porceficacia_slocal,
				db2_porceficacia_svisitante,db2_porclanz_slocal,db2_porclanz_svisitante,
				db2_porcperdidas_slocal, db2_porcperdidas_svisitante,
				db3_jugador1,db3_goles1, db3_paradas1,db3_fuera1,db3_perdidas1,
				db3_posesiones1, db3_eficacia1, db3_lanz1,db3_porcperdidas1,
				db3_jugador2,db3_goles2, db3_paradas2,db3_fuera2,db3_perdidas2,
				db3_posesiones2, db3_eficacia2, db3_lanz2,db3_porcperdidas2,
				db3_jugador3,db3_goles3, db3_paradas3,db3_fuera3,db3_perdidas3,
				db3_posesiones3, db3_eficacia3, db3_lanz3,db3_porcperdidas3,
				db3_jugador4,db3_goles4, db3_paradas4,db3_fuera4,db3_perdidas4,
				db3_posesiones4, db3_eficacia4, db3_lanz4,db3_porcperdidas4,
				db3_jugador5,db3_goles5, db3_paradas5,db3_fuera5,db3_perdidas5,
				db3_posesiones5, db3_eficacia5, db3_lanz5,db3_porcperdidas5,
				db3_jugador6,db3_goles6, db3_paradas6,db3_fuera6,db3_perdidas6,
				db3_posesiones6, db3_eficacia6, db3_lanz6,db3_porcperdidas6,
				db3_jugador7,db3_goles7, db3_paradas7,db3_fuera7,db3_perdidas7,
				db3_posesiones7, db3_eficacia7, db3_lanz7,db3_porcperdidas7,
				db3_jugador8,db3_goles8, db3_paradas8,db3_fuera8,db3_perdidas8,
				db3_posesiones8, db3_eficacia8, db3_lanz8,db3_porcperdidas8,
				db3_jugador9,db3_goles9, db3_paradas9,db3_fuera9,db3_perdidas9,
				db3_posesiones9, db3_eficacia9, db3_lanz9,db3_porcperdidas9,
				db3_jugador10,db3_goles10, db3_paradas10,db3_fuera10,db3_perdidas10,
				db3_posesiones10, db3_eficacia10, db3_lanz10,db3_porcperdidas10,
				db3_jugador11,db3_goles11, db3_paradas11,db3_fuera11,db3_perdidas11,
				db3_posesiones11, db3_eficacia11, db3_lanz11,db3_porcperdidas11,
				db3_jugador12,db3_goles12, db3_paradas12,db3_fuera12,db3_perdidas12,
				db3_posesiones12, db3_eficacia12, db3_lanz12,db3_porcperdidas12);				
	}
	
	@GetMapping(value="/obtenerImagen", produces = MediaType.TEXT_PLAIN_VALUE)
	public String obtenerImagen(String id) {
		return Manager.get().obtenerImagen(id);
	}
	
	@PostMapping("/scoring")
	public void scoring(@RequestBody Map<String, Object> credenciales) {
		JSONObject jso = new JSONObject(credenciales);
		String id = jso.getString("id");
		String jugador1 = jso.getString("jugador1");
		String equipo1 = jso.getString("equipo1");
		double score1 = jso.getDouble("score1"); //deberian ser todos doubles
		String jugador2 = jso.getString("jugador2");
		String equipo2 = jso.getString("equipo2");
		double score2 = jso.getDouble("score2");
		String jugador3 = jso.getString("jugador3");
		String equipo3 = jso.getString("equipo3");
		double score3 = jso.getDouble("score3");
		String jugador4 = jso.getString("jugador4");
		String equipo4 = jso.getString("equipo4");
		double score4 = jso.getDouble("score4");
		String jugador5 = jso.getString("jugador5");
		String equipo5 = jso.getString("equipo5");
		double score5 = jso.getDouble("score5");
		String jugador6 = jso.getString("jugador6");
		String equipo6 = jso.getString("equipo6");
		double score6 = jso.getDouble("score6");
		String jugador7 = jso.getString("jugador7");
		String equipo7 = jso.getString("equipo7");
		double score7 = jso.getDouble("score7");
		String jugador8 = jso.getString("jugador8");
		String equipo8 = jso.getString("equipo8");
		double score8 = jso.getDouble("score8");
		String jugador9 = jso.getString("jugador9");
		String equipo9 = jso.getString("equipo9");
		double score9 = jso.getDouble("score9");
		String jugador10 = jso.getString("jugador10");
		String equipo10 = jso.getString("equipo10");
		double score10 = jso.getDouble("score10");
		String jugador11 = jso.getString("jugador11");
		String equipo11 = jso.getString("equipo11");
		double score11 = jso.getDouble("score11");
		String jugador12 = jso.getString("jugador12");
		String equipo12 = jso.getString("equipo12");
		double score12 = jso.getDouble("score12");
		String jugador13 = jso.getString("jugador13");
		String equipo13 = jso.getString("equipo13");
		double score13 = jso.getDouble("score13");
		String jugador14 = jso.getString("jugador14");
		String equipo14 = jso.getString("equipo14");
		double score14 = jso.getDouble("score14");
		String jugador15 = jso.getString("jugador15");
		String equipo15 = jso.getString("equipo15");
		double score15 = jso.getDouble("score15");
		String jugador16 = jso.getString("jugador16");
		String equipo16 = jso.getString("equipo16");
		double score16 = jso.getDouble("score16");
		String jugador17 = jso.getString("jugador17");
		String equipo17 = jso.getString("equipo17");
		double score17 = jso.getDouble("score17");
		String jugador18 = jso.getString("jugador18");
		String equipo18 = jso.getString("equipo18");
		double score18 = jso.getDouble("score18");
		String jugador19 = jso.getString("jugador19");
		String equipo19 = jso.getString("equipo19");
		double score19 = jso.getDouble("score19");
		String jugador20 = jso.getString("jugador20");
		String equipo20 = jso.getString("equipo20");
		double score20 = jso.getDouble("score20");
		String jugador21 = jso.getString("jugador21");
		String equipo21 = jso.getString("equipo21");
		double score21 = jso.getDouble("score21");
		String jugador22 = jso.getString("jugador22");
		String equipo22 = jso.getString("equipo22");
		double score22 = jso.getDouble("score22");
		String jugador23 = jso.getString("jugador23");
		String equipo23 = jso.getString("equipo23");
		double score23 = jso.getDouble("score23");
		String jugador24 = jso.getString("jugador24");
		String equipo24 = jso.getString("equipo24");
		double score24 = jso.getDouble("score24");
		String jugador25 = jso.getString("jugador25");
		String equipo25 = jso.getString("equipo25");
		double score25 = jso.getDouble("score25");
		String jugador26 = jso.getString("jugador26");
		String equipo26 = jso.getString("equipo26");
		double score26 = jso.getDouble("score26");
		String jugador27 = jso.getString("jugador27");
		String equipo27 = jso.getString("equipo27");
		double score27 = jso.getDouble("score27");
		String jugador28 = jso.getString("jugador28");
		String equipo28 = jso.getString("equipo28");
		double score28 = jso.getDouble("score28");
		
		Manager.get().scoring(id,jugador1,equipo1,score1,jugador2,equipo2,score2,
		jugador3,equipo3,score3,jugador4,equipo4,score4,jugador5,equipo5,score5,
		jugador6,equipo6,score6,jugador7,equipo7,score7,jugador8,equipo8,score8,
		jugador9,equipo9,score9,jugador10,equipo10,score10,jugador11,equipo11,score11,
		jugador12,equipo12,score12,jugador13,equipo13,score13,jugador14,equipo14,score14,
		jugador15,equipo15,score15,jugador16,equipo16,score16,jugador17,equipo17,score17,
		jugador18,equipo18,score18,jugador19,equipo19,score19,jugador20,equipo20,score20,
		jugador21,equipo21,score21,jugador22,equipo22,score22,jugador23,equipo23,score23,
		jugador24,equipo24,score24,jugador25,equipo25,score25,jugador26,equipo26,score26,
		jugador27,equipo27,score27,jugador28,equipo28,score28);
	}
	
	@PostMapping("/plusminus")
	public void plusminus(@RequestBody Map<String, Object> credenciales) {
		JSONObject jso = new JSONObject(credenciales);
		String id = jso.getString("id");
		String player1 = jso.getString("player1");
		double played1 = jso.getDouble("played1");
		double PMI1 = jso.getDouble("PMI1");
		double PMB1 = jso.getDouble("PMB1");
		double ataque1 = jso.getDouble("ataque1");
		double defensa1 = jso.getDouble("defensa1");
		String player2 = jso.getString("player2");
		double played2 = jso.getDouble("played2");
		double PMI2 = jso.getDouble("PMI2");
		double PMB2 = jso.getDouble("PMB2");
		double ataque2 = jso.getDouble("ataque2");
		double defensa2 = jso.getDouble("defensa2");
		String player3 = jso.getString("player3");
		double played3 = jso.getDouble("played3");
		double PMI3 = jso.getDouble("PMI3");
		double PMB3 = jso.getDouble("PMB3");
		double ataque3 = jso.getDouble("ataque3");
		double defensa3 = jso.getDouble("defensa3");
		String player4 = jso.getString("player4");
		double played4 = jso.getDouble("played4");
		double PMI4 = jso.getDouble("PMI4");
		double PMB4 = jso.getDouble("PMB4");
		double ataque4 = jso.getDouble("ataque4");
		double defensa4 = jso.getDouble("defensa4");
		String player5 = jso.getString("player5");
		double played5 = jso.getDouble("played5");
		double PMI5 = jso.getDouble("PMI5");
		double PMB5 = jso.getDouble("PMB5");
		double ataque5 = jso.getDouble("ataque5");
		double defensa5 = jso.getDouble("defensa5");
		String player6 = jso.getString("player6");
		double played6 = jso.getDouble("played6");
		double PMI6 = jso.getDouble("PMI6");
		double PMB6 = jso.getDouble("PMB6");
		double ataque6 = jso.getDouble("ataque6");
		double defensa6 = jso.getDouble("defensa6");
		String player7 = jso.getString("player7");
		double played7 = jso.getDouble("played7");
		double PMI7 = jso.getDouble("PMI7");
		double PMB7 = jso.getDouble("PMB7");
		double ataque7 = jso.getDouble("ataque7");
		double defensa7 = jso.getDouble("defensa7");
		String player8 = jso.getString("player8");
		double played8 = jso.getDouble("played8");
		double PMI8 = jso.getDouble("PMI8");
		double PMB8 = jso.getDouble("PMB8");
		double ataque8 = jso.getDouble("ataque8");
		double defensa8 = jso.getDouble("defensa8");
		String player9 = jso.getString("player9");
		double played9 = jso.getDouble("played9");
		double PMI9 = jso.getDouble("PMI9");
		double PMB9 = jso.getDouble("PMB9");
		double ataque9 = jso.getDouble("ataque9");
		double defensa9 = jso.getDouble("defensa9");
		String player10 = jso.getString("player10");
		double played10 = jso.getDouble("played10");
		double PMI10 = jso.getDouble("PMI10");
		double PMB10 = jso.getDouble("PMB10");
		double ataque10 = jso.getDouble("ataque10");
		double defensa10 = jso.getDouble("defensa10");
		String player11 = jso.getString("player11");
		double played11 = jso.getDouble("played11");
		double PMI11 = jso.getDouble("PMI11");
		double PMB11 = jso.getDouble("PMB11");
		double ataque11 = jso.getDouble("ataque11");
		double defensa11 = jso.getDouble("defensa11");
		String player12 = jso.getString("player12");
		double played12 = jso.getDouble("played12");
		double PMI12 = jso.getDouble("PMI12");
		double PMB12 = jso.getDouble("PMB12");
		double ataque12 = jso.getDouble("ataque12");
		double defensa12 = jso.getDouble("defensa12");
		String player13 = jso.getString("player13");
		double played13 = jso.getDouble("played13");
		double PMI13 = jso.getDouble("PMI13");
		double PMB13 = jso.getDouble("PMB13");
		double ataque13 = jso.getDouble("ataque13");
		double defensa13 = jso.getDouble("defensa13");
		String player14 = jso.getString("player14");
		double played14 = jso.getDouble("played14");
		double PMI14 = jso.getDouble("PMI14");
		double PMB14 = jso.getDouble("PMB14");
		double ataque14 = jso.getDouble("ataque14");
		double defensa14 = jso.getDouble("defensa14");
		String player15 = jso.getString("player15");
		double played15 = jso.getDouble("played15");
		double PMI15 = jso.getDouble("PMI15");
		double PMB15 = jso.getDouble("PMB15");
		double ataque15 = jso.getDouble("ataque15");
		double defensa15 = jso.getDouble("defensa15");		
		
		Manager.get().plusminus(id,player1,played1,PMI1,PMB1,ataque1,defensa1,
				player2,played2,PMI2,PMB2,ataque2,defensa2,
				player3,played3,PMI3,PMB3,ataque3,defensa3,
				player4,played4,PMI4,PMB4,ataque4,defensa4,
				player5,played5,PMI5,PMB5,ataque5,defensa5,
				player6,played6,PMI6,PMB6,ataque6,defensa6,
				player7,played7,PMI7,PMB7,ataque7,defensa7,
				player8,played8,PMI8,PMB8,ataque8,defensa8,
				player9,played9,PMI9,PMB9,ataque9,defensa9,
				player10,played10,PMI10,PMB10,ataque10,defensa10,
				player11,played11,PMI11,PMB11,ataque11,defensa11,
				player12,played12,PMI12,PMB12,ataque12,defensa12,
				player13,played13,PMI13,PMB13,ataque13,defensa13,
				player14,played14,PMI14,PMB14,ataque14,defensa14,
				player15,played15,PMI15,PMB15,ataque15,defensa15);				
	}
}
