package control;

import java.sql.*;
public class database {
    static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/gamewinner";
    static final String USER = "root";
    static final String PASS = "";
    static final String QUERY = "SELECT * FROM person";

    public void Insert(String name, String date) throws ClassNotFoundException {
        Class.forName(DRIVER_CLASS);
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();) {
            System.out.println("Inserting data");
            String sql = "INSERT INTO gamewinner (name, time) VALUES ('" + name + "', '" + date + "')";
            stmt.executeUpdate(sql);
            System.out.println("Data inserted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}