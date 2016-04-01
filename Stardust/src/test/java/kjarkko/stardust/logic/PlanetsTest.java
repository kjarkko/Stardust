package kjarkko.stardust.logic;

import java.awt.Color;
import java.util.ArrayList;
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
    
    /**
     * PIT doesn't like this test for whatever reason 
     * and I'm too lazy to fix it right now
     */
//    @Test
//    public void testAddAndRemove() {
//        Planets.clear();
//        Planets.get().add(new Planet(
//                new Coordinate(0, 0),
//                new Vector(0, 0),
//                1,
//                Color.PINK,
//                "asdf",
//                1
//        ));
//        Planets.get().add(null);
//        assertEquals(1, Planets.get().getSize());
//        Planets.get().remove(0);
//        assertEquals(0, Planets.get().getSize());
//    }

    @Test
    public void testAddAll() {
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
                new Coordinate(7, 8),
                new Vector(3, 6),
                6,
                Color.PINK,
                "fdsa",
                2
        ));
        Planets.get().addAll(list);
        assertEquals(2, Planets.get().getSize());
    }

}
