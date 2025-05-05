package india.roam.registration.page.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static String url = "jdbc:mysql://localhost:3306/roamindia";
    private static String user = "root";
    private static String password = "Ashwani@123";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        System.out.println("Building connection");
        return DriverManager.getConnection(url, user, password);
    }
}
