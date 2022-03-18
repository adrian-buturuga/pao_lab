package ro.unibuc.pao.immutability;

/**
 * To make a class immutable, it must:
 * - ??
 * - ??
 * - ??
 * - ??
 */
public class ImmutableObject {

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

    public void setInnerObject(InnerObject innerObject) {
        this.innerObject = innerObject;
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