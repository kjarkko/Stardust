package kjarkko.stardust.logic;

/**
 * general settings related to the program
 *
 * @author jarkko
 */
public class Settings {

    /**
     * the time in milliseconds between each screen refresh
     */
    private static int screenRefreshRateMS;
    /**
     * the time in milliseconds between each time the location of the planets
     * are updated
     */
    private static int planetUpdateRateMS;
    /**
     * examples: 3600 = 1 hour inside the simulation for each second passed
     * 86400 = 1 day per second
     */
    private static int simulationSpeedMultiplier;
    private static double distancePerPixel;

    static {
        setDefault();
        distancePerPixel = 1200000; // earth/moon
    }

    public static void setDefault() {
        screenRefreshRateMS = 17; 
        planetUpdateRateMS = 5;
        simulationSpeedMultiplier = 1;
    }

    public static int getScreenRefreshRateMS() {
        return screenRefreshRateMS;
    }

    public static int getPlanetUpdateRateMS() {
        return planetUpdateRateMS;
    }

    public static int getSimulationSpeedMultiplier() {
        return simulationSpeedMultiplier;
    }

    public static double getDistancePerPixel() {
        return distancePerPixel;
    }

    public static void setScreenRefreshRateMS(int screenRefreshRateMS) {
        if (screenRefreshRateMS > 0) {
            Settings.screenRefreshRateMS = screenRefreshRateMS;
        }
    }

    public static void setPlanetUpdateRateMS(int planetUpdateRateMS) {
        if (planetUpdateRateMS > 0) {
            Settings.planetUpdateRateMS = planetUpdateRateMS;
        }
    }

    public static void setSimulationSpeedMultiplier(int simulationSpeedMultiplier) {
        if (simulationSpeedMultiplier > 0) {
            Settings.simulationSpeedMultiplier = simulationSpeedMultiplier;
        }
    }

    public static void setDistancePerPixel(double distancePerPixel) {
        Settings.distancePerPixel = distancePerPixel;
    }

    /**
     *
     * @return the time elapsed (inside the simulation) in seconds since the
     * last update
     */
    public static double getElapsedTime() {
        return simulationSpeedMultiplier / planetUpdateRateMS;
//        return (simulationSpeedMultiplier * 1000) / planetUpdateRateMS;
    }
}
