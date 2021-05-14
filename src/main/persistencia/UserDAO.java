package backend.persistencia;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.springframework.stereotype.Repository;

import backend.dominio.User;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

@Repository
public final class UserDAO {
	public static final String USUARIO = "Usuarios"; //"Usuarios" es el nombre de la coleccion
	public static final String GRAFOS = "Grafos"; //"Grafos" es el nombre de la coleccion

	public static void insertar(User user) {
		Document document;
		MongoCollection<Document> coleccion;
		if (user != null) {
			coleccion = AgenteDB.get().getBd(USUARIO);
			document = new Document("username", user.getUsername());
			document.append("email", user.getEmail());
			document.append("pwd1", user.getPassword1());
			document.append("pwd2", user.getPassword2());
			document.append("name", user.getName());
			document.append("apellidos", user.getApellidos());
			document.append("imagen", user.getImagen());

			coleccion.insertOne(document);
		}
	}
	
	public static void uploadexcel(User user) {
		Document document;
		MongoCollection<Document> coleccion;
		if (user != null) {
			coleccion = AgenteDB.get().getBd(USUARIO);
			document = new Document("doc", user.getUsername());
			coleccion.insertOne(document);

		}
	}
	
	public static List<User> leerUsers() {
		ArrayList<User> usuarios = new ArrayList<>();
		Document document;
		User u;
		MongoCollection<Document> coleccion = AgenteDB.get().getBd(USUARIO);
		MongoCursor<Document> iter = coleccion.find().iterator();

		while ((iter.hasNext())) {
			document = iter.next();
			u = new User(document.getString("username"), document.getString("email"),
					document.getString("pwd1"), document.getString("pwd2"), document.getString("name"),
					document.getString("apellidos"), document.getString("imagen"));
			usuarios.add(u);
		}
		return usuarios;
	}

}
