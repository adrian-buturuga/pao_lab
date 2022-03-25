package ro.unibuc.pao.lab5.contracts.functional;

public class Main {

    private static void writeCode(Generator g) {
        System.out.println(g.generate());
    }

    public static void main(String[] args) {

        writeCode(new CodeGenerator());

    }
}
