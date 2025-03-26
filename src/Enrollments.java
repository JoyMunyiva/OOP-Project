import java.sql.Connection;
import java.sql.Statement;

public class Enrollments {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        JDBconnector jdbc = new JDBconnector();
        connection = jdbc.getConnection();

        try {
            String query = "CREATE TABLE Enrollments(enrollmentId SERIAL PRIMARY KEY,studentId SERIAL,courseId VARCHAR(10), intakeDate DATE)";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Attendance table created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
