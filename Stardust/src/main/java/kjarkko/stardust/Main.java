
package kjarkko.stardust;

import java.awt.Color;
import javax.swing.JPanel;
import kjarkko.stardust.gui.ControlPanel;
import kjarkko.stardust.gui.PlanetCanvas;
import kjarkko.stardust.gui.StartWindow;
import kjarkko.stardust.logic.Planet;
import kjarkko.stardust.logic.Planets;
import kjarkko.stardust.logic.Scheduler;
import kjarkko.stardust.logic.Settings;
import kjarkko.stardust.util.Coordinate;
import kjarkko.stardust.util.Vector;

public class Main {
    public static PlanetCanvas canv;

    public static void main(String[] args) {
        Settings.setSimulationSpeedMultiplier(100);
        Settings.setScreenRefreshRateMS(100);
        Planet earth = new Planet(
                new Coordinate(0, 0), 
                new Vector(0, 0), 
                5.97237E24, 
                Color.blue, 
                "earth", 
                100);
        Planet moon = new Planet(
                new Coordinate(384399000, 0), 
                new Vector(0, 1022), 
                7.324E22, 
                Color.white, 
                "moon", 
                50);
        Planet asd = new Planet(
                new Coordinate(-250000000, 250000000), 
                new Vector(-1000, 1022), 
                7.324E26, 
                Color.red, 
                "moon", 
                120);
        Planet asd2 = new Planet(
                new Coordinate(250000000, -250000000), 
                new Vector(1000, -1022), 
                7.324E26, 
                Color.red, 
                "moon", 
                120);
        
//        Planets.get().add(earth);
//        Planets.get().add(moon);
        Planets.get().add(asd);
        Planets.get().add(asd2);
        
        canv = new PlanetCanvas();
        Scheduler.start();
        StartWindow.start();
    }
}
