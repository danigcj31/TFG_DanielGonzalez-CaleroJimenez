package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


import backend.dominio.User;
import junit.framework.TestCase;

@SpringBootTest
public class TestGettersSetters {

	@Before
	public void setUp() {
	}
	
	@Test
	public void pwdCorrecta () {
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
	public void emailCorrecto () {
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
	public void imagenDisponible () {
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
	
	
	private boolean isEmailCorrecto(String email) {
		// TODO Auto-generated method stub
		return true;
	}

	private boolean isPwdCorrecta(String password1) {
		// TODO Auto-generated method stub
		return true;
	}
}