/*
  * This must be the first executable line in the file. It represents the location of the file.
  * It can be missing if the classes are not part of any package. However, this is rarely left out and is considered a bad design if it does.
  */
package ro.unibuc.pao.classStructure;

/*
 * This line imports the Scanner class, so we can use it without specifying each time the package.
 * If the class does not use any classes from other packages, this section can be missing all together.
 */
import java.util.Scanner;

/*
 * Static imports can be used to import static methods or fields from other classes, to ease use. This way, we don't
 * need to call in the code the method as Math.pow(10,2), but merely using pow(10,2).
 */
import static java.lang.Math.*;

/**
 * This is the declaration of the class. Keep in mind that if this class is public, the file must
 * be named exactly the same, with the extension ".java".
 */
public class ClassStructure {

    /** This is a class field member */
    private int a;

    /** This is a static field member of the class */
    public static int staticField = 5;

    /**
     * This is an instance initialization block. It is run at the creation of each object, for that specific object.
     * A class can have multiple such blocks, and they will be executed in the order that they appear in the class.
     * CALLED FOR EACH OBJECT CREATED, before the constructor.
     */
    {
        a = 4;
    }

    /**
     * This a class initialization block. It is run the first time the class is references somewhere. It can only access
     * static fields and methods in the class. If a variable is initialized at definition (see staticField = 5 above)
     * and gets assigned a new value in this block, since this block is evaluated after declarations (and initializations)
     * happen, it will override the original value (so staticField will be 4 by the end of the class initialization).
     * CALLED ONLY ONCE, when the class is referenced the first time (and loaded), even if no object of this time has been
     * created.
     */
    static {
        staticField = 4;
    }

    public ClassStructure() {
    }

    /**
     * This is a class method member.
     * private - the access modifier. Can be "private", "protected", "public" or it can be left out, meaning it's "default" or "package private".
     * double - the return type of the method. If the method does not return anything, the return type is "void".
     * something - the method name - can be any valid identifier in the java language
     * long, String - types for the corresponding parameter
     * param1, param2 - names of the parameters
     * */
    private double something(long param1, String param2) {
        return pow(10, 2); // any non-void function must return a value. If the method is void, the "return;" instruction can be used,
        // signaling that it should end it's execution at that point.
    }

    /**
     * This is the main entry point in a java class. If a class should be run, this is the signature that the java runtime environment
     * will look for. The args parameter will always have at least one value in it: args[0] will be the name of the class called.
     * If any argument have been supplied when running the class, they will follow in the array.
     * */
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
    }

}

/** A .java file can have multi class definitions in it. However, only one can be public. */
class NonPublicClass {

    /** class field */
    private int a;

    /** class method */
    public void somethingElse() { }
}
