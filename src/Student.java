import java.sql.Connection;
import java.sql.Statement;

public class Student {
     public static void main(String[] args) {
         Connection connection=null;
         Statement statement=null;

         JDBconnector jdbc=new JDBconnector();
         connection = jdbc.getConnection();

         try {
             String query = "CREATE TABLE Attendance(unitId VARCHAR(10) PRIMARY KEY,studentId SERIAL,pAbsence VARCHAR(10),attendanceCount INT,semester INT)";
             statement = connection.createStatement();
             statement.executeUpdate(query);
             System.out.println("Attendance table created successfully!");
         }
         catch (Exception e) {
             e.printStackTrace();
         }

     }
}
