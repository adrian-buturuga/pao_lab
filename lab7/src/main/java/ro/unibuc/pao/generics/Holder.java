package ro.unibuc.pao.generics;

import ro.unibuc.pao.generics.entities.Book;

import java.lang.reflect.ParameterizedType;

/**
 * The use of generics will result in different actual classes. As a result, two objects of the same parameterized type,
 * but with different actual generic parameter cannot be used interchangeably. See line 31 after de-commenting.
 */
public class Holder<T extends Number> {

    private T thing;

    public Holder(T thing) {
        this.thing = thing;
    }

    public T getThing() {
        return thing;
    }

    public static void main(String[] args) {
        Holder<Integer> intHolder = new Holder<>(3);
        System.out.println(intHolder.getThing());

        Holder<Double> doubleHolder = new Holder<>(3.0);
        System.out.println(doubleHolder.getThing());

        // Types differ based on their generic type
//        intHolder = doubleHolder;

        // Some information about the generics remains as part of the hierarchy, in case of inheritance, but is removed otherwise
//        System.out.println(((ParameterizedType)(IntHolder.class.getGenericSuperclass())).getActualTypeArguments()[0]);
    }
}

class IntHolder extends Holder<Integer> {

    public IntHolder(Integer thing) {
        super(thing);
    }
}
