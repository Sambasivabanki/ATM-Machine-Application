import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Jdbc2 {
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
       Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gecdb2?user=root&password=siva");
       System.out.println("Connection Established");
       Statement stmt=con.createStatement();
       stmt.execute("create table emp10(eno int primary key,ename varchar(30))");
       System.out.println("Emp table created");
       con.close();
    }
}
