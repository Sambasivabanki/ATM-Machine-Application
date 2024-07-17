import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc
 {
    public static void main(String[] args) throws Exception
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Eno:");
        int eno=sc.nextInt();
        System.out.println("enter Ename:");
        String ename=sc.next();
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Loaded");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gecdb2?user=root&password=siva");
        System.out.println("Connection done");
        Statement stmt=con.createStatement();


    }
 }

