import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Jdbc1 {
    public static void main(String[] args) throws Exception
    {
         Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Loaded");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gecdb2?user=root&password=siva");
        System.out.println("Connection done");
        PreparedStatement pstmt=con.prepareStatement("insert into emp2 values(?,?)");
        pstmt.setInt(1,5);
        pstmt.setString(2,"sivaji");
        int r=pstmt.executeUpdate();


    }
}
