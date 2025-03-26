import java.sql.Connection;
import java.sql.Statement;

public class Unit {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        JDBconnector jdbc = new JDBconnector();
        connection = jdbc.getConnection();

        try {
            String query = "CREATE TABLE Unit(unitId VARCHAR(10) PRIMARY KEY,unitName TEXT, lecId SERIAL)";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Attendance table created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
