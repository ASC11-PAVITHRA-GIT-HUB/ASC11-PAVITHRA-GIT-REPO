package com.example;
import java.sql.*;
public class DBConnect {
        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/MyFriendDB";
            String user = "root";
            String password = "mysql";

            try {
                Connection conn = DriverManager.getConnection(url, user, password);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Friend");

                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getString("email"));
                }

                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

