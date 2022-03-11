package ro.unibuc.pao.inheritance.b;

import ro.unibuc.pao.inheritance.a.BaseClass;

public class OverridingClass2 extends BaseClass {

    /** While this might look like it's overriding the definition from the parent, it's actually not. In the parent
     * class, this method is package-private(default) and in a different package. Therefor, it is not visible in this
     * class, so it's just a case of two methods having the same name, with no other relation between them. This also
     * means that no restrictions apply in regard to the access modifier. To ensure that we truly are overriding,
     * we can use the annotation @Override, which will signal if we are not doing this. */
//    @Override
    private void method1() {

    }
}
