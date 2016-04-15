package kjarkko.stardust.logic;

import kjarkko.stardust.util.Vector;
import kjarkko.stardust.util.Coordinate;
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

    @Test
    public void testAdd() {
        Planets.clear();
        Planets.get().add(new Planet(
                new Coordinate(0, 0),
                new Vector(0, 0),
                1,
                Color.PINK,
                "asdf",
                1
        ));
        Planets.get().add(new Planet(
                new Coordinate(0, 0),
                new Vector(0, 0),
                1,
                Color.PINK,
                "asdf",
                1
        ));
        Planets.get().add(null);
        assertEquals(2, Planets.get().size());
    }

    @Test
    public void testRemove() {
        Planets.clear();
        Planet p = new Planet(
                new Coordinate(0, 0),
                new Vector(0, 0),
                1,
                Color.PINK,
                "asdf",
                1
        );
        Planets.get().add(p);
        Planets.get().add(new Planet(
                new Coordinate(0, 0),
                new Vector(0, 0),
                1,
                Color.PINK,
                "asdf",
                1
        ));
        Planets.get().remove(p.id);
        Planets.get().remove(-1);
        assertEquals(1, Planets.get().size());
    }

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
        assertEquals(2, Planets.get().size());
    }

}
