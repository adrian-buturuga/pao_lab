package ro.unibuc.pao.inheritance.b;

import ro.unibuc.pao.inheritance.a.BaseClass;

public class DerivedClass2 extends BaseClass {

    private void someMethod() {
        //this.a = 2; // This instruction will not work, as a is private and accessible only in that specific class
        this.b = 3; // This is ok, since it's protected, therefor accessible within the package and any derived class
        //this.c = 4; // this does not work, since it's default/package private and called from a different package
        this.d = 5; // this is ok, since it's public

        this.e = 6; // This works, as e is a public field in the parent.
        BaseClass.e = 7; // This works, as e is a static field. it can be accessed with an instance or the class name
    }
}
