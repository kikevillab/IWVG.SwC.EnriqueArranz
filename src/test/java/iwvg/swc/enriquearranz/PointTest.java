package iwvg.swc.enriquearranz;

import static org.junit.Assert.assertEquals;
import iwvg.swc.enriquearranz.Point;

import org.junit.Before;
import org.junit.Test;

public class PointTest {
    private Point pt;

    @Before
    public void before() {
        pt = new Point(2, 3);
    }

    @Test
    public void testPuntoIntInt() {
        assertEquals(2, pt.getX());
        assertEquals(3, pt.getY());
    }

    @Test
    public void testPunto() {
        pt = new Point();
        assertEquals(0, pt.getX());
        assertEquals(0, pt.getY());
    }

    @Test
    public void testModulo() {
        assertEquals(3.6055, pt.module(), 10e-5);
    }

    @Test
    public void testFase() {
        assertEquals(0.9828, pt.phase(), 10e-5);
    }

    @Test
    public void testTranslate() {
        this.pt.translateOrigin(new Point(1, 1));
        assertEquals(1, pt.getX());
        assertEquals(2, pt.getY());
    }

    @Test
    public void testToString() {
        assertEquals("Point[2,3]", pt.toString());
    }
    
    @Test
    public void testGetDistance() {
        assertEquals(Math.sqrt(10), pt.getDistance(new Point(5, 4)), 0.001);
    }

}