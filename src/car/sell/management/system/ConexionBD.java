package car.sell.management.system;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD 
{
    Connection conn=null;
    public static Connection Conexion()
    {
       try 
       {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/car sell management system","root","");				
            return conn;
       }
       catch(Exception e) 
       {
            System.out.println("--> SQLException : " + e) ;
            return null;
       }
    }
}
