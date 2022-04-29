package ro.unibuc.pao.threads.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

// SLF4J, or "Simple Logging Facade for Java" is a library that abstracts the logging library used in the application, to
// allow for easier switch between implementations, if needed. Lombok is a library that generates a lot of boilerplate code
// (code that is repetitive in nature through projects). This annotation will automatically create a `log` member in the
// class and instantiate it with the appropriate logger instance, based on whatever logging library is on the classpath.
@Slf4j
public class HorseThread extends Thread {

    private final int number;
    private final Race race;

    public HorseThread(int number, Race race) {
        this.number = number;
        this.race = race;
    }

    @Override
    public void run() {
        // for output, a logger is used, and not System.out.println as until now, because it will also display information
        // about the calling thread and the source class.
        boolean finished;
        do {
            finished = race.advance(number, new Random().nextInt(50));
//            finished = race.advance(number, 100);
        } while (!finished);
        log.info("Horse {} has finished!", number);

    }
}
