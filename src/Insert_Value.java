import java.sql.Connection;
import java.sql.Statement;


public class Insert_Value {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        JDBconnector jdbc = new JDBconnector();
        connection = jdbc.getConnection();

        try{
            String query="Insert into Attendance(unitId,studentId,pAbsence,attendanceCount,semester) values('11002','264268','8','3','2')";

            statement=connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Value inserted successfully!");

        }catch(Exception e){
            e.printStackTrace();
        }
    }


}
