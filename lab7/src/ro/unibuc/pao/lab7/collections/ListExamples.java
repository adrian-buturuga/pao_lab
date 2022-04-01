package ro.unibuc.pao.lab6.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExamples {

    public static void main(String args[]) {
        List list = new ArrayList();

        list.add(new Desk());
        list.add(new Desk());
        list.add(new Chair());
        list.add(new Object());

        // get element from an exact position
        Chair c = (Chair) list.get(2);

        Desk d = null;
        // finding first element of a type using classic for
        for (int i=0; i<list.size(); i++) {
            Object item = list.get(i);
            if (item instanceof Desk) {
                d = (Desk) item;
                break;
            }
        }

        // finding first element of a certain type using enhanced for
        for (Object item : list) {
            if (item instanceof Desk) {
                d = (Desk) item;
                break;
            }
        }

        // finding first element of a certain type using iterator
        Iterator i = list.iterator();
        while (i.hasNext()) {
            Object item = i.next();
            if (item instanceof Desk) {
                d = (Desk) item;
            }
        }

        // finding first element of a certain type using list iterator
        ListIterator li = list.listIterator();
        while (li.hasNext()) {
            Object item = i.next();
            if (item instanceof Desk) {
                d = (Desk) item;
            }
        }

    }
}
