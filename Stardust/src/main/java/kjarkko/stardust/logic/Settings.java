package kjarkko.stardust.logic;

public class Settings {

    private static int screenRefreshRateMS;
    private static int planetUpdateRateMS;
    private static int simulationSpeedMultiplier;

    static {
        screenRefreshRateMS = 17; // Approximately 60Hz
        planetUpdateRateMS = 5;
        simulationSpeedMultiplier = 1;
    }

    public static int getRefreshRateMS() {
        return screenRefreshRateMS;
    }

    public static int getPlanetUpdateFrequencyMS() {
        return planetUpdateRateMS;
    }

    public static int getSimulationSpeedMultiplier() {
        return simulationSpeedMultiplier;
    }

    public static void setRefreshRateMS(int refreshRateMS) {
        Settings.screenRefreshRateMS = refreshRateMS;
    }

    public static void setPlanetUpdateFrequencyMS(int planetUpdateRateMS) {
        Settings.planetUpdateRateMS = planetUpdateRateMS;
    }

    public static void setSimulationSpeedMultiplier(int simulationSpeedMultiplier) {
        Settings.simulationSpeedMultiplier = simulationSpeedMultiplier;
    }

    public static int getElapsedTime() {
        return simulationSpeedMultiplier / planetUpdateRateMS;
    }
}
