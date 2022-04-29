package ro.unibuc.pao.jdbc;

import java.sql.*;

public class Main {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_example","root","random-pass");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from Books");
        while(rs.next()) {
            String name = rs.getString("name");
            String author = rs.getString("author");
            System.out.println(name+" - "+author);
        }
        con.close();
    }

}
