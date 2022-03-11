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

//    public static void main(String args[]) {
//        ShadowClass s = new ShadowClass();
//        s.doSomething();
//        System.out.println(s.getB());
//    }
}
