package ro.unibuc.pao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionManager {

    private Connection conn;

    public ConnectionManager(String url, String user, String pass) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        conn = DriverManager.getConnection(url, user, pass);
    }

    public void close() throws SQLException {
        conn.close();
    }

    public PreparedStatement prepareStatement(String stmt) throws SQLException {
        if (conn.isClosed()) {
//            conn = DriverManager.getConnection().... // reconnect
        }
        return conn.prepareStatement(stmt);
    }

}
