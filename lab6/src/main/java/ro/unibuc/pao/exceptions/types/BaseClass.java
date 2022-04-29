package ro.unibuc.pao.exceptions.types;

public class BaseClass {

    /**
     * A method can throw checked exceptions (exceptions that extend `Exception`) or runtime exceptions (those that
     * extend `RuntimeException`.
     * Checked exceptions need to declared with the `throws` keyword each time if they are not treated in the method
     * and are left to be thrown. RuntimeException can be omitted from being declared. One reason for it being implemented
     * this way is that RuntimeException are seen as development bugs and the code should not always account for them,
     * whereas checked exceptions are expected business ones.
     */
    public void doSomething() throws CustomException, CustomRuntimeException, IllegalArgumentException {

        throw new CustomException("ceva");
        // pretend it's raining

    }

}
