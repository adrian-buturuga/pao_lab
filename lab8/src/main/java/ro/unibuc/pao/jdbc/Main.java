package ro.unibuc.pao.jdbc;

import java.sql.*;
import java.util.List;

public class Main {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {

        ConnectionManager man = new ConnectionManager("jdbc:mysql://localhost:3306/jdbc_example","root","random-pass");

        BookRepository repo = new BookRepository(man);

        List<Book> books = repo.findAllBooks();

        for (Book b : books) {
            System.out.println(b);
        }
    }

}
