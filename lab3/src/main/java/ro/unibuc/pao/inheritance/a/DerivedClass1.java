package ro.unibuc.pao.inheritance.a;

public class DerivedClass1 extends BaseClass {

    private void someMethod() {
        //this.a = 2; // This instruction will not work, as a is private and can be used only in that specific class
        this.b = 3; // This is ok, since it's protected, therefor accessible within the package and any derived class
        this.c = 4; // this is ok, since it's default/package private, therefor accessible within the same package
        this.d = 5; // this is ok, since it's public

        this.e = 6; // This works, as e is a public field in the parent.
        BaseClass.e = 7; // This works, as e is a static field. it can be accessed with an instance or the class name
    }
}
