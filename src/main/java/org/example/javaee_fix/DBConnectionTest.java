package org.example.javaee_fix;

import java.sql.*;

public class DBConnectionTest {
    public static void main(String[] args) {
        Connection con = null;
        try {
            String name = "stas";
            String pwd = "stas";
            con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/javaee_db", name, pwd);
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM books");
            while (rs.next()) {
                System.out.println(rs.getString(1) + ". \"" +
                        rs.getString(2) + "\" by " + rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
