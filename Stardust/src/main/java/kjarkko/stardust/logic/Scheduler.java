package kjarkko.stardust.logic;

import java.util.Timer;
import java.util.TimerTask;

/**
 * static class designed to call planets.update() at a set interval
 *
 * @author jarkko
 */
public class Scheduler {

    private static TimerTask task;
    private static Timer timer;
    private static boolean isRunning;
    private static int taskFreq;

    static {
        taskFreq = Settings.getPlanetUpdateRateMS();
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

        isRunning = true;
        newTask();
    }

    /**
     * stops the simulation. if not running, does nothing.
     */
    public static void stop() {
        if (!isRunning) {
            return;
        }

        isRunning = false;
        timer.cancel();
        task.cancel();
    }

    private static void newTask() {
        taskFreq = Settings.getPlanetUpdateRateMS();
        task = generateTask();
        timer = new Timer();
        timer.scheduleAtFixedRate(task, 0, taskFreq);
    }

    /**
     *
     * @return is the simulation currently running
     */
    public static boolean isRunning() {
        return isRunning;
    }

    private static TimerTask generateTask() {
        return new TimerTask() {
            @Override
            public void run() {
                if (updateFreqHasChanged()) {
                    stop();
                    newTask();
                    return;
                }

                Planets.get().update();
            }
        };
    }
}
