package ro.unibuc.pao.io;

public class Writing {

    public static void main(String args[]) {

        // Writing to the System can be done to either of the two output streams
        // Normal output stream
        System.out.print("Output something");
        System.out.println("This will also include a \"new line\" character at the end");

        // Error output stream. (in the IDE and command line, this will behave exactly like the "out" stream, but it can
        // be configured to be redirected separately from it in production use.
        System.err.print("Something bad has happened");
        System.err.println("Same as before, with a \\n at the end");
    }
}
