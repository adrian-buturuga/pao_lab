package ro.unibuc.pao.contracts.fundamentals;

/**
 * A class can implement no, one or multiple interfaces
 */
public class InterfaceImplementingClass implements Interface, AnotherInterface, YetAnotherInterface {

    /** this method must be implemented in this class, or marked as abstract (along with the class). */
    @Override
    public void doSomething() {

    }
}
