package ro.unibuc.pao.contracts.functional;

/**
 * @FunctionalInterface is not mandatory for functional interfaces. However, if present, the compiler will check
 * if there is exactly one abstract method defined in this interface and prohibit compilation if not. Default methods
 * have a body, so they do not count towards this count.
 */
@FunctionalInterface
public interface Generator {

    /** This is the only abstract method in the interface */
    public String generate(int length);

    default public void someOtherMethod() {}

}
