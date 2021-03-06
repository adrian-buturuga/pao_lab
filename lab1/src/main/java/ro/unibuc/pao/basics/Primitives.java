package ro.unibuc.pao.basics;

public class Primitives {

    /**
     * possible values: true, false
     */
    boolean a = true;

    /**
     * possible values: from -128 to 127. It variable is initialized with a literal, it can automatically cast down.
     * If assigned a value of a larger type (eg. short, int, long), it needs to be explicitly cast: b = (byte) someShort;.
     * If it is used in a mathematical expression, it will be cast up to the largest type in the expression (Eg: int + byte = int).
     */
    byte b = 32;

    /**
     * possible values: from -2^15 to 2^15-1. Similar rules to byte.
     */
    short c = 32;

    /**
     * possible values: from -2^31 to 2^31-1. Similar rules to byte.
     */
    int d = 32;

    /**
     * possible values: from -2^63 to 2^63-1. This is the largest numeric non-floating point type in java. The L or l after
     * the literal can be omitted if the context allows the compiler to auto-cast to long. Very useful to distinguish if there
     * are methods that accept both int and long and we require an explicit literal of type int or long.
     * The uppercase L suffix is preferred for readability (easier to distinguish from 1).
     */
    long e = 32L;

    /**
     * Floating-point number. If the suffix F or f is omitted. the number will be treated as a double (and will fail as
     * it is larger that float and will not fit in this type.
     */
    float f = 32.3f; // f = 32.3; will fail

    /**
     * Default floating-point number in java. The D or d after the number is usually omitted, as floating numbers are
     * treated as doubles, unless explicitly set to float using the F or f suffix.
     */
    double g = 32.0;

    /**
     * possible values: from 0 to 2^16-1.
     * chars are treated as integer numbers, just like short and byte, and represent the position of the character in the
     * ASCII table. This allows mathematical operations over chars (eg: 'a' + 2 = 'c', or even 'y' + ('A'-'a') = 'Y').
     */
    char h = 'a';


}
