package ro.unibuc.pao.generics;

import ro.unibuc.pao.generics.entities.Book;
import ro.unibuc.pao.generics.entities.Magazine;

public class Main {

    public static void main(String[] args) {
        Storage books = new Storage();

        books.add(new Book("Harry Potter"));
        books.add(new Book("Advanced Fishing"));
        books.add(new Magazine("Men's Health"));

        books.list();

    }

}
