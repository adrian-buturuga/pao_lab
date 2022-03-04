package ro.unibuc.pao.singleton;

/**
 * The Singleton design principle implies that only one instance of that type can be created.
 */
public class SingletonMain {

    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton2 s2 = Singleton2.getInstance();
        Singleton3 s3 = Singleton3.INSTANCE;
    }
}

class Singleton1 {

    private static Singleton1 instance;

    private Singleton1() {}

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}

class Singleton2 {

    private static final Singleton2 INSTANCE = new Singleton2();

    private Singleton2() {}

    public static Singleton2 getInstance() {
        return INSTANCE;
    }

}

enum Singleton3 {
    INSTANCE;
}