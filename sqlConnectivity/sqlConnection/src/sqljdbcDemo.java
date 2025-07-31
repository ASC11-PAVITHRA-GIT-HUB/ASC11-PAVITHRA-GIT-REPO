import java.sql.*;

public class jdbcDemo {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver Loaded!");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=MyFriendDB;user=sa;password=sqlserver;encrypt=true;trustServerCertificate=true;";
            connection = DriverManager.getConnection(url);
            System.out.println("Connection established!");
            

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}