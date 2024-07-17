import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbCon2
 {
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("loaded");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gecdb2?user=root&password=siva");
        System.out.println("Established");
        Statement stmt=con.createStatement();
        stmt.execute("insert into emp2 values(3,'nagarjuna')");
        System.out.println("Insertion Successfull");

    }
}
