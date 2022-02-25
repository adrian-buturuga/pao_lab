package ro.unibuc.pao.constructors;

public class CallingConstructors {}

class BaseNoConstructor {

}

class BaseConstructor {

    private int i;

    public BaseConstructor(int i) {
        this.i = i;
    }
}

/**
 * Since the parent class has no constructor (so it relies on the no-argument constructor the compiler creates), it can
 * exist without having a constructor defined in it.
 */
class Derived1 extends BaseNoConstructor {

}

/**
 * Since the parent class has a constructor with arguments (and no no-argcument constructor), this class cannot exist
 * without a constructor that explicitly calls the parent constructor with the appropriate arguments.
 */
class Derived2 extends BaseConstructor {

    public Derived2() {
        super(2);
    }
}