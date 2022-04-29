package ro.unibuc.pao.threads.synchronization;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
public class Main {

    public static int count = 0;

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(20);
        for (int i = 0; i < 2; i++) {
            service.submit(new IncrementingThread(500_000));
        }
        service.shutdown();

        while (!service.isTerminated()) {
            Thread.sleep(100);
        }

        log.info("Actual increment: {}", count);
    }
}
