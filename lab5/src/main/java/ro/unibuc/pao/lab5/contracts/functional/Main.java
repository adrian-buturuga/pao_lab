package ro.unibuc.pao.lab5.contracts.functional;

public class Main {

    /** Method uses as a parameter the interface Generator which has only one abstract function (functional interface) */
    private static void writeCode(Generator g) {
        System.out.println(g.generate(10));
    }

    public static void main(String[] args) {

        /*
         * If the body of the .generate() method would be called in multiple placed, or if compiled with a java version
         * that does not know about lambdas, this would be the approach to be taken.
         */
        writeCode(new CodeGenerator());

        /*
         * If the implementation of the .generate() method would be called only in one place and the java version permits
         * lambdas, this would be a shorter way of writing a similar implementation.
         * This would create a new class without a name that would implement the inferred interface and the body defined
         * here after the "->" sign would be the body of the only abstract method. The list of parameters passed before
         * the "->" sign can se used in the body and appear in the order defined in the abstract method declaration.
         */
        writeCode((l) -> {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < l; i++) {
                sb.append("x");
            }
            return sb.toString();
        });

    }
}
