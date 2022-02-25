package ro.unibuc.pao.immutability;

/**
 * To make a class immutable it must:
 * - not be extended (to override the getters/setters)
 * - setters should not exist or throw exceptions if they do
 * - getters should return clones of mutable fields
 * - constructors should store clones of mutable parameters
 */
public final class ImmutableObject {

    private int i;
    private InnerObject innerObject;

    public ImmutableObject(int i, InnerObject innerObject) {
        this.i = i; // this is safe, as primitive int is immutable (eg: numeric 1 cannot be changed to mean 3)
        this.innerObject = new InnerObject(innerObject.getSomeField()); // create a new object with the same values
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        throw new UnsupportedOperationException("setting is not allowed");
    }

    public InnerObject getInnerObject() {
        return new InnerObject(innerObject.getSomeField()); // returns a clone
    }

    public void setInnerObject(InnerObject innerObject) {
        throw new UnsupportedOperationException("setting is not allowed");
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