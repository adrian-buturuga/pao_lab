package ro.unibuc.pao.strings;

/**
 * Sometimes, some methods can be more convenient than others, so all classes should be taken into
 * consideration when manipulating strings.
 */
public class StringMethods {

    public static void main(String args[]) {

        String input = "12324526";
        System.out.println("Input string: " + input);

        /*
         * String.replace() replaces all occurrences of searched string with a different string
         */
        String replaced = input.replace("2", "X");
        System.out.println("After String.replace(): " + replaced);

        /*
         * String.replaceAll() replaces all parts of the string that match the given regular expression
         */
        replaced = input.replaceAll("2[34]", "X");
        System.out.println("After String.replaceAll(): " + replaced);

        /*
         * StringBuilder.replace() replaces parts of the string based on indexes and not matched text.
         * To achieve the same result as for String.replace(), the .indexOf() function needs to be used as well.
         */
        StringBuilder builder = new StringBuilder(input);
        int index = builder.indexOf("2");
        replaced = builder.replace(index, index + 1, "X").toString();
        System.out.println("After StringBuilder.replace(): " + replaced);

        /* */
        StringBuffer buffer = new StringBuffer(input);
        index = buffer.indexOf("2");
        replaced = buffer.replace(index, index + 1, "X").toString();
        System.out.println("After StringBuffer.replace(): " + replaced);
    }

}
