
package kjarkko.stardust.logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class VectorTest {
    
    public VectorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAddVector() {
        Vector v = new Vector(0, 0);
        
        v.addVector(new Vector(0, 0));
        assertEquals(0, v.getX(), 0.01);
        assertEquals(0, v.getY(), 0.01);
        
        v.addVector(new Vector(5, 7));
        assertEquals(5, v.getX(), 0.01);
        assertEquals(7, v.getY(), 0.01);
        
        v.addVector(new Vector(-3, 9));
        assertEquals(2, v.getX(), 0.01);
        assertEquals(16, v.getY(), 0.01);
        
        v.addVector(new Vector(-2, -16));
        assertEquals(0, v.getX(), 0.01);
        assertEquals(0, v.getY(), 0.01);
    }

    @Test
    public void testCreateNegative() {
        Vector v = new Vector(0, 0).createNegative();
        assertEquals(0, v.getX(), 0.01);
        assertEquals(0, v.getY(), 0.01);
        
        v = new Vector(4, 5).createNegative();
        assertEquals(-4, v.getX(), 0.01);
        assertEquals(-5, v.getY(), 0.01);
        
        v = new Vector(7, -3).createNegative();
        assertEquals(-7, v.getX(), 0.01);
        assertEquals(3, v.getY(), 0.01);
    }
    
}
