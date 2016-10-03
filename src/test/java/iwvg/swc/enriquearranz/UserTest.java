package iwvg.swc.enriquearranz;

import static org.junit.Assert.*;
import iwvg.swc.enriquearranz.User;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	User user;
	
	@Before
	public void before(){
		user = new User(23, 11,"Enrique", "Arranz");
	}

	@Test
	public void testUser() {
		assertEquals(23, user.getNumber());
		assertEquals(11, user.getAge());
		assertEquals("Enrique", user.getName());
		assertEquals("Arranz", user.getFamilyName());
	}

	@Test
	public void testFullName() {
		assertEquals("Enrique Arranz", user.fullName());
	}

	@Test
	public void testInitials() {
		assertEquals("AE23", user.initials());
	}

	@Test
	public void testGetNumber() {
		assertEquals(23, user.getNumber());
	}
	
	@Test
	public void testGetAge() {
		assertEquals(11, user.getAge());
	}

	@Test
	public void testGetName() {
		assertEquals("Enrique", user.getName());
	}

	@Test
	public void testGetFamilyName() {
		assertEquals("Arranz", user.getFamilyName());
	}
	
	@Test
	public void testGetTag() {
		assertEquals("AE23", user.initials());
	}
	

}
