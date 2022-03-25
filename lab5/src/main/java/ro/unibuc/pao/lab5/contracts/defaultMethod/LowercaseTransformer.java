package ro.unibuc.pao.lab5.contracts.defaultMethod;

public class LowercaseTransformer implements StringTransformer {

    /**
     * There is no definition for this method in the implemented interface, so in order for the code to compile,
     * this method needs to be overridden and supplied a body, or the entire class needs to be marked as abstract.
     */
    @Override
    public String transform(String s) {
        return s.toLowerCase();
    }
}
