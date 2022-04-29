package ro.unibuc.pao.threads.executor;

import ro.unibuc.pao.threads.simple.HorseThread;
import ro.unibuc.pao.threads.simple.Race;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);

        Race race = new Race();

        for (int i = 0; i < 10; i++) {
            service.submit(new HorseThread(i, race));
        }
    }
}
