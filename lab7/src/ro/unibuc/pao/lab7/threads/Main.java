package ro.unibuc.pao.lab7.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    private static List<Integer> values = new ArrayList<>();

    private static void setup() {
        int N = 1000;
        Random r = new Random();
        for (int i = 0; i < N; i++) {
            values.add(r.nextInt(1000));
        }
    }

    public static void main(String args[]) throws InterruptedException {
        setup();

        ExecutorService service = Executors.newFixedThreadPool(100);

        while (values.size() > 1) {
            for (int i = 0; i < values.size() / 2; i++) {
                SumThread s = new SumThread();
                s.setVals(values);
                service.submit(s);
            }
            while (!service.isTerminated()) {
                Thread.sleep(100);
            }
            for (Integer i : values) {
                System.out.print(i);
            }
            System.out.println();
        }


        System.out.println("\n\nrezultatul este: " + values.get(0));
    }
}

class SumThread implements Runnable {
    private List<Integer> vals;
    private int a, b;

    private static Object LOCK = new Object();

    public void setVals(List<Integer> vals) {
        this.vals = vals;
    }

    @Override
    public void run() {
        extractValues();
    }

    private void extractValues() {
        synchronized (LOCK) {
            a = vals.remove(0);
            b = vals.remove(0);
            vals.add(a + b);
        }
    }
}
