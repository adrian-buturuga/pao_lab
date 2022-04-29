package ro.unibuc.pao.threads.simple;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Thread> horses = new ArrayList<>();
        Race race = new Race();

        for (int i = 0; i < 10; i++) {
            horses.add(new HorseThread(i, race));
        }

        for (Thread horse : horses) {
            horse.start();
        }

    }

}
