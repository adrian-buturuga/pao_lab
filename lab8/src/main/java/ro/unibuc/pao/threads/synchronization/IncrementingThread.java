package ro.unibuc.pao.threads.synchronization;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IncrementingThread implements Runnable {

    private int increment;

    public IncrementingThread(int increment) {
        this.increment = increment;
    }

    @Override
    @SneakyThrows
    public void run() {
        incr();
    }

    private void incr() {
        for (int i = 0; i < increment; i++) {
            Main.count = Main.count + 1;
        }
    }
}
