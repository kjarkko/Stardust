/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kjarkko.stardust.logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static kjarkko.stardust.logic.Settings.*;

/**
 *
 * @author jarkko
 */
public class SettingsTest {

    public SettingsTest() {
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
    public void testSetDefault() {
        Settings.setDefault();
        assertEquals(17, getScreenRefreshRateMS());
        assertEquals(5, getPlanetUpdateRateMS());
        assertEquals(1, getSimulationSpeedMultiplier());
        assertEquals((int) (1000 / 5), getElapsedTimeMS());
    }

    @Test
    public void testScreenRefreshRateMS() {
        setDefault();
        setScreenRefreshRateMS(153);
        assertEquals(153, getScreenRefreshRateMS());
    }

    @Test
    public void testScreenRefreshRateMSZero() {
        setDefault();
        setScreenRefreshRateMS(0);
        assertEquals(17, getScreenRefreshRateMS());
    }

    @Test
    public void testScreenRefreshRateMSNeg() {
        setDefault();
        setScreenRefreshRateMS(-1);
        assertEquals(17, getScreenRefreshRateMS());
    }

    @Test
    public void testPlanetUpdateRateMS() {
        setDefault();
        setPlanetUpdateRateMS(564);
        assertEquals(564, getPlanetUpdateRateMS());
    }

    @Test
    public void testPlanetUpdateRateMSZero() {
        setDefault();
        setPlanetUpdateRateMS(0);
        assertEquals(5, getPlanetUpdateRateMS());
    }

    @Test
    public void testPlanetUpdateRateMSNeg() {
        setDefault();
        setPlanetUpdateRateMS(-1);
        assertEquals(5, getPlanetUpdateRateMS());
    }

    @Test
    public void testSimulationSpeedMultiplier() {
        setDefault();
        setSimulationSpeedMultiplier(634);
        assertEquals(634, getSimulationSpeedMultiplier());
    }

    @Test
    public void testSimulationSpeedMultiplierZero() {
        setDefault();
        setSimulationSpeedMultiplier(0);
        assertEquals(1, getSimulationSpeedMultiplier());
    }

    @Test
    public void testSimulationSpeedMultiplierNeg() {
        setDefault();
        setSimulationSpeedMultiplier(-1);
        assertEquals(1, getSimulationSpeedMultiplier());
    }

    @Test
    public void testGetElapsedTimeMS() {

    }

}
