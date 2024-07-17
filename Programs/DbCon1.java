import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class DbCon1 {
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded.......");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gecdb2?user=root&password=siva");
        System.out.println("Connection Established");
        Statement stmt=con.createStatement();
        stmt.execute("create table emp2(eno int primary key,ename varchar(30))");
        System.out.println("Emp table is created");
        con.close();
      
    }
}
