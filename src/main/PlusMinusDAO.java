package backend.persistencia;

import org.bson.Document;
import org.springframework.stereotype.Repository;

import backend.dominio.PlusMinus;
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
public final class PlusMinusDAO {
	public static final String PLUSMINUS = "Plusminus"; //"Scoring" es el nombre de la coleccion

	public static void plusminus(PlusMinus plusminus) {
		Document document;
		MongoCollection<Document> coleccion;
		if (plusminus != null) {
			coleccion = AgenteDB.get().getBd(PLUSMINUS);
			document = new Document("id", plusminus.getId());
			document.append("player1", plusminus.getPlayer1());
			document.append("played1", plusminus.getPlayed1());
			document.append("PMI1", plusminus.getPMI1());
			document.append("PMB1", plusminus.getPMB1());
			document.append("ataque1", plusminus.getAtaque1());
			document.append("defensa1", plusminus.getDefensa1());
			document.append("player2", plusminus.getPlayer2());
			document.append("played2", plusminus.getPlayed2());
			document.append("PMI2", plusminus.getPMI2());
			document.append("PMB2", plusminus.getPMB2());
			document.append("ataque2", plusminus.getAtaque2());
			document.append("defensa2", plusminus.getDefensa2());
			document.append("player3", plusminus.getPlayer3());
			document.append("played3", plusminus.getPlayed3());
			document.append("PMI3", plusminus.getPMI3());
			document.append("PMB3", plusminus.getPMB3());
			document.append("ataque3", plusminus.getAtaque3());
			document.append("defensa3", plusminus.getDefensa3());
			document.append("player4", plusminus.getPlayer4());
			document.append("played4", plusminus.getPlayed4());
			document.append("PMI4", plusminus.getPMI4());
			document.append("PMB4", plusminus.getPMB4());
			document.append("ataque4", plusminus.getAtaque4());
			document.append("defensa4", plusminus.getDefensa4());
			document.append("player5", plusminus.getPlayer5());
			document.append("played5", plusminus.getPlayed5());
			document.append("PMI5", plusminus.getPMI5());
			document.append("PMB5", plusminus.getPMB5());
			document.append("ataque5", plusminus.getAtaque5());
			document.append("defensa5", plusminus.getDefensa5());
			document.append("player6", plusminus.getPlayer6());
			document.append("played6", plusminus.getPlayed6());
			document.append("PMI6", plusminus.getPMI6());
			document.append("PMB6", plusminus.getPMB6());
			document.append("ataque6", plusminus.getAtaque6());
			document.append("defensa6", plusminus.getDefensa6());
			document.append("player7", plusminus.getPlayer7());
			document.append("played7", plusminus.getPlayed7());
			document.append("PMI7", plusminus.getPMI7());
			document.append("PMB7", plusminus.getPMB7());
			document.append("ataque7", plusminus.getAtaque7());
			document.append("defensa7", plusminus.getDefensa7());
			document.append("player8", plusminus.getPlayer8());
			document.append("played8", plusminus.getPlayed8());
			document.append("PMI8", plusminus.getPMI8());
			document.append("PMB8", plusminus.getPMB8());
			document.append("ataque8", plusminus.getAtaque8());
			document.append("defensa8", plusminus.getDefensa8());
			document.append("player9", plusminus.getPlayer9());
			document.append("played9", plusminus.getPlayed9());
			document.append("PMI9", plusminus.getPMI9());
			document.append("PMB9", plusminus.getPMB9());
			document.append("ataque9", plusminus.getAtaque9());
			document.append("defensa9", plusminus.getDefensa9());
			document.append("player10", plusminus.getPlayer10());
			document.append("played10", plusminus.getPlayed10());
			document.append("PMI10", plusminus.getPMI10());
			document.append("PMB10", plusminus.getPMB10());
			document.append("ataque10", plusminus.getAtaque10());
			document.append("defensa10", plusminus.getDefensa10());
			document.append("player11", plusminus.getPlayer11());
			document.append("played11", plusminus.getPlayed11());
			document.append("PMI11", plusminus.getPMI11());
			document.append("PMB11", plusminus.getPMB11());
			document.append("ataque11", plusminus.getAtaque11());
			document.append("defensa11", plusminus.getDefensa11());
			document.append("player12", plusminus.getPlayer12());
			document.append("played12", plusminus.getPlayed12());
			document.append("PMI12", plusminus.getPMI12());
			document.append("PMB12", plusminus.getPMB12());
			document.append("ataque12", plusminus.getAtaque12());
			document.append("defensa12", plusminus.getDefensa12());
			document.append("player13", plusminus.getPlayer13());
			document.append("played13", plusminus.getPlayed13());
			document.append("PMI13", plusminus.getPMI13());
			document.append("PMB13", plusminus.getPMB13());
			document.append("ataque13", plusminus.getAtaque13());
			document.append("defensa13", plusminus.getDefensa13());
			document.append("player14", plusminus.getPlayer14());
			document.append("played14", plusminus.getPlayed14());
			document.append("PMI14", plusminus.getPMI14());
			document.append("PMB14", plusminus.getPMB14());
			document.append("ataque14", plusminus.getAtaque14());
			document.append("defensa14", plusminus.getDefensa14());
			document.append("player15", plusminus.getPlayer15());
			document.append("played15", plusminus.getPlayed15());
			document.append("PMI15", plusminus.getPMI15());
			document.append("PMB15", plusminus.getPMB15());
			document.append("ataque15", plusminus.getAtaque15());
			document.append("defensa15", plusminus.getDefensa15());
			//coleccion.insertOne(document);
		}
	}
}
