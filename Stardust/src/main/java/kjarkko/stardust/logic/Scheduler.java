package kjarkko.stardust.logic;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Static class designed to call planets.update() at a set interval.
 *
 * @author jarkko
 */
public class Scheduler {

    private static final Timer TIMER;
    private static boolean isRunning;

    static {
        TIMER = new Timer();
        isRunning = false;
    }

    /**
     * starts the simulation. if already running, does nothing.
     */
    public static void start() {
        if (isRunning) {
            return;
        }

        isRunning = true;
        generateTask();
    }

    /**
     * stops the simulation. if not running, does nothing.
     */
    public static void stop() {
        isRunning = false;
    }

    /**
     * Is the program currently running.
     *
     * @return yes/no
     */
    public static boolean isRunning() {
        return isRunning;
    }

    private static void generateTask() {
        if (!isRunning) {
            return;
        }

        TIMER.schedule(new TimerTask() {
            @Override
            public void run() {
                Planets.get().update();
                generateTask();
            }
        }, Settings.getScreenRefreshRateMS());
    }
}
