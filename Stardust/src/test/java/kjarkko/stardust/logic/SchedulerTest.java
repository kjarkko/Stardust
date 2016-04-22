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
import static kjarkko.stardust.logic.Scheduler.*;

/**
 *
 * @author jarkko
 */
public class SchedulerTest {
    
    public SchedulerTest() {
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
    public void testUpdateFreqHasChanged() {
        start();
        Settings.setDefault();
        assertFalse(updateFreqHasChanged());
        Settings.setPlanetUpdateRateMS(3565465);
        assertTrue(updateFreqHasChanged());
        stop();
        
        sleep();
    }

    @Test
    public void testIsRunning() {
        start();
        assertTrue(isRunning());
        stop();
        assertFalse(isRunning());
        
        sleep();
    }
    
    
    private void sleep(){
        try{
            Thread.sleep(50l);
        }
        catch(InterruptedException a){
            
        }
    }
}
