package ro.unibuc.pao.collections;

import ro.unibuc.pao.generics.entities.Book;

import java.util.*;

public class SetMain {

    public static void main(String[] args) {

        // There are multiple implementations of each collection, so it's good practice to use polymorphism as much as possible
        // Examples of types of sets: HashSet, LinkedHashSet, TreeSet
        Set set = new HashSet();

        // Collections also have immutable implementations! These implementations will not allow inserts or deletes!
//        set = Set.of(4, 6);

        Book book = new Book("DYI guide");

        // Elements can be added using the .add() method
        set.add(Long.valueOf(6));
        set.add(null);
        set.add(Integer.valueOf(4));
        set.add(2);
        set.add(book);
        set.add(Integer.valueOf(4));

        displayCollection(set);

        // If the elements in the set implement a proper equals contact, the .contains() method can be used to search if
        // a specific element is present in the collection
        if (set.contains(book)) {

            // Elements can be removed, based on the result of the equals contract!
            set.remove(book);
        }

        displayCollection(set);

        // Remove can only be done by object
        set.remove(2);

        displayCollection(set);

    }

    private static void displayCollection(Set c) {
        Iterator i = c.iterator();
        if (c.isEmpty()) {
            System.out.println(c.getClass().getName()+" is empty");
            return;
        }

        System.out.println(c.getClass().getName() + " has " + c.size() + " elements");
        while (i.hasNext()) {
            Object o = i.next();
            System.out.println(o);
        }
    }


}
