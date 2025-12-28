import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // Replace 'YourDatabaseName' with the name you used in SQL Management Studio
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=YourDatabaseName;encrypt=true;trustServerCertificate=true;";
    private static final String USER = "sa"; // Your SQL login username
    private static final String PASS = "YourPassword"; // Your SQL login password

    public static Connection connect() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Connection Successful!");
            return conn;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}