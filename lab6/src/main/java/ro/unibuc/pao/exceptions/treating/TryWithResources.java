package ro.unibuc.pao.exceptions.treating;

import java.util.Random;

public class TryWithResources {

    public static void main(String[] args) {

        try (SomeResource res = new SomeResource()) {
            for (int i = 0; i < 20; i++) {
                res.doSomething();
            }
        }

    }

}

class SomeResource implements AutoCloseable {

    private final String[] colors = {"red", "green", "blue", "brown", "yellow", "magenta", "ivory", "salmon"};
    private final Random rand = new Random();

    public void doSomething() {
        System.out.println("I spy with my little eye something... " + colors[rand.nextInt(colors.length + 1)] + "!");
    }

    @Override
    public void close() {
        System.out.println("Ok, ok, I'm closing already... Sheesh...");
    }
}
