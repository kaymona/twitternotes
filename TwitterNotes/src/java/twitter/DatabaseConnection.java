
package twitter;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        // Force Java to load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Define URL / username / password
        String dbUrl = "jdbc:mysql://localhost:3306/Twitter";
        String username = "twitter";
        String password = "test";

        Connection connection = DriverManager.getConnection(dbUrl, username, password);
        return connection;
    }
}
