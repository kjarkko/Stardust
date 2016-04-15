package kjarkko.stardust.logic;

import java.util.Timer;
import java.util.TimerTask;

/**
 * static class designed to call planets.update() at a set interval
 *
 * @author jarkko
 */
public class Scheduler {

    private static final TimerTask TASK;
    private static final Timer TIMER;
    private static boolean isRunning;
    private static int taskFreq;

    static {
        TASK = new TimerTask() {
            @Override
            public void run() {
                if (updateFreqHasChanged()) {
                    TASK.cancel();
                    newTask();
                    return;
                }

                Planets.get().update();
            }
        };

        TIMER = new Timer();
        isRunning = false;
    }

    public static boolean updateFreqHasChanged() {
        return taskFreq != Settings.getPlanetUpdateRateMS();
    }

    /**
     * starts the simulation. if already running, does nothing.
     */
    public static void start() {
        if (isRunning) {
            return;
        }

        newTask();
        isRunning = true;
    }

    /**
     * stops the simulation. if not running, does nothing.
     */
    public static void stop() {
        if (!isRunning) {
            return;
        }

        isRunning = false;
        TIMER.cancel();

    }

    private static void newTask() {
        taskFreq = Settings.getPlanetUpdateRateMS();
        TIMER.scheduleAtFixedRate(TASK, 0, taskFreq);
    }

    /**
     *
     * @return is the simulation currently running
     */
    public static boolean isRunning() {
        return isRunning;
    }
}
