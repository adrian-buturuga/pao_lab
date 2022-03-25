package ro.unibuc.pao.immutability;

/**
 * To make a class immutable, it must:
 * - have the class final
 * - make attributes final [optional]
 * - not have setters
 * - have getters return clones of member data
 * - have constructors retain clones of passes parameters
 *
 * Update the definition of the class below so that it is immutable.
 * Test your solution by running the tests in the ImmutableObjectTest test class.
 */
public final class ImmutableObject {

    private int i;
    private InnerObject innerObject;

    public ImmutableObject(int i, InnerObject innerObject) {
        this.i = i;
        this.innerObject = innerObject;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public InnerObject getInnerObject() {
        return innerObject;
    }

}

class InnerObject {
    private int someField;

    public InnerObject(int someField) {
        this.someField = someField;
    }

    public int getSomeField() {
        return someField;
    }

    public void setSomeField(int someField) {
        this.someField = someField;
    }
}