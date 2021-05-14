package backend.persistencia;

import org.bson.Document;
import org.springframework.stereotype.Repository;
import backend.dominio.Scoring;

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
public final class ScoringDAO {
	public static final String SCORING = "Scoring"; //"Scoring" es el nombre de la coleccion

	public static void scoring(Scoring scoring) {
		Document document;
		MongoCollection<Document> coleccion;
		if (scoring != null) {
			coleccion = AgenteDB.get().getBd(SCORING);
			document = new Document("id", scoring.getId());
			document.append("jugador1", scoring.getJugador1());
			document.append("equipo1", scoring.getEquipo1());
			document.append("score1", scoring.getScore1());
			document.append("jugador2", scoring.getJugador2());
			document.append("equipo2", scoring.getEquipo2());
			document.append("score2", scoring.getScore2());
			document.append("jugador3", scoring.getJugador3());
			document.append("equipo3", scoring.getEquipo3());
			document.append("score3", scoring.getScore3());
			document.append("jugador4", scoring.getJugador4());
			document.append("equipo4", scoring.getEquipo4());
			document.append("score4", scoring.getScore4());
			document.append("jugador5", scoring.getJugador5());
			document.append("equipo5", scoring.getEquipo5());
			document.append("score5", scoring.getScore5());
			document.append("jugador6", scoring.getJugador6());
			document.append("equipo6", scoring.getEquipo6());
			document.append("score6", scoring.getScore6());
			document.append("jugador7", scoring.getJugador7());
			document.append("equipo7", scoring.getEquipo7());
			document.append("score7", scoring.getScore7());
			document.append("jugador8", scoring.getJugador8());
			document.append("equipo8", scoring.getEquipo8());
			document.append("score8", scoring.getScore8());
			document.append("jugador9", scoring.getJugador9());
			document.append("equipo9", scoring.getEquipo9());
			document.append("score9", scoring.getScore9());
			document.append("jugador10", scoring.getJugador10());
			document.append("equipo10", scoring.getEquipo10());
			document.append("score10", scoring.getScore10());
			document.append("jugador11", scoring.getJugador11());
			document.append("equipo11", scoring.getEquipo11());
			document.append("score11", scoring.getScore11());
			document.append("jugador12", scoring.getJugador12());
			document.append("equipo12", scoring.getEquipo12());
			document.append("score12", scoring.getScore12());
			document.append("jugador13", scoring.getJugador13());
			document.append("equipo13", scoring.getEquipo13());
			document.append("score13", scoring.getScore13());
			document.append("jugador14", scoring.getJugador14());
			document.append("equipo14", scoring.getEquipo14());
			document.append("score14", scoring.getScore14());
			document.append("jugador15", scoring.getJugador15());
			document.append("equipo15", scoring.getEquipo15());
			document.append("score15", scoring.getScore15());
			document.append("jugador16", scoring.getJugador16());
			document.append("equipo16", scoring.getEquipo16());
			document.append("score16", scoring.getScore16());
			document.append("jugador17", scoring.getJugador17());
			document.append("equipo17", scoring.getEquipo17());
			document.append("score17", scoring.getScore17());
			document.append("jugador18", scoring.getJugador18());
			document.append("equipo18", scoring.getEquipo18());
			document.append("score18", scoring.getScore18());
			document.append("jugador19", scoring.getJugador19());
			document.append("equipo19", scoring.getEquipo19());
			document.append("score19", scoring.getScore19());
			document.append("jugador20", scoring.getJugador20());
			document.append("equipo20", scoring.getEquipo20());
			document.append("score20", scoring.getScore20());
			document.append("jugador21", scoring.getJugador21());
			document.append("equipo21", scoring.getEquipo21());
			document.append("score21", scoring.getScore21());
			document.append("jugador22", scoring.getJugador22());
			document.append("equipo22", scoring.getEquipo22());
			document.append("score22", scoring.getScore22());
			document.append("jugador23", scoring.getJugador23());
			document.append("equipo23", scoring.getEquipo23());
			document.append("score23", scoring.getScore23());
			document.append("jugador24", scoring.getJugador24());
			document.append("equipo24", scoring.getEquipo24());
			document.append("score24", scoring.getScore24());
			document.append("jugador25", scoring.getJugador25());
			document.append("equipo25", scoring.getEquipo25());
			document.append("score25", scoring.getScore25());
			document.append("jugador26", scoring.getJugador26());
			document.append("equipo26", scoring.getEquipo26());
			document.append("score26", scoring.getScore26());
			document.append("jugador27", scoring.getJugador27());
			document.append("equipo27", scoring.getEquipo27());
			document.append("score27", scoring.getScore27());
			document.append("jugador28", scoring.getJugador28());
			document.append("equipo28", scoring.getEquipo28());
			document.append("score28", scoring.getScore28());
			
			//coleccion.insertOne(document);
		}
	}
}
