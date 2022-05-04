package ro.unibuc.pao.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private ConnectionManager connectionManager;

    public BookRepository(ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

    public List<Book> findAllBooks() throws SQLException {
        PreparedStatement stmt = connectionManager.prepareStatement("Select * from Books");
        ResultSet rs = stmt.executeQuery();
        List<Book> result = new ArrayList<>();
        while (rs.next()) {
            Book b = new Book();
            b.setId(rs.getLong("id"));
            b.setAuthor(rs.getString("author"));
            b.setName(rs.getString("name"));
            result.add(b);
        }
        return result;
    }
}
