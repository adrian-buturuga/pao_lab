package ro.unibuc.pao.collections;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class QueueMain {

    public static void main(String[] args) {

        // There are multiple implementations of each collection, so it's good practice to use polymorphism as much as possible
        // Examples of types of queue: PriorityQueue, ArrayDeck
        Queue queue = new ArrayDeque();

        // Elements can be added using the .add() method
        queue.add(Integer.valueOf(4));
        queue.add(Integer.valueOf(6));
        queue.add(2);
        queue.add(Integer.valueOf(5));

        displayCollection(queue);

        // Queue does NOT have possibility to delete by index. Be very careful when the queue contains numbers castable to int!
        queue.remove(2);

        displayCollection(queue);

        // Queues have a .remove() method that removes the first element in the queue

        queue.remove(); // alternative: .poll()

        displayCollection(queue);

    }

    private static void displayCollection(Collection c) {
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
