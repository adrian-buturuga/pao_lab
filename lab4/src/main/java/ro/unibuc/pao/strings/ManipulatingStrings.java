package ro.unibuc.pao.strings;

public class ManipulatingStrings {

    public static void main(String args[]) {

        /*
         * String are immutable, so below, we create 3 strings: "some", "thing" and "something", each in a different
         * part of the memory, as they cannot be changed.
         */
        String a = "some" + "thing";

        /*
         * New String objects in the heap can be created by calling using the new() approach.
         */
        String b = new String("something");

        /*
         * Strings can also be manually added to the String pool, by using the .intern() method. Before java 7, String pool was stored in PermGen. Now it's on the heap.
         */
        String c = b.intern();
        System.out.println("Are b and c stored in the same address? " + ( b == c ) );

        /* If we need to alter a lot of strings, we need to use other classes that know how to do this in an optimal manner. */

        /* Example1: StringBuilder */
        /* This class can manipulate strings rather fast. It is not thread-safe.*/
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("some").append("thing").reverse();
        System.out.println("string builder value: "+stringBuilder);

        /* Example2: StringBuffer */
        /* This class can manipulate strings at a slower pace, but can be used by multiple threads at the same time.
         * The reason behind this is that all methods are synchronized (will be explained when discussing threads) and
         * only thread can execute a method at a time. It has the same methods as StringBuilder.
         */
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("some").append("thing").reverse();
        System.out.println("string buffer value: "+stringBuffer);
    }

}
