package ro.unibuc.pao.inheritance.a;

public class ShadowClass extends BaseClass {

    /** this is a new variable "a", that has the same name as a parent field. this means that it shadows it. */
    private int a;

    /** even if the access modifier is different, shadowing still works. */
    private int b;

    private void doSomething() {
        b = 3; // this refers to this instance's b field
        this.b = 4; // same as above
        super.b = 33; // this refers to the parent's b field
        //super.a = 2; // this will not work as "a" is private in the parent class
    }

    /**
     * Methods are called in the context of the class in which they're defined. As a result, the getter getB() will
     * return the value of b from the super class, where the method is defined and not the shadowing b.
     */
    public static void main(String args[]) {
        ShadowClass s = new ShadowClass();
        s.doSomething();
        System.out.println(s.getB());
    }
}
