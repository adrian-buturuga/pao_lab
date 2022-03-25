package ro.unibuc.pao.contracts.defaultMethod;

public class UppercaseTransformer implements StringTransformer {

    /**
     * There is no definition for this method in the implemented interface, so in order for the code to compile,
     * this method needs to be overridden and supplied a body, or the entire class needs to be marked as abstract.
     */
    @Override
    public String transform(String s) {
        return s.toUpperCase();
    }

    /**
     * This method can be overridden, just like any normal method, even if it's super counterpart is a default one.
     */
    @Override
    public String transformFirstLetter(String s) {
        return s.substring(0, 1).toUpperCase()+s.substring(1);
    }
}
