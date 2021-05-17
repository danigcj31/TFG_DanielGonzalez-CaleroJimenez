package backend.ws;

import org.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import backend.dominio.Manager;
import java.io.*;
import java.util.*;
import com.fasterxml.jackson.*;
@Component
public class SpringWebSocket extends TextWebSocketHandler {
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		Manager.get().setSession(session);
	}

	@Override
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
		JSONObject jso = new JSONObject(message.getPayload().toString());
		switch (jso.getString("type")) {
		case "register":
			Manager.get().register(jso.getString("username"), jso.getString("email"), jso.getString("pwd1"), jso.getString("pwd2"), jso.getString("name"), jso.getString("apellidos"),jso.getString("imagen"));
			break;
		case "mapasRendimiento":
			//Manager.get().register(jso.getString("username"), jso.getString("email"), jso.getString("pwd1"), jso.getString("pwd2"), jso.getString("name"), jso.getString("apellidos"));
			break;
		default:
			break;
		}
	}
}
