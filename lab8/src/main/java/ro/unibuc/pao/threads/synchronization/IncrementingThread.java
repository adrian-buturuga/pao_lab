package ro.unibuc.pao.threads.synchronization;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IncrementingThread implements Runnable {

    private int increment;
    private static final Object LOCK = new Object();

    public IncrementingThread(int increment) {
        this.increment = increment;
    }

    @Override
    public void run() {
        incr();
    }

    private void incr() {
        synchronized (LOCK)
        {
            for (int i = 0; i < increment; i++) {
                Main.count = Main.count + 1;
            }
        }
    }
}
