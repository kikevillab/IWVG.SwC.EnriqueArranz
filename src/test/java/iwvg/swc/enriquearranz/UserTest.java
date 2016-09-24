package iwvg.swc.enriquearranz;

import static org.junit.Assert.*;
import iwvg.swc.enriquearranz.User;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	User user;
	
	@Before
	public void before(){
		user = new User(23, "Enrique", "Arranz");
	}

	@Test
	public void testUser() {
		assertEquals(23, user.getNumber());
		assertEquals("Enrique", user.getName());
		assertEquals("Arranz", user.getFamilyName());
	}

	@Test
	public void testFullName() {
		assertEquals("Enrique Arranz", user.fullName());
	}

	@Test
	public void testInitials() {
		assertEquals("E.", user.initials());
	}

	@Test
	public void testGetNumber() {
		assertEquals(23, user.getNumber());
	}

	@Test
	public void testGetName() {
		assertEquals("Enrique", user.getName());
	}

	@Test
	public void testGetFamilyName() {
		assertEquals("Arranz", user.getFamilyName());
	}

}
