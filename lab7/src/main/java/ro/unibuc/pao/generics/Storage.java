package ro.unibuc.pao.generics;

import ro.unibuc.pao.generics.entities.Book;
import ro.unibuc.pao.generics.entities.Storable;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private List<Book> storage = new ArrayList<Book>();

    public void add(Book item) {
        storage.add(item);
    }

    public void remove(int index) {
        storage.remove(index);
    }

    public void list() {
        System.out.println("In library: ");
        for (int i = 0; i < storage.size(); i++) {
            Storable item = storage.get(i);
            System.out.println(i + ": " + item.getName() + " (" + item.getClass().getSimpleName() + ")");
        }
    }

}
