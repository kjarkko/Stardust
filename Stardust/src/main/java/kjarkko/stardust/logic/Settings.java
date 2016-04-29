package kjarkko.stardust.logic;

/**
 * General settings related to the program.
 *
 * @author jarkko
 */
public class Settings {

    /**
     * The time in milliseconds between each screen refresh.
     */
    private static int screenRefreshRateMS;

    /**
     * The time in milliseconds between each time the location of the planets
     * are updated.
     */
    private static int planetUpdateRateMS;
    /**
     * Examples: 3600 = 1 hour inside the simulation for each second passed.
     * 86400 = 1 day per second.
     */
    private static int simulationSpeedMultiplier;
    private static double distancePerPixel;

    static {
        setDefault();
        distancePerPixel = 1200000; // earth/moon
    }

    /**
     * Resets all the settings to their default values.
     */
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

    /**
     * Set new value.
     *
     * @param screenRefreshRateMS new value.
     */
    public static void setScreenRefreshRateMS(int screenRefreshRateMS) {
        if (screenRefreshRateMS > 0) {
            Settings.screenRefreshRateMS = screenRefreshRateMS;
        }
    }

    /**
     * Set new value.
     *
     * @param planetUpdateRateMS new value.
     */
    public static void setPlanetUpdateRateMS(int planetUpdateRateMS) {
        if (planetUpdateRateMS > 0) {
            Settings.planetUpdateRateMS = planetUpdateRateMS;
        }
    }

    /**
     * Set new value.
     *
     * @param simulationSpeedMultiplier new value.
     */
    public static void setSimulationSpeedMultiplier(int simulationSpeedMultiplier) {
        if (simulationSpeedMultiplier > 0) {
            Settings.simulationSpeedMultiplier = simulationSpeedMultiplier;
        }
    }

    /**
     * Set new value.
     *
     * @param distancePerPixel new value.
     */
    public static void setDistancePerPixel(double distancePerPixel) {
        Settings.distancePerPixel = distancePerPixel;
    }

    /**
     * Time elapsed within the simulation in seconds.
     *
     * @return the time elapsed (inside the simulation) in seconds since the
     * last update
     */
    public static double getElapsedTime() {
        return simulationSpeedMultiplier / planetUpdateRateMS;
    }
}
