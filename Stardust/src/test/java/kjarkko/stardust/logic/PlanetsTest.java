
package kjarkko.stardust.logic;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlanetsTest {
    
    public PlanetsTest() {
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
    public void testAddAndRemove() {
        Planets.clear();
        assertEquals(0, Planets.get().getSize());
        Planets.get().add(new Planet(
                new Coordinate(0, 0),
                new Vector(0, 0),
                1,
                Color.PINK,
                "asdf",
                1
        ));
        assertEquals(1, Planets.get().getSize());
        Planets.get().remove(0);
        assertEquals(0, Planets.get().getSize());
    }
    
    @Test
    public void testAddAll(){
        Planets.clear();
        ArrayList<Planet> list = new ArrayList();
        list.add(new Planet(
                new Coordinate(0, 0),
                new Vector(0, 0),
                1,
                Color.PINK,
                "asdf",
                1
        ));
        list.add(null);
        list.add(new Planet(
                new Coordinate(0, 0),
                new Vector(0, 0),
                1,
                Color.PINK,
                "fdsa",
                1
        ));
        Planets.get().addAll(list);
        assertEquals(2, Planets.get().getSize());
        assertEquals(2, Planets.get().getPlanetIdCounter());
    }
    
    @Test
    public void testGetPlanetIdCounter() {
        Planets.clear();
        
        Planets.get().add(null);
        assertEquals(0, Planets.get().getPlanetIdCounter());
        
        Planets.get().add(new Planet(
                new Coordinate(0, 0),
                new Vector(0, 0),
                1,
                Color.PINK,
                "asdf",
                1
        ));
        assertEquals(1, Planets.get().getPlanetIdCounter());
    }
    
}
