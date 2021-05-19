package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


import backend.dominio.User;
import junit.framework.TestCase;

@SpringBootTest
public class TestPlusMinus {

	@Before
	public void setUp() {
	}
	
	@Test
	public void archivo_userCorrectoPM () {
		User dani = new User("danigcj98", "Daniel.Gonzalez24@alu.uclm.es", "Pwd123", "Pwd123", "nombre", "apellido", "imagen");
		try {
			if (dani.getUsername() != null) {
				assertTrue("This will succeed.", true);
			} else {
				assertTrue("This will fail!", false);
			}
		} catch (Exception e) {
		}
	}
}