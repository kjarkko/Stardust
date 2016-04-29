package kjarkko.stardust;

import java.awt.Color;
import kjarkko.stardust.gui.StartWindow;
import kjarkko.stardust.logic.Planet;
import kjarkko.stardust.logic.Planets;
import kjarkko.stardust.logic.Settings;
import kjarkko.stardust.util.Coordinate;
import kjarkko.stardust.util.Vector;

public class Main {
    
    private static final Planet EARTH = new Planet(
            new Coordinate(0, 0),
            new Vector(0, 0),
            5.97237E24,
            Color.blue,
            "earth",
            100);
    private static final Planet MOON = new Planet(
            new Coordinate(384399000, 0),
            new Vector(0, 1022),
            7.324E22,
            Color.white,
            "moon",
            50);

    /**
     * Start the program.
     *
     * @param args Not used.
     */
    public static void main(String[] args) {
        Settings.setDefault();
        Planets.clear();
        StartWindow.start();

        //earthAndMoon();
    }

    private static void earthAndMoon() {
        Planets.get().add(EARTH);
        Planets.get().add(MOON);
    }
}
