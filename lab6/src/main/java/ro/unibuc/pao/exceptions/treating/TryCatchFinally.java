package ro.unibuc.pao.exceptions.treating;

public class TryCatchFinally {

    public static int divide(int a, int b) {
        System.out.println("Entering method");
        int result = 0;

        try {
            result = a / b;
            System.out.println("Returning result");
            return result;
        }
        // `catch`es are evaluated in order, to see if they can handle thrown exception. This means that the first
        // `catch` that matches will be executed. If multiple `catch`es can match, only the first one is run, after
        // which the handling mechanism from the try/catch/finally block stops. This also means that the most specific
        // exceptions need to be handled first, and then the more generic ones (when it comes to hierarchy of exception
        // classes
        catch (ArithmeticException e) {
            System.out.println("Cannot compute: "+e.getMessage());
            return -2;
        }
        // the `finally` block is called regardless if a return statement was called beforehand (eg: the `try` block
        // executed completely fine).
        finally {
            System.out.println("Finished computing");
            // If return is called in a `finally` block, after another return was called in the `try` or `catch` blocks,
            // the value returned here will override the previous one.
//            return -1;
        }
    }

    public static void main(String[] args) {

        System.out.println("Result is: "+divide(4,2));

    }

}
