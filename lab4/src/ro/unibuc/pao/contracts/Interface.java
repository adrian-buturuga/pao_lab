package ro.unibuc.pao.contracts;

public interface Interface {

    /** all fields and methods in interfaces are public, static and final */
    public static final int a = 1;

    /** even if the modifiers are not specified, in an interface, this field is public static and final. */
    int b = 2;

    /**
     * Each method defined in the interface represents a part of the contract that an implementing class needs to
     * fulfill before it can be instantiated.
     */
    public void doSomething();

    /**
     * Even if the interface is a contract, some methods can have an implementation, but must be marked as default.
     * this was introduced to allow backwards compatibility for contracts (in version 1 of an application, the contract
     * included only methodA(). In version 2, it must also include methodB(). Since we don't want everyone using this
     * interface to have to provide an implementation of the new method which they don't need, this can be supplied as
     * a default method.
     */
    default public void sayHello() {
        System.out.println("hello");
    }

}
