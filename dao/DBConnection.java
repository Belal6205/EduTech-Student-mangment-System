package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
    
    public static void main(String[] args) {
        // Your specific credentials
        String dbName = "edutrack"; 
        String user = "db_user"; 
        String pass = "1234"; 
        
        // Connection string targeting localhost and your database
        String url = "jdbc:sqlserver://localhost:1433;" +
                     "databaseName=" + dbName + ";" +
                     "encrypt=true;trustServerCertificate=true;";

        System.out.println("Attempting to connect to " + dbName + "...");

        try {
            // 1. Establish the connection
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            if (conn != null) {
                System.out.println("SUCCESS: Connected to the database!");
                
                // 2. Test the connection by pulling a student name
                Statement stmt = conn.createStatement();
                // Selecting a student likely existing in your database
                String sql = "SELECT TOP 1 Name, Major FROM Student"; 
                ResultSet rs = stmt.executeQuery(sql);
                
                if (rs.next()) {
                    System.out.println("--- Test Query Result ---");
                    System.out.println("Connected User: " + user);
                    System.out.println("Found Student: " + rs.getString("Name"));
                    System.out.println("Major: " + rs.getString("Major"));
                    System.out.println("-------------------------");
                }
                
                // 3. Close connection
                conn.close();
            }
        } catch (Exception e) {
            System.out.println("CONNECTION FAILED!");
            System.out.println("Reason: " + e.getMessage());
        }
    }
}