package ro.unibuc.pao.generics;

import ro.unibuc.pao.generics.entities.Book;

import java.util.List;

public class GenericMethods {

    /**
     * A trick often used by libraries that need to work with lots of object types (eg: Hibernate) is to have the method
     * accept an extra parameter of type Class< some generic >, which will force the compiler to infer the actual generic
     * type into whatever is passed as the last argument.
     */
    public static <X> X getObject(List<? extends X> objects, int index, Class<X> clazz) {
        return objects.get(index);
    }

    public static void main(String args[]) {
        // Here, the last parameter is Class<String>, which forces the generic X to be inferred to String, so the method returns String
        String x = getObject(List.of("3"), 0, String.class);
        // Here, the last parameter is Class<String>, which forces the generic X to be inferred to String, so the method returns Book
        Book y = getObject(List.of(new Book("some book")), 0, Book.class);
        System.out.println("Found: " + x + " and " + y);
    }

}
