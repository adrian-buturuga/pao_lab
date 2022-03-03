package ro.unibuc.pao.basics;

public class WrapperClasses {

    /**
     * possible values: true, false, null
     */
    Boolean a = true;

    /**
     * possible values: from -128 to 127 or null. If variable is initialized with a literal, it can automatically cast down.
     * If assigned a value of a larger type (eg: short, int, long), it needs to be explicitly cast: b = (byte) someShort;.
     * If it is used in a mathematical expression, it will be cast up to the largest type in the expression (Eg: int + byte = int).
     */
    Byte b = 32;

    /**
     * possible values: from -2^15 to 2^15-1 or null. Similar rules to byte.
     */
    Short c = 32;

    /**
     * possible values: from -2^31 to 2^31-1 or null. Similar rules to byte.
     */
    Integer d = 32;

    /**
     * possible values: from -2^63 to 2^63-1 or null. This is the largest numeric non-floating point type in java. The L or l after
     * the literal can be omitted if the context allows the compiler to auto-cast to long. Very useful to distinguish if there
     * are methods that accept both int and long, and we require an explicit literal of type int or long.
     * The uppercase L suffix is preferred for readability (easier to distinguish from 1).
     */
    Long e = 32L;

    /**
     * Floating-point number or null. If the suffix F or f is omitted. the number will be treated as a double (and will fail as
     * it is larger that float and will not fit in this type.
     */
    Float f = 32.3f; // f = 32.3; will fail

    /**
     * Default floating-point number in java. The D or d after the number is usually omitted, as floating numbers are
     * treated as doubles, unless explicitly set to float using the F or f suffix.
     */
    Double g = 32.0;

    /**
     * possible values: from 0 to 2^16-1 or null.
     */
    Character h = 'a';

    /**
     * numeric literals can have underscores inside them, for separating groups. However, a numeric literal cannot start
     * or end with an underscore (Eg: _52 is an invalid number).
     */
    int underscoreInt = 1_234; // it represents the number 1234

    public static void main(String args[]) {
        /* When using wrapper classes, it is important to check for null values when performing any kind of mathematical operations on them. */
        Integer a = 3;
        Integer b = null;
        System.out.println(a + b); // throws exception (NullPointerException) because it cannot convert null to int.
    }

}
