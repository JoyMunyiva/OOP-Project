import java.sql.Connection;
import java.sql.Statement;


public class Insert_Value {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        JDBconnector jdbc = new JDBconnector();
        connection = jdbc.getConnection();

        try{
            String query="Insert into Unit(unitId,unitname,lecId) values('11003','Ecoonomics','134442')";

            statement=connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Value inserted successfully!");

        }catch(Exception e){
            e.printStackTrace();
        }
    }


}
