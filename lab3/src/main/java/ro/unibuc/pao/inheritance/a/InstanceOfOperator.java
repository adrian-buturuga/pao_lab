package ro.unibuc.pao.inheritance.a;

/**
 * When using polymorphism, if there is a need to decide if an object is an instance of a specific type (this
 * means also if any of its superclasses is that type), the instanceof operator can be used.
 */
public class InstanceOfOperator {

    public static void main(String[] args) {

        BaseClass cls = new DerivedClass1();
//        cls = new DerivedClass2();

        if (cls instanceof DerivedClass1) {
            ((DerivedClass1) cls).somethingNew();
        } else {
            System.out.println("I don't know what to call");
        }

    }
}
