package ro.unibuc.pao.contracts.defaultMethod;

public class Main {

    public static void main(String[] args) {
        // Regardless of what implementation we get from the getImplementation() method, the class will
        // function without issues, since any implementation is forced to provide an implementation to the contract.
        StringTransformer trans = getImplementation();
        // Calling function from contract
        System.out.println(trans.transform("Lorem Ipsum"));
        // Calling default, possibly overridden, function from contract
        System.out.println(trans.transformFirstLetter("acbdadafwre vfvfe"));
    }

    private static StringTransformer getImplementation() {
        return new UppercaseTransformer();
    }

}
