import java.sql.Connection;
import java.sql.Statement;

public class Faculty {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        JDBconnector jdbc = new JDBconnector();
        connection = jdbc.getConnection();

        try {
            String query = "CREATE TABLE Faculty(facultyId VARCHAR(10) PRIMARY KEY,facName TEXT, adminId SERIAL, lecId SERIAL)";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Attendance table created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
