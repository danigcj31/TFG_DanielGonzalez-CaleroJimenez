package backend.dominio;

import org.json.JSONObject;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import backend.persistencia.GrafosDAO;
import backend.persistencia.PlusMinusDAO;
import backend.persistencia.ScoringDAO;
import backend.persistencia.UserDAO;
import java.io.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import javax.swing.JFileChooser;

public class Manager {
	private WebSocketSession session;

	public Manager() {
		// Metodo constructor vacio (no hay atributos)
	}

	private static class ManagerHolder {
		private static Manager singleton = new Manager();
	}

	public static Manager get() {
		return ManagerHolder.singleton;
	}

	public void login(String name, String password) throws IOException {
		boolean login = false;

		ArrayList<User> usuarios = (ArrayList<User>) UserDAO.leerUsers();
		
		for (User u : usuarios) {
			login = checkCredenciales(u, name, password);
			JSONObject jso = new JSONObject();
			jso.put("rol", u.getUsername());
			if (this.session != null) {
				this.session.sendMessage(new TextMessage(jso.toString()));
			}
			break;
		}
	}
	
	public boolean checkCredenciales(User u, String name, String password) {
		boolean aux = false;
		String pwd1;
		String pwd2;
		if (u.getName().equals(name)) {
			pwd1 = u.getPassword1();
			pwd2 = u.getPassword2();
			if (pwd1.equals(pwd2)) {
				if (pwd1.equals(password)) {
					aux = true;
				}
			}
		}
		return aux;
	}
	
	public void register(String username, String email, String pwd1, String pwd2, String name, String apellido, String imagen) {
		UserDAO.insertar(new User(username, email, encriptarMD5(pwd1), encriptarMD5(pwd2), name, apellido, imagen));
	}
	

