package ro.unibuc.pao.lab6.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class SetExamples {

    public static void main(String args[]) {
        Set set = new HashSet();

        set.add(new Desk());
        set.add(new Desk());
        set.add(new Chair());
        set.add(new Object());

        // get element from an exact position cannot be done for sets, as they don't keep order
//        Chair c = (Chair) set.get(2);

        Desk d = null;
        // finding first element of a type using classic for cannot be done for sets, as they don't keep order
//        for (int i=0; i<set.size(); i++) {
//            Object item = set.get(i);
//            if (item instanceof Desk) {
//                d = (Desk) item;
//                break;
//            }
//        }

        // finding first element of a certain type using enhanced for
        for (Object item : set) {
            if (item instanceof Desk) {
                d = (Desk) item;
                break;
            }
        }

        // finding first element of a certain type using iterator
        Iterator i = set.iterator();
        while (i.hasNext()) {
            Object item = i.next();
            if (item instanceof Desk) {
                d = (Desk) item;
            }
        }

        // finding first element of a certain type using list iterator cannot be done, as sets only have simple iterators
//        ListIterator li = set.listIterator();
//        while (li.hasNext()) {
//            Object item = i.next();
//            if (item instanceof Desk) {
//                d = (Desk) item;
//            }
//        }

    }
}
