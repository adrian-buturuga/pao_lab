package ro.unibuc.pao.collections;

import ro.unibuc.pao.generics.entities.Book;

import java.util.*;

public class ListMain {

    public static void main(String[] args) {

        // There are multiple implementations of each collection, so it's good practice to use polymorphism as much as possible
        // Examples of types of list: ArrayList, LinkedList, SortedList, Stack, Vector.
        List<Number> list = new LinkedList<>();

        // Collections also have immutable implementations! These implementations will not allow inserts or deletes!
//        list = List.of(4, 6);

        Book book = new Book("DYI guide");

        // Elements can be added using the .add() method
        list.add(2);
        list.add(4);
        list.add(4);
//        list.add(Long.valueOf(6));
//        list.add(book);
        list.add(null);

        displayCollection(list);

        // If the elements in the list implement a proper equals contact, the .contains() method can be used to search if
        // a specific element is present in the collection
        if (list.contains(book)) {

            // Elements can be removed, based on the result of the equals contract!
            list.remove(book);
        }

        displayCollection(list);

        // There is also a possibility to delete by index. Be very careful when the list contains numbers castable to int!
        list.remove(2);

        displayCollection(list);

    }

    private static void displayCollection(Collection c) {
        Iterator<Integer> i = c.iterator();
        if (c.isEmpty()) {
            System.out.println(c.getClass().getName()+" is empty");
            return;
        }

        System.out.println(c.getClass().getName() + " has " + c.size() + " elements");
        while (i.hasNext()) {
            // Since the iterator was declared using generics, the .next() method will return Integer instead of Object
            Integer o = i.next();
            System.out.println(o);
        }
    }


}
