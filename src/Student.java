import java.sql.Connection;
import java.sql.Statement;

public class Student {
     public static void main(String[] args) {
         Connection connection=null;
         Statement statement=null;

         JDBconnector jdbc=new JDBconnector();
         connection = jdbc.getConnection();

         try {
             String query = "CREATE TABLE Student(studentId SERIAL PRIMARY KEY,fName TEXT,lName TEXT, sex CHAR, dob DATE, email VARCHAR(50), facultyId VARCHAR(10), courseId VARCHAR(10), no_of_units INT)";
             statement = connection.createStatement();
             statement.executeUpdate(query);
             System.out.println("Attendance table created successfully!");
         }
         catch (Exception e) {
             e.printStackTrace();
         }

     }
}
