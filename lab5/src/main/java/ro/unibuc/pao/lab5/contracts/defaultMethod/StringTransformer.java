package ro.unibuc.pao.lab5.contracts.defaultMethod;

public interface StringTransformer {

    public String transform(String s);

    /**
     * This method needs to be `default` so that it does not break backwards compatibility of already
     * developed classes that implement this interface. Since this function does not change or do anything,
     * it is also called a no-op (no operation) function.
     */
    default public String transformFirstLetter(String s) {
        return s;
    }

}
