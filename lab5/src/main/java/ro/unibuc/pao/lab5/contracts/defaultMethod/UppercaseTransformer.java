package ro.unibuc.pao.lab5.contracts.defaultMethod;

public class UppercaseTransformer implements StringTransformer {

    @Override
    public String transform(String s) {
        return s.toUpperCase();
    }
}
