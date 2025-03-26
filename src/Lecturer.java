import java.sql.Connection;
import java.sql.Statement;

public class Lecturer {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;

        JDBconnector jdbc=new JDBconnector();
        connection = jdbc.getConnection();

        try {
            String query = "CREATE TABLE Lecturer(lecId SERIAL PRIMARY KEY,lecName TEXT, lecEmail VARCHAR(50), sex CHAR, dob DATE, courseId VARCHAR(10), salary VARCHAR(20), facultyId VARCHAR(10), unitId VARCHAR(10))";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Attendance table created successfully!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}