	private static String encriptarMD5(String pwd) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] messageDigest = md.digest(pwd.getBytes());
			BigInteger number = new BigInteger(1, messageDigest);
			String hashtext = number.toString(16);

			int diff = 32 - hashtext.length();
			StringBuilder bld = new StringBuilder();

			while (diff > 1) {
				bld.append("0");
				diff--;
			}

			return bld.toString() + hashtext;

		} catch (NoSuchAlgorithmException e) {
			return "";
		}
	}
	
	public void uploadexcel(String id, String equipo_local, String equipo_visitante,
			int goles_local, int goles_visitante,  double ritmo_local, double ritmo_visitante, double at_posicional_local,
			double at_posicional_visitante, double contraataque_local, double contraataque_visitante,
			double saquegol_local, double saquegol_visitante, double perdidas_local, double perdidas_visitante,
			double superioridad_local, double superioridad_visitante, double paradas_local, double paradas_visitante,
			double defensa_local, double defensa_visitante, double ataques_local, double ataques_visitante, int penalti_local,
			int penalti_visitante, int gol7m_local, int gol7m_visitante, String a7x6_local, String a7x6_visitante, 
			int db2_paradas_plocal, int db2_paradas_pvisitante, int db2_fuera_plocal,int db2_fuera_pvisitante, 
			int db2_perdidas_plocal,int db2_perdidas_pvisitante,int db2_posesiones_plocal,int db2_posesiones_pvisitante,
			double db2_porceficacia_plocal,double db2_porceficacia_pvisitante,double db2_porclanz_plocal,
			double db2_porclanz_pvisitante,double db2_porcperdidas_plocal,double db2_porcperdidas_pvisitante,
			int db2_paradas_clocal, int db2_paradas_cvisitante, int db2_fuera_clocal,int db2_fuera_cvisitante, 
			int db2_perdidas_clocal,int db2_perdidas_cvisitante,int db2_posesiones_clocal,int db2_posesiones_cvisitante,
			double db2_porceficacia_clocal,double db2_porceficacia_cvisitante,double db2_porclanz_clocal,
			double db2_porclanz_cvisitante,double db2_porcperdidas_clocal,double db2_porcperdidas_cvisitante,
			int db2_paradas_slocal, int db2_paradas_svisitante, int db2_fuera_slocal,int db2_fuera_svisitante, 
			int db2_perdidas_slocal,int db2_perdidas_svisitante,int db2_posesiones_slocal,int db2_posesiones_svisitante,
			double db2_porceficacia_slocal,double db2_porceficacia_svisitante,double db2_porclanz_slocal,
			double db2_porclanz_svisitante,double db2_porcperdidas_slocal,double db2_porcperdidas_svisitante,			
			String db3_jugador1,int db3_goles1,int db3_paradas1,int db3_fuera1,int db3_perdidas1,
			int db3_posesiones1,double db3_eficacia1,double db3_lanz1,double db3_porcperdidas1,
			String db3_jugador2,int db3_goles2,int db3_paradas2,int db3_fuera2,int db3_perdidas2,
			int db3_posesiones2,double db3_eficacia2,double db3_lanz2,double db3_porcperdidas2,
			String db3_jugador3,int db3_goles3,int db3_paradas3,int db3_fuera3,int db3_perdidas3,
			int db3_posesiones3,double db3_eficacia3,double db3_lanz3,double db3_porcperdidas3,
			String db3_jugador4,int db3_goles4,int db3_paradas4,int db3_fuera4,int db3_perdidas4,
			int db3_posesiones4,double db3_eficacia4,double db3_lanz4,double db3_porcperdidas4,
			String db3_jugador5,int db3_goles5,int db3_paradas5,int db3_fuera5,int db3_perdidas5,
			int db3_posesiones5,double db3_eficacia5,double db3_lanz5,double db3_porcperdidas5,
			String db3_jugador6,int db3_goles6,int db3_paradas6,int db3_fuera6,int db3_perdidas6,
			int db3_posesiones6,double db3_eficacia6,double db3_lanz6,double db3_porcperdidas6,
			String db3_jugador7,int db3_goles7,int db3_paradas7,int db3_fuera7,int db3_perdidas7,
			int db3_posesiones7,double db3_eficacia7,double db3_lanz7,double db3_porcperdidas7,
			String db3_jugador8,int db3_goles8,int db3_paradas8,int db3_fuera8,int db3_perdidas8,
			int db3_posesiones8,double db3_eficacia8,double db3_lanz8,double db3_porcperdidas8,
			String db3_jugador9,int db3_goles9,int db3_paradas9,int db3_fuera9,int db3_perdidas9,
			int db3_posesiones9,String db3_eficacia9,String db3_lanz9,String db3_porcperdidas9,
			String db3_jugador10,int db3_goles10,int db3_paradas10,int db3_fuera10,int db3_perdidas10,
			int db3_posesiones10,double db3_eficacia10,double db3_lanz10,double db3_porcperdidas10,
			String db3_jugador11,int db3_goles11,int db3_paradas11,int db3_fuera11,int db3_perdidas11,
			int db3_posesiones11,double db3_eficacia11,double db3_lanz11,double db3_porcperdidas11,
			String db3_jugador12,int db3_goles12,int db3_paradas12,int db3_fuera12,int db3_perdidas12,
			int db3_posesiones12,String db3_eficacia12,String db3_lanz12,String db3_porcperdidas12) {
					
		GrafosDAO.uploadexcel(new Grafos(id,equipo_local,equipo_visitante,goles_local, 
				goles_visitante, ritmo_local, ritmo_visitante, at_posicional_local, 
				at_posicional_visitante, contraataque_local, contraataque_visitante, 
				saquegol_local, saquegol_visitante, perdidas_local, perdidas_visitante, 
				superioridad_local, superioridad_visitante, paradas_local, paradas_visitante, 
				defensa_local, defensa_visitante, ataques_local, ataques_visitante, penalti_local, 
				penalti_visitante,gol7m_local, gol7m_visitante, a7x6_local,a7x6_visitante,
				db2_paradas_plocal,db2_paradas_pvisitante,db2_fuera_plocal,db2_fuera_pvisitante, 
				db2_perdidas_plocal,db2_perdidas_pvisitante,db2_posesiones_plocal,db2_posesiones_pvisitante,
				db2_porceficacia_plocal,db2_porceficacia_pvisitante, db2_porclanz_plocal,
				db2_porclanz_pvisitante,db2_porcperdidas_plocal, db2_porcperdidas_pvisitante,
				db2_paradas_clocal,db2_paradas_cvisitante,db2_fuera_clocal,db2_fuera_cvisitante, 
				db2_perdidas_clocal,db2_perdidas_cvisitante,db2_posesiones_clocal,db2_posesiones_cvisitante,
				db2_porceficacia_clocal,db2_porceficacia_cvisitante,db2_porclanz_clocal,
				db2_porclanz_cvisitante,db2_porcperdidas_clocal,db2_porcperdidas_cvisitante,
				db2_paradas_slocal,db2_paradas_svisitante,db2_fuera_slocal,db2_fuera_svisitante, 
				db2_perdidas_slocal,db2_perdidas_svisitante,db2_posesiones_slocal,db2_posesiones_svisitante,
				db2_porceficacia_slocal,db2_porceficacia_svisitante,db2_porclanz_slocal,
				db2_porclanz_svisitante, db2_porcperdidas_slocal,db2_porcperdidas_svisitante,
				 db3_jugador1, db3_goles1, db3_paradas1, db3_fuera1, db3_perdidas1,
				 db3_posesiones1, db3_eficacia1, db3_lanz1, db3_porcperdidas1,
				 db3_jugador2, db3_goles2, db3_paradas2, db3_fuera2, db3_perdidas2,
				 db3_posesiones2, db3_eficacia2, db3_lanz2, db3_porcperdidas2,
				 db3_jugador3, db3_goles3, db3_paradas3, db3_fuera3, db3_perdidas3,
				 db3_posesiones3, db3_eficacia3, db3_lanz3, db3_porcperdidas3,
				 db3_jugador4, db3_goles4, db3_paradas4, db3_fuera4, db3_perdidas4,
				 db3_posesiones4, db3_eficacia4, db3_lanz4, db3_porcperdidas4,
				 db3_jugador5, db3_goles5, db3_paradas5, db3_fuera5, db3_perdidas5,
				 db3_posesiones5, db3_eficacia5, db3_lanz5, db3_porcperdidas5,
				 db3_jugador6, db3_goles6, db3_paradas6, db3_fuera6, db3_perdidas6,
				 db3_posesiones6, db3_eficacia6, db3_lanz6, db3_porcperdidas6,
				 db3_jugador7, db3_goles7, db3_paradas7, db3_fuera7, db3_perdidas7,
				 db3_posesiones7, db3_eficacia7, db3_lanz7, db3_porcperdidas7,
				 db3_jugador8, db3_goles8, db3_paradas8, db3_fuera8, db3_perdidas8,
				 db3_posesiones8, db3_eficacia8, db3_lanz8, db3_porcperdidas8,
				 db3_jugador9, db3_goles9, db3_paradas9, db3_fuera9, db3_perdidas9,
				 db3_posesiones9, db3_eficacia9, db3_lanz9, db3_porcperdidas9,
				 db3_jugador10, db3_goles10, db3_paradas10, db3_fuera10, db3_perdidas10,
				 db3_posesiones10, db3_eficacia10, db3_lanz10, db3_porcperdidas10,
				 db3_jugador11, db3_goles11, db3_paradas11, db3_fuera11, db3_perdidas11,
				 db3_posesiones11, db3_eficacia11, db3_lanz11, db3_porcperdidas11,
				 db3_jugador12, db3_goles12, db3_paradas12, db3_fuera12, db3_perdidas12,
				 db3_posesiones12, db3_eficacia12, db3_lanz12, db3_porcperdidas12));
	}

	public void setSession(WebSocketSession session) {
		this.session=session;
	}

	public String obtenerImagen(String id) {
		return GrafosDAO.obtenerImagen(id);
	}

	public void scoring(String id, String jugador1, String equipo1, double score1,
	String jugador2,String equipo2,double score2,String jugador3,String equipo3,double score3,
	String jugador4,String equipo4,double score4,String jugador5,String equipo5,double score5,
	String jugador6,String equipo6,double score6,String jugador7,String equipo7,double score7,
	String jugador8,String equipo8,double score8,String jugador9,String equipo9,double score9,
	String jugador10,String equipo10,double score10,String jugador11,String equipo11,double score11,
	String jugador12,String equipo12,double score12,String jugador13,String equipo13,double score13,
	String jugador14,String equipo14,double score14,String jugador15,String equipo15,double score15,
	String jugador16,String equipo16,double score16,String jugador17,String equipo17,double score17,
	String jugador18,String equipo18,double score18,String jugador19,String equipo19,double score19,
	String jugador20,String equipo20,double score20,String jugador21,String equipo21,double score21,
	String jugador22,String equipo22,double score22,String jugador23,String equipo23,double score23,
	String jugador24,String equipo24,double score24,String jugador25,String equipo25,double score25,
	String jugador26,String equipo26,double score26,String jugador27,String equipo27,double score27,
	String jugador28,String equipo28,double score28) {
		
		ScoringDAO.scoring(new Scoring(id,jugador1,equipo1,score1,jugador2,equipo2,score2,
				jugador3,equipo3,score3,jugador4,equipo4,score4,jugador5,equipo5,score5,
				jugador6,equipo6,score6,jugador7,equipo7,score7,jugador8,equipo8,score8,
				jugador9,equipo9,score9,jugador10,equipo10,score10,jugador11,equipo11,score11,
				jugador12,equipo12,score12,jugador13,equipo13,score13,jugador14,equipo14,score14,
				jugador15,equipo15,score15,jugador16,equipo16,score16,jugador17,equipo17,score17,
				jugador18,equipo18,score18,jugador19,equipo19,score19,jugador20,equipo20,score20,
				jugador21,equipo21,score21,jugador22,equipo22,score22,jugador23,equipo23,score23,
				jugador24,equipo24,score24,jugador25,equipo25,score25,jugador26,equipo26,score26,
				jugador27,equipo27,score27,jugador28,equipo28,score28));		
	}

	public void plusminus(String id, String player1, double played1, double PMI1, double PMB1, double ataque1,
			double defensa1, String player2, double played2, double PMI2, double PMB2, double ataque2, double defensa2,
			String player3, double played3, double PMI3, double PMB3, double ataque3, double defensa3, String player4,
			double played4, double PMI4, double PMB4, double ataque4, double defensa4, String player5, double played5,
			double PMI5, double PMB5, double ataque5, double defensa5, String player6, double played6, double PMI6,
			double PMB6, double ataque6, double defensa6, String player7, double played7, double PMI7, double PMB7,
			double ataque7, double defensa7, String player8, double played8, double PMI8, double PMB8, double ataque8,
			double defensa8, String player9, double played9, double PMI9, double PMB9, double ataque9, double defensa9,
			String player10, double played10, double PMI10, double PMB10, double ataque10, double defensa10,
			String player11, double played11, double PMI11, double PMB11, double ataque11, double defensa11,
			String player12, double played12, double PMI12, double PMB12, double ataque12, double defensa12,
			String player13, double played13, double PMI13, double PMB13, double ataque13, double defensa13,
			String player14, double played14, double PMI14, double PMB14, double ataque14, double defensa14,
			String player15, double played15, double PMI15, double PMB15, double ataque15, double defensa15) {
		
		PlusMinusDAO.plusminus(new PlusMinus(id,player1,played1,PMI1,PMB1,ataque1,defensa1,
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
				player15,played15,PMI15,PMB15,ataque15,defensa15));		
	}

}
