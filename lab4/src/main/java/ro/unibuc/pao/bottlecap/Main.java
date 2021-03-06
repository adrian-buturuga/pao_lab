package ro.unibuc.pao.bottlecap;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("Should use generator for Coca-Cola (true/false)?");
        boolean useCocaCola = new Scanner(System.in).nextBoolean();

        /* Based on the parameter passed, the getGenerator method will return one of the two implementations. */
        Generator g = Generator.getGenerator(useCocaCola);
        /* this will call the implementation from the effective type used. */
        String code = g.generateCode();
        System.out.println(code);
    }
}
