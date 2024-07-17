import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc3 {
    public static void main(String[] args) throws Exception
     {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
       Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gecdb2?user=root&password=siva");
       System.out.println("Connection Established");
       Statement stmt=con.createStatement();
       Statement.execute()
    }
    
}
