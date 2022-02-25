package ro.unibuc.pao.instructions;

public class Instructions {

    public static void main(String args[]) {

        /* if - else
         *
         * Checks if a condition is true and executes the if body if true, or the else body if false. The else body be
         * left out and nothing will happen if the expression is false. The if expression must be of type boolean.
         */
        if (1 > 2) {
            System.out.println("My math needs improving");
        } else {
            System.out.println("All is good");
        }

        /* switch
         *
         * checks if a value supplied in the switch matches any of the cases within. If it does, it moves the execution
         * to that point and starts running them until either the end of the switch is reached or a break instruction is
         * met. In the code example below, if someValue was 1, it would have printed out "something something else", as
         * the execution would have started at case 1 (it is empty) and would continue the instructions in the next cases
         * until it reached the break in case 3. if no case is matches, the default case is executed. if there is no
         * default case and there is no case that matches, no instructions in the switch are executed.
         */
        int someValue = 4;
        switch (someValue) {
            case 1:
            case 2:
                System.out.println("something");
            case 3:
                System.out.println("something else");
                break;
            case 4:
                System.out.println("yay");
                break;
            default:
                System.out.println("miss");
                break;
        }

        /* for
         *
         * Has 3 sections separated by a semicolon (;) and a body. Any of the 3 sections can be left empty. Upon execution,
         * it declares and initialises any variables in the first block (if multiple values are initialised, they are
         * separated by a comma (,)), checks the boolean condition in the second block (if any) and if true, executes the
         * body. At the end of each body execution, it runs the steps in the final section.
         */
        int i;
        long j;
        for (i=0, j=4; i<10; i++) {
            System.out.println(i);
        }

        /* while
         *
         * checks if the boolean condition in the while is true. If so, it executes the body and goes to the start,
         * reevaluating the expression and rerunning if necessary.
         */
        while (i < 7) {
            i++;
        }

        /* do - while
         *
         * Similar to the while, the difference being that it first runs the body and evaluates the expression at the end.
         */
        do {
            i++;
        } while (i < 20);
    }

}
