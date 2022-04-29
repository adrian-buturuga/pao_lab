package ro.unibuc.pao.collections;

import ro.unibuc.pao.generics.entities.Book;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        // There are multiple implementations of each collection, so it's good practice to use polymorphism as much as possible
        // Examples of types of maps: HashMap, Hashtable, LinkedHashMap, Properties, TreeMap
        Map map = new HashMap();

        // Collections also have immutable implementations! These implementations will not allow inserts or deletes!
        map = Map.of(1, 2, 2, 3, 3, 7);

        Book book = new Book("DYI guide");
//
//        // Elements can be added using the .put() method
        map.put(1, 2);
        map.put("different-key", Integer.valueOf(4));
        map.put(new Object(), Integer.valueOf(4));
        map.put(Long.valueOf(4), Long.valueOf(6));
        map.put("anything", book);

        displayCollection(map);

        // If the elements in the map implement a proper equals contact, the .contains() method can be used to search if
        // a specific element is present in the collection
        if (map.containsKey(book)) {
//
//            // Elements can be removed, based on the result of the equals contract!
            map.remove(book);
        }

//        displayCollection(map);

    }

    private static void displayCollection(Map c) {
        Iterator i = c.keySet().iterator();
        if (c.isEmpty()) {
            System.out.println(c.getClass().getName() + " is empty");
            return;
        }

        System.out.println(c.getClass().getName() + " has " + c.size() + " elements");
        while (i.hasNext()) {
            Object key = i.next();
            System.out.println(key + " -> " + c.get(key));
        }
    }


}
