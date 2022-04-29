package ro.unibuc.pao.exceptions.treating;

import java.util.Random;

public class TryWithResources {

    public static void main(String[] args) {

        // Try-with-resource keeps track of what was objects were created in its initialization section and automatically
        // closes them once the try block finishes, regardless if successfully or with an exception. All objects created
        // after the keyword `try` in this case must implement the interface `AutoCloseable`.
        try (SomeResource res = new SomeResource()) {
            // in this example, the `doSomething` method will randomly throw an exception. Regardless of that, the `close`
            // method on the `res` object is called once the block finishes or throws an exception.
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
