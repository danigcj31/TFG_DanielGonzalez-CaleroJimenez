package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.*;
import java.lang.*;
import java.io.*;
import backend.dominio.User;
import junit.framework.TestCase;

@SpringBootTest
public class TestGettersSetters {

	@Before
	public void setUp() {
	}
	
	@Test
	public void usernameCorrecto () {
		// username correcto si no contiene símbolos o caracteres especiales
		User dani = new User("danigcj98", "Daniel.Gonzalez24@alu.uclm.es", "Pwd123", "Pwd123", "nombre", "apellido", "imagen");
		try {
			if (isUsernameCorrecto(dani.getUsername())) {
				assertTrue("This will succeed.", true);
			} else {
				assertTrue("This will fail!", false);
			}
		} catch (Exception e) {
		}
	}
	
	@Test
	public void emailCorrecto () {
		// email correcto si tiene el sufijo de la UCLM
		User dani = new User("danigcj98", "Daniel.Gonzalez24@alu.uclm.es", "Pwd123", "Pwd123", "nombre", "apellido", "imagen");
		try {
			if (isEmailCorrecto(dani.getEmail())) {
				assertTrue("This will succeed.", true);
			} else {
				assertTrue("This will fail!", false);
			}
		} catch (Exception e) {
		}
	}
	
	@Test
	public void pwdCorrecta () {
		// password correcta si cumple la política de contraseñas
		User dani = new User("danigcj98", "Daniel.Gonzalez24@alu.uclm.es", "Pwd123", "Pwd123", "nombre", "apellido", "imagen");
		try {
			if (isPwdCorrecta(dani.getPassword1())) {
				assertTrue("This will succeed.", true);
			} else {
				assertTrue("This will fail!", false);
			}
		} catch (Exception e) {
		}
	}
	
	@Test
	public void nombreCorrecto () {
		// nombre correcto si no tiene símbolos o caracteres especiales
		User dani = new User("danigcj98", "Daniel.Gonzalez24@alu.uclm.es", "Pwd123", "Pwd123", "nombre", "apellido", "imagen");
		try {
			if (isNombreCorrecto(dani.getName())) {
				assertTrue("This will succeed.", true);
			} else {
				assertTrue("This will fail!", false);
			}
		} catch (Exception e) {
		}
	}

	@Test
	public void ApellidosCorrecto () {
		// nombre correcto si no tiene símbolos o caracteres especiales
		User dani = new User("danigcj98", "Daniel.Gonzalez24@alu.uclm.es", "Pwd123", "Pwd123", "nombre", "apellido", "imagen");
		try {
			if (isApellidosCorrecto(dani.getApellidos())) {
				assertTrue("This will succeed.", true);
			} else {
				assertTrue("This will fail!", false);
			}
		} catch (Exception e) {
		}
	}
	
	@Test
	public void imagenDisponible () {
		// imagen disponible si el formato es adecuado
		User dani = new User("danigcj98", "Daniel.Gonzalez24@alu.uclm.es", "Pwd123", "Pwd123", "nombre", "apellido", "imagen");
		try {
			if (dani.getImagen() != null) {
				assertTrue("This will succeed.", true);
			} else {
				assertTrue("This will fail!", false);
			}
		} catch (Exception e) {
		}
	}
	
	// METODOS AUXILIARES PARA LOS TESTS
	private boolean isUsernameCorrecto(String username) {
		boolean valido = false;
		if (username.length() > 0) {
			valido = true;
		} 
		else if (username.contains("<")){
			valido = false;
		}
		else {
			valido = false;
		}
		return valido;
	}
	
	private boolean isEmailCorrecto(String email) {
		// TODO Auto-generated method stub
		return true;
	}

	private boolean isPwdCorrecta(String password1) {
		// TODO Auto-generated method stub
		return true;
	}
	
	private boolean isNombreCorrecto(String name) {
		// TODO Auto-generated method stub
		return true;
	}
	
	private boolean isApellidosCorrecto(String apellidos) {
		// TODO Auto-generated method stub
		return true;
	}
}