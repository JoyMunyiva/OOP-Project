import java.sql.*;

public class JDBconnector{

    private final String url= "jdbc:postgresql://localhost/oop";
    private final String user = "postgres";
    private final String password= "09876";
    Connection conn=null;
    public Connection getConnection(){

        try{
            conn= DriverManager.getConnection(url, user, password);
            if(conn!=null){
                System.out.println("Connected to oop successfully!");}
            else {
                System.out.println("Failed to connect to oop");
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return conn;

    }

    public static void main(String[] args) {
        JDBconnector sqlConnect=new JDBconnector();
        sqlConnect.getConnection();


    }
}