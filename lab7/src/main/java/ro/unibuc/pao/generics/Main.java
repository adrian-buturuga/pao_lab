package ro.unibuc.pao.generics;

import ro.unibuc.pao.generics.entities.Book;
import ro.unibuc.pao.generics.entities.Magazine;

public class Main {

    public static void main(String[] args) {
        Storage books = new Storage();

        books.add(new Book("Harry Potter"));
        books.add(new Book("Advanced Fishing"));
        // Since Storage uses lists of Books, the check for this is executed at compile time and will result in errors
        // if a different type is used. This mechanism can still be bypassed if the add happens at runtime using special
        // approaches (eg: reflection)
//        books.add(new Magazine("Men's Health"));

        books.list();

    }

}
