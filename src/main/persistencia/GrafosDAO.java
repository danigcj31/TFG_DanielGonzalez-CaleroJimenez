package backend.persistencia;

import org.bson.Document;
import org.springframework.stereotype.Repository;
import backend.dominio.Grafos;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import org.bson.types.ObjectId;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.File;

import sun.misc.BASE64Decoder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

import javax.imageio.ImageIO;


@Repository
public final class GrafosDAO {
	public static final String GRAFOS = "Grafos"; //"Grafos" es el nombre de la coleccion

	public static void uploadexcel(Grafos grafo) {
		Document document;
		MongoCollection<Document> coleccion;
		if (grafo != null) {
			coleccion = AgenteDB.get().getBd(GRAFOS);
			document = new Document("id", grafo.getId());
			document.append("equipo_local", grafo.getEquipo_local());
			document.append("equipo_visitante", grafo.getEquipo_visitante());
			document.append("goles_local", grafo.getGoles_local());
			document.append("goles_visitante", grafo.getGoles_visitante());
			document.append("ritmo_local", grafo.getRitmo_local());
			document.append("ritmo_visitante", grafo.getRitmo_visitante());
			document.append("at_posicional_local", grafo.getAt_posicional_local());
			document.append("at_posicional_visitante", grafo.getAt_posicional_visitante());
			document.append("contraataque_local", grafo.getContraataque_local());
			document.append("contraataque_visitante", grafo.getContraataque_visitante());
			document.append("saquegol_local", grafo.getSaquegol_local());
			document.append("saquegol_visitante", grafo.getSaquegol_visitante());
			document.append("perdidas_local", grafo.getPerdidas_local());
			document.append("perdidas_visitante", grafo.getPerdidas_visitante());
			document.append("superioridad_local", grafo.getSuperioridad_local());
			document.append("superioridad_visitante", grafo.getSuperioridad_visitante());
			document.append("paradas_local", grafo.getParadas_local());
			document.append("paradas_visitante", grafo.getParadas_visitante());
			document.append("defensa_local", grafo.getDefensa_local());
			document.append("defensa_visitante", grafo.getDefensa_visitante());
			document.append("ataque_local", grafo.getAtaque_local());
			document.append("ataque_visitante", grafo.getAtaque_visitante());
			document.append("penalti_local", grafo.getPenalti_local());
			document.append("penalti_visitante", grafo.getPenalti_visitante());
			document.append("gol7m_local", grafo.getGol7m_local());
			document.append("gol7m_visitante", grafo.getGol7m_visitante());
			document.append("a7x6_local", grafo.getA7x6_local());
			document.append("a7x6_visitante", grafo.getA7x6_visitante());
			//dashboard2 posicional
			document.append("db2_paradas_plocal", grafo.getDb2_paradas_plocal());
			document.append("db2_paradas_pvisitante", grafo.getDb2_paradas_pvisitante());
			document.append("db2_fuera_plocal", grafo.getDb2_fuera_plocal());
			document.append("db2_fuera_pvisitante", grafo.getDb2_fuera_pvisitante());
			document.append("db2_perdidas_plocal", grafo.getDb2_perdidas_plocal());
			document.append("db2_perdidas_pvisitante", grafo.getDb2_perdidas_pvisitante());
			document.append("db2_perdidas_plocal", grafo.getDb2_perdidas_plocal());
			document.append("db2_posesiones_plocal", grafo.getDb2_posesiones_plocal());
			document.append("db2_posesiones_pvisitante", grafo.getDb2_posesiones_pvisitante());
			document.append("db2_porceficacia_plocal", grafo.getDb2_porceficacia_plocal());
			document.append("db2_porceficacia_pvisitante", grafo.getDb2_porceficacia_pvisitante());
			document.append("db2_porclanz_plocal", grafo.getDb2_porclanz_plocal());
			document.append("db2_porclanz_pvisitante", grafo.getDb2_porclanz_pvisitante());
			document.append("db2_porcperdidas_plocal", grafo.getDb2_porcperdidas_plocal());
			document.append("db2_porcperdidas_pvisitante", grafo.getDb2_porcperdidas_pvisitante());
			//dashboard2 contraataque
			document.append("db2_paradas_clocal", grafo.getDb2_paradas_clocal());
			document.append("db2_paradas_cvisitante", grafo.getDb2_paradas_cvisitante());
			document.append("db2_fuera_clocal", grafo.getDb2_fuera_clocal());
			document.append("db2_fuera_cvisitante", grafo.getDb2_fuera_cvisitante());
			document.append("db2_perdidas_clocal", grafo.getDb2_perdidas_clocal());
			document.append("db2_perdidas_cvisitante", grafo.getDb2_perdidas_cvisitante());
			document.append("db2_perdidas_clocal", grafo.getDb2_perdidas_clocal());
			document.append("db2_posesiones_clocal", grafo.getDb2_posesiones_clocal());
			document.append("db2_posesiones_cvisitante", grafo.getDb2_posesiones_cvisitante());
			document.append("db2_porceficacia_clocal", grafo.getDb2_porceficacia_clocal());
			document.append("db2_porceficacia_cvisitante", grafo.getDb2_porceficacia_cvisitante());
			document.append("db2_porclanz_clocal", grafo.getDb2_porclanz_clocal());
			document.append("db2_porclanz_cvisitante", grafo.getDb2_porclanz_cvisitante());
			document.append("db2_porcperdidas_clocal", grafo.getDb2_porcperdidas_clocal());
			document.append("db2_porcperdidas_cvisitante", grafo.getDb2_porcperdidas_cvisitante());
			//dashboard2 saquegol
			document.append("db2_paradas_slocal", grafo.getDb2_paradas_slocal());
			document.append("db2_paradas_svisitante", grafo.getDb2_paradas_svisitante());
			document.append("db2_fuera_slocal", grafo.getDb2_fuera_slocal());
			document.append("db2_fuera_svisitante", grafo.getDb2_fuera_svisitante());
			document.append("db2_perdidas_slocal", grafo.getDb2_perdidas_slocal());
			document.append("db2_perdidas_svisitante", grafo.getDb2_perdidas_svisitante());
			document.append("db2_perdidas_slocal", grafo.getDb2_perdidas_slocal());
			document.append("db2_posesiones_slocal", grafo.getDb2_posesiones_slocal());
			document.append("db2_posesiones_svisitante", grafo.getDb2_posesiones_pvisitante());
			document.append("db2_porceficacia_slocal", grafo.getDb2_porceficacia_slocal());
			document.append("db2_porceficacia_svisitante", grafo.getDb2_porceficacia_svisitante());
			document.append("db2_porclanz_slocal", grafo.getDb2_porclanz_slocal());
			document.append("db2_porclanz_svisitante", grafo.getDb2_porclanz_svisitante());
			document.append("db2_porcperdidas_slocal", grafo.getDb2_porcperdidas_slocal());
			document.append("db2_porcperdidas_svisitante", grafo.getDb2_porcperdidas_svisitante());
			//dashboard jugadores
			//jugador1
			document.append("db3_jugador1", grafo.getDb3_jugador1());
			document.append("db3_goles1", grafo.getDb3_goles1());
			document.append("db3_paradas1", grafo.getDb3_paradas1());
			document.append("db3_fuera1", grafo.getDb3_fuera1());
			document.append("db3_perdidas1", grafo.getDb3_perdidas1());
			document.append("db3_posesiones1", grafo.getDb3_posesiones1());
			document.append("db3_eficacia1", grafo.getDb3_eficacia1());
			document.append("db3_lanz1", grafo.getDb3_lanz1());
			document.append("db3_porcperdidas1", grafo.getDb3_porcperdidas1());
			//jugador2
			document.append("db3_jugador2", grafo.getDb3_jugador2());
			document.append("db3_goles2", grafo.getDb3_goles2());
			document.append("db3_paradas2", grafo.getDb3_paradas2());
			document.append("db3_fuera2", grafo.getDb3_fuera2());
			document.append("db3_perdidas2", grafo.getDb3_perdidas2());
			document.append("db3_posesiones2", grafo.getDb3_posesiones2());
			document.append("db3_eficacia2", grafo.getDb3_eficacia2());
			document.append("db3_lanz2", grafo.getDb3_lanz2());
			document.append("db3_porcperdidas2", grafo.getDb3_porcperdidas2());
			//jugador3
			document.append("db3_jugador3", grafo.getDb3_jugador3());
			document.append("db3_goles3", grafo.getDb3_goles3());
			document.append("db3_paradas3", grafo.getDb3_paradas3());
			document.append("db3_fuera3", grafo.getDb3_fuera3());
			document.append("db3_perdidas3", grafo.getDb3_perdidas3());
			document.append("db3_posesiones3", grafo.getDb3_posesiones3());
			document.append("db3_eficacia3", grafo.getDb3_eficacia3());
			document.append("db3_lanz3", grafo.getDb3_lanz3());
			document.append("db3_porcperdidas3", grafo.getDb3_porcperdidas3());
			//jugador4
			document.append("db3_jugador4", grafo.getDb3_jugador4());
			document.append("db3_goles4", grafo.getDb3_goles4());
			document.append("db3_paradas4", grafo.getDb3_paradas4());
			document.append("db3_fuera4", grafo.getDb3_fuera4());
			document.append("db3_perdidas4", grafo.getDb3_perdidas4());
			document.append("db3_posesiones4", grafo.getDb3_posesiones4());
			document.append("db3_eficacia4", grafo.getDb3_eficacia4());
			document.append("db3_lanz4", grafo.getDb3_lanz4());
			document.append("db3_porcperdidas4", grafo.getDb3_porcperdidas4());
			//jugador5
			document.append("db3_jugador5", grafo.getDb3_jugador5());
			document.append("db3_goles5", grafo.getDb3_goles5());
			document.append("db3_paradas5", grafo.getDb3_paradas5());
			document.append("db3_fuera5", grafo.getDb3_fuera5());
			document.append("db3_perdidas5", grafo.getDb3_perdidas5());
			document.append("db3_posesiones5", grafo.getDb3_posesiones5());
			document.append("db3_eficacia5", grafo.getDb3_eficacia5());
			document.append("db3_lanz5", grafo.getDb3_lanz5());
			document.append("db3_porcperdidas5", grafo.getDb3_porcperdidas5());
			//jugador6
			document.append("db3_jugador6", grafo.getDb3_jugador6());
			document.append("db3_goles6", grafo.getDb3_goles6());
			document.append("db3_paradas6", grafo.getDb3_paradas6());
			document.append("db3_fuera6", grafo.getDb3_fuera6());
			document.append("db3_perdidas6", grafo.getDb3_perdidas6());
			document.append("db3_posesiones6", grafo.getDb3_posesiones6());
			document.append("db3_eficacia6", grafo.getDb3_eficacia6());
			document.append("db3_lanz6", grafo.getDb3_lanz6());
			document.append("db3_porcperdidas6", grafo.getDb3_porcperdidas6());
			//jugador7
			document.append("db3_jugador7", grafo.getDb3_jugador7());
			document.append("db3_goles7", grafo.getDb3_goles7());
			document.append("db3_paradas7", grafo.getDb3_paradas7());
			document.append("db3_fuera7", grafo.getDb3_fuera7());
			document.append("db3_perdidas7", grafo.getDb3_perdidas7());
			document.append("db3_posesiones7", grafo.getDb3_posesiones7());
			document.append("db3_eficacia7", grafo.getDb3_eficacia7());
			document.append("db3_lanz7", grafo.getDb3_lanz7());
			document.append("db3_porcperdidas7", grafo.getDb3_porcperdidas7());
			//jugador8
			document.append("db3_jugador8", grafo.getDb3_jugador8());
			document.append("db3_goles8", grafo.getDb3_goles8());
			document.append("db3_paradas8", grafo.getDb3_paradas8());
			document.append("db3_fuera8", grafo.getDb3_fuera8());
			document.append("db3_perdidas8", grafo.getDb3_perdidas8());
			document.append("db3_posesiones8", grafo.getDb3_posesiones8());
			document.append("db3_eficacia8", grafo.getDb3_eficacia8());
			document.append("db3_lanz8", grafo.getDb3_lanz8());
			document.append("db3_porcperdidas8", grafo.getDb3_porcperdidas8());
			//jugador9
			document.append("db3_jugador9", grafo.getDb3_jugador9());
			document.append("db3_goles9", grafo.getDb3_goles9());
			document.append("db3_paradas9", grafo.getDb3_paradas9());
			document.append("db3_fuera9", grafo.getDb3_fuera9());
			document.append("db3_perdidas9", grafo.getDb3_perdidas9());
			document.append("db3_posesiones9", grafo.getDb3_posesiones9());
			document.append("db3_eficacia9", grafo.getDb3_eficacia9());
			document.append("db3_lanz9", grafo.getDb3_lanz9());
			document.append("db3_porcperdidas9", grafo.getDb3_porcperdidas9());
			//jugador10
			document.append("db3_jugador10", grafo.getDb3_jugador10());
			document.append("db3_goles10", grafo.getDb3_goles10());
			document.append("db3_paradas10", grafo.getDb3_paradas10());
			document.append("db3_fuera10", grafo.getDb3_fuera10());
			document.append("db3_perdidas10", grafo.getDb3_perdidas10());
			document.append("db3_posesiones10", grafo.getDb3_posesiones10());
			document.append("db3_eficacia10", grafo.getDb3_eficacia10());
			document.append("db3_lanz10", grafo.getDb3_lanz10());
			document.append("db3_porcperdidas10", grafo.getDb3_porcperdidas10());
			//jugador11
			document.append("db3_jugador11", grafo.getDb3_jugador11());
			document.append("db3_goles11", grafo.getDb3_goles11());
			document.append("db3_paradas11", grafo.getDb3_paradas11());
			document.append("db3_fuera11", grafo.getDb3_fuera11());
			document.append("db3_perdidas11", grafo.getDb3_perdidas11());
			document.append("db3_posesiones11", grafo.getDb3_posesiones11());
			document.append("db3_eficacia11", grafo.getDb3_eficacia11());
			document.append("db3_lanz11", grafo.getDb3_lanz11());
			document.append("db3_porcperdidas11", grafo.getDb3_porcperdidas11());
			//jugador12
			document.append("db3_jugador12", grafo.getDb3_jugador12());
			document.append("db3_goles12", grafo.getDb3_goles12());
			document.append("db3_paradas12", grafo.getDb3_paradas12());
			document.append("db3_fuera12", grafo.getDb3_fuera12());
			document.append("db3_perdidas12", grafo.getDb3_perdidas12());
			document.append("db3_posesiones12", grafo.getDb3_posesiones12());
			document.append("db3_eficacia12", grafo.getDb3_eficacia12());
			document.append("db3_lanz12", grafo.getDb3_lanz12());
			document.append("db3_porcperdidas12", grafo.getDb3_porcperdidas12());
			//coleccion.insertOne(document);
		}
	}
	
	public static String obtenerImagen(String id) {
		Document document;
		MongoCollection<Document> coleccion = AgenteDB.get().getBd(GRAFOS);
		BasicDBObject query = new BasicDBObject();
	    query.put("id",id);
	    MongoCursor<Document> dbObj = coleccion.find(query).iterator();
	    while (dbObj.hasNext()) {
			document = dbObj.next();
			String identificador = document.getString("img");
			return document.getString("img");
	    }  
	    return null;
	} 
}
