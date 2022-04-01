package ro.unibuc.pao.exceptions.treating;

public class TryCatchFinally {

    public static int divide(int a, int b) {
        System.out.println("Entering method");
        int result = 0;
        try {
            result = a / b;
            System.out.println("Returning result");
            return result;
        } catch (ArithmeticException e) {
            System.out.println("Cannot compute: "+e.getMessage());
            return -2;
        } finally {
            System.out.println("Finished computing");
//            return -1;
        }
    }

    public static void main(String[] args) {

        System.out.println("Result is: "+divide(4,2));

    }

}
