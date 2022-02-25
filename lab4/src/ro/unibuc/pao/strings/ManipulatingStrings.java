package ro.unibuc.pao.strings;

public class ManipulatingStrings {

    public static void main(String args[]) {

        /* String are immutable, so below, we create 3 strings: "some", "thing" and "something", each in a different
        * part of the memory, as they cannot be changed. */
        String a = "some" + "thing";

        /* If we need to alter a lot of strings, we need to use other classes that know how to do this in an optimal manner. */

        /* Example1: StringBuilder */
        /* This class can manipulate strings rather fast. It is not thread-safe.*/
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("some").append("thing");
        stringBuilder.reverse();

        /* Example2: StringBuffer */
        /* This class can manipulate strings at a slower pace, but can be used by multiple threads at the same time.
         * The reason behind this is that all methods are synchronized (will be explained when discussing threads) and
         * only thread can execute a method at a time. It has the same methods as StringBuilder.
         */
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("some").append("thing");
        stringBuffer.reverse();
    }

}
