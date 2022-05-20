package ro.unibuc.pao.sample1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.*;
import java.util.ArrayList;

public class Database {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

        String specializare = "Info";
        int anMin = 2010;
        int anMax = 2020;

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/DiplomeLicenta", "root", "random-pass");

        PreparedStatement ps = c.prepareStatement("SELECT * FROM diplome WHERE den_spec = ? AND an_min >= ? AND an_max <= ?");
        ps.setString(1, specializare);
        ps.setInt(2, anMin);
        ps.setInt(3, anMax);

        ResultSet rs = ps.executeQuery();
        ArrayList<DiplomaLicenta> diplome = new ArrayList<>();

        while(rs.next()) {
            String absolvent = rs.getString("absolvent");
            int an = rs.getInt("an");
            // .....

            DiplomaLicenta dl = new DiplomaLicenta(null, an, absolvent, null, null, 0.0);
            diplome.add(dl);
        }

        if (diplome.isEmpty()) {
            System.out.println("Oops;");
        } else {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("diplome.dat"));
            oos.writeObject(diplome);
        }
    }

}
