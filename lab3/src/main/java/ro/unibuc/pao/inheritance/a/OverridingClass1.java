package ro.unibuc.pao.inheritance.a;

public class OverridingClass1 extends BaseClass {

    /** This overrides the definition from the BaseClass */
    void method1() {

    }

    /* This does not work, as it's attempting to reduce the visibility of the method. since it's public in the parent,
     * it must be at least public here as well */
//    protected void method2() { }
}
