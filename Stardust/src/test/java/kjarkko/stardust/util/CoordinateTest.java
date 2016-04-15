/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kjarkko.stardust.util;

import kjarkko.stardust.util.Coordinate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jarkko
 */
public class CoordinateTest {

    public CoordinateTest() {
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
    public void testDistance1() {
        Coordinate c1 = new Coordinate(-5, -5);
        Coordinate c2 = new Coordinate(5, 5);
        assertEquals(14.14, c1.distance(c2), 0.01);
    }

    @Test
    public void testDistance2() {

    }

    @Test
    public void testXDistance1() {
        Coordinate c1 = new Coordinate(1, 1);
        Coordinate c2 = new Coordinate(-2, -2);
        assertEquals(3, c1.xDistance(c2), 0.001);
    }

    @Test
    public void testXDistance2() {
        Coordinate c1 = new Coordinate(-9, 7);
        Coordinate c2 = new Coordinate(-2, -2);
        assertEquals(7, c1.xDistance(c2), 0.001);
    }

    @Test
    public void testXDistance3() {
        Coordinate c1 = new Coordinate(5, 1);
        Coordinate c2 = new Coordinate(7, -9);
        assertEquals(2, c1.xDistance(c2), 0.001);
    }

    @Test
    public void testYDistance1() {
        Coordinate c1 = new Coordinate(5, 1);
        Coordinate c2 = new Coordinate(7, -9);
        assertEquals(10, c1.yDistance(c2), 0.001);
    }

    @Test
    public void testYDistance2() {
        Coordinate c1 = new Coordinate(5, 1);
        Coordinate c2 = new Coordinate(7, 4);
        assertEquals(3, c1.yDistance(c2), 0.001);
    }

    @Test
    public void testYDistance3() {
        Coordinate c1 = new Coordinate(5, -5);
        Coordinate c2 = new Coordinate(7, -9);
        assertEquals(4, c1.yDistance(c2), 0.001);
    }

    @Test
    public void testAddX() {
        Coordinate c = new Coordinate(0, 0);
        c.addX(5);
        assertEquals(5, c.getX(), 0.001);
    }

    @Test
    public void testAddY() {
        Coordinate c = new Coordinate(0, 0);
        c.addY(5);
        assertEquals(5, c.getY(), 0.001);
    }

    @Test
    public void testSet() {
        Coordinate c = new Coordinate(0, 0);
        c.setX(5);
        c.setY(4);
        assertEquals(5, c.getX(), 0.01);
        assertEquals(4, c.getY(), 0.01);
    }
}
