import java.sql.Connection;
import java.sql.Statement;

public class Course {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;

        JDBconnector jdbc=new JDBconnector();
        connection = jdbc.getConnection();

        try {
            String query = "CREATE TABLE Course(courseId VARCHAR(10) PRIMARY KEY,cName TEXT, tCredits INT, lecId SERIAL, unitCode VARCHAR(10), feeBalance VARCHAR(20))";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Attendance table created successfully!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}

