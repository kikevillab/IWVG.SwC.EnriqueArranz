package iwvg.swc.enriquearranz;

import static org.junit.Assert.*;
import iwvg.swc.enriquearranz.Fraction;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	
	Fraction fr;
	
	@Before
	public void before() throws Exception{
		fr = new Fraction(4, 2);
	}

	@Test
	public void testFractionIntInt() {
		assertEquals(4, fr.getNumerator());
	    assertEquals(2, fr.getDenominator());
	}

	@Test
	public void testFraction() throws Exception {
		fr = new Fraction();
		assertEquals(1, fr.getNumerator());
	    assertEquals(1, fr.getDenominator());
	}

	@Test
	public void testDecimal() {
		assertEquals(2, fr.decimal(), 0);
	}

	@Test
	public void testGetNumerator() {
		assertEquals(4, fr.getNumerator());
	}

	@Test
	public void testGetDenominator() {
		assertEquals(2, fr.getDenominator());
	}

	@Test
	public void testEquals() throws Exception{
		Fraction f = new Fraction(4,2);
		assertEquals(true,fr.equals(f));
	}
	
	@Test
	public void testInverse() throws Exception{
		Fraction f = new Fraction(2,4);
		assertEquals(true, fr.equals(f.inverse()));
	}
	
}
