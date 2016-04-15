package kjarkko.stardust.logic;

public class Settings {

    private static int screenRefreshRateMS;
    private static int planetUpdateRateMS;
    private static int simulationSpeedMultiplier;

    static {
        setDefault();
    }

    public static void setDefault() {
        screenRefreshRateMS = 17; // Approximately 60Hz
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

    public static int getElapsedTimeMS() {
        return (simulationSpeedMultiplier * 1000) / planetUpdateRateMS;
    }
}
