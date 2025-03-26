import java.sql.Connection;
import java.sql.Statement;

public class Admin {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        JDBconnector jdbc = new JDBconnector();
        connection = jdbc.getConnection();

        try {
            String query = "CREATE TABLE Admin(adminId SERIAL PRIMARY KEY,adminName TEXT, facId VARCHAR(10))";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Attendance table created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
