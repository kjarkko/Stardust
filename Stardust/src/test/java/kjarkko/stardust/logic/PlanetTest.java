
package kjarkko.stardust.logic;

import java.awt.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlanetTest {
    
    public PlanetTest() {
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
    public void testUpdateLocation1() {
        Planet p = new Planet(
                new Coordinate(0, 0),
                new Vector(0, 0),
                1,
                Color.PINK,
                "asdf",
                1
        );
        
        p.updateLocation(354786);
        assertEquals(0, p.getLocation().getX(), 0.01);
        assertEquals(0, p.getLocation().getY(), 0.01);
        
        p.updateLocation(12345);
        assertEquals(0, p.getLocation().getX(), 0.01);
        assertEquals(0, p.getLocation().getY(), 0.01);
        
        p.getMovement().addVector(new Vector(1, 1));
        p.getMovement().addVector(new Vector(-1, -1));
        p.updateLocation(314159);
        assertEquals(0, p.getLocation().getX(), 0.01);
        assertEquals(0, p.getLocation().getY(), 0.01);
    }
    
    @Test
    public void testUpdateLocation2() {
        Planet p = new Planet(
                new Coordinate(0, 0),
                new Vector(2, 3),
                1,
                Color.PINK,
                "asdf",
                1
        );
        
        p.updateLocation(10);
        assertEquals(20, p.getLocation().getX(), 0.01);
        assertEquals(30, p.getLocation().getY(), 0.01);
        
        p.updateLocation(5);
        assertEquals(30, p.getLocation().getX(), 0.01);
        assertEquals(45, p.getLocation().getY(), 0.01);
    }
    
    @Test
    public void testUpdateLocation3(){
        Planet p = new Planet(
                new Coordinate(0, 0),
                new Vector(5, 5),
                1,
                Color.PINK,
                "asdf",
                1
        );
        
        p.updateLocation(2);
        assertEquals(10, p.getLocation().getX(), 0.01);
        assertEquals(10, p.getLocation().getY(), 0.01);
        
        p.getMovement().addVector(new Vector(-10, -5));
        p.updateLocation(1);
        assertEquals(5, p.getLocation().getX(), 0.01);
        assertEquals(10, p.getLocation().getY(), 0.01);
        
        p.getMovement().addVector(new Vector(2.5, -5));
        p.updateLocation(2);
        assertEquals(0, p.getLocation().getX(), 0.01);
        assertEquals(0, p.getLocation().getY(), 0.01);
    }
    
}
