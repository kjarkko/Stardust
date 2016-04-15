package kjarkko.stardust.logic;

import java.awt.Color;
import static kjarkko.stardust.logic.FileReader.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FileReaderTest {

    public FileReaderTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        reset();
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

    private boolean settingsUnchanged() {
        return Settings.getScreenRefreshRateMS() == 17
                && Settings.getPlanetUpdateRateMS() == 5
                && Settings.getSimulationSpeedMultiplier() == 1;
    }

    @Test
    public void testParseLine1() { // empty line
        parseLine("");
        assertTrue(settingsUnchanged());
        assertTrue(getCreatedPlanets().isEmpty());
    }

    @Test
    public void testParseLine2() { // comment
        parseLine("#aölweghioöahne");
        assertTrue(settingsUnchanged());
        assertTrue(getCreatedPlanets().isEmpty());
    }

    @Test
    public void testParseLine3() { // planet 1
        parseLine("p");
        assertTrue(settingsUnchanged());
        assertTrue(getCreatedPlanets().isEmpty());
    }

    @Test
    public void testParseLine4() { // planet 2
        parseLine("p ; 1 ; 1 ; 1-1 ; 1-1 ; 0xffffff ; asd;;");
        assertTrue(settingsUnchanged());
        assertTrue(!getCreatedPlanets().isEmpty());
    }

    @Test
    public void testCreatePlanetCorrectInputNotNull() {
        assertNotEquals(null, createPlanet(
                "p ; 1 ; 1 ; 1-1 ; 1-1 ; 0xffffff ; asd;;"
        ));
    }

    @Test
    public void testCreatePlanetCorrectInputParametersEqual() {
        Planet p = createPlanet("p ; 1 ; 2 ; 3-4 ; 5-6 ; 0xffffff ; asd;;");
        assertEquals(1, p.radius, 0.01);
        assertEquals(2, p.mass, 0.01);

        assertEquals(3, p.getLocation().getX(), 0.01);
        assertEquals(4, p.getLocation().getY(), 0.01);

        assertEquals(5, p.getVelocity().getX(), 0.01);
        assertEquals(6, p.getVelocity().getY(), 0.01);

        assertEquals(Color.decode("0xffffff"), p.getColor());
        assertEquals("asd;;", p.getName());
    }

    @Test
    public void testCreatePlanetIncorrectInput() {
        assertEquals(null, createPlanet("p"));
        assertEquals(null, createPlanet("p;;;;;;"));
    }
}
