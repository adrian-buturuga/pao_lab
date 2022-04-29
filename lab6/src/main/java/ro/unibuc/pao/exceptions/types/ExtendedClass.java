package ro.unibuc.pao.exceptions.types;

public class ExtendedClass extends BaseClass {

    /**
     * A method that overrides another method which has a `throws` clause, it must not declare any thrown exception that
     * cannot be handled by code that handles the base method. This means that this overriding method:
     * - cannot declare new checked exceptions
     * - can have fewer exceptions throws
     * - can declare as many runtime exception as it needs (even if more/different/new from the parent method)
     */
    @Override
    public void doSomething() throws SuperCustomException, NullPointerException {

        // still raining
    }

}
