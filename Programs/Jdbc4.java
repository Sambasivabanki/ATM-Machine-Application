import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
class DAO
{
    Connection con;
    DAO() throws ClassNotFoundException,SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gecdb2", "root","siva");
    }
    void Insert(int eno,String ename) throws SQLException
    {
        Statement stmt=con.createStatement();
        int r=stmt.executeUpdate("Insert into emp10 values("+eno+",'"+ename+"')");
        if (r==1)
        System.out.println("inserted");
        else
        System.out.println("insertion failed");
    }
    void updateName(int eno,String ename) throws SQLException
    {
        String cmd="update emp10 set ename=? where eno=?";
        PreparedStatement pstmt=con.prepareStatement(cmd);
        pstmt.setString(1,ename);
        pstmt.setInt(2, eno);
        int r=pstmt.executeUpdate();
        if(r==1)
        System.out.println("Updated........name.");
        else
        System.out.println("Failed to update");
    }
    void deleteEmp(int eno) throws SQLException
    {
        String cmd="delete  from emp10 where eno=?";
        PreparedStatement pstmt=con.prepareStatement(cmd);
        pstmt.setInt(1, eno);
        int r=pstmt.executeUpdate();
        if(r==1)
        System.out.println("deleted");
        else
        System.out.println("deletion failed");
    }
}
public class Jdbc4 {
    public static void main(String[] args) throws ClassNotFoundException,SQLException
    {
        DAO d1=new DAO();
        // d1.Insert(11,"Dhoni");
        // d1.Insert(18,"virat");
        // d1.updateName(11,"sachin");
        // d1.updateName(18,"ABD");
        d1.deleteEmp(11);

    }

    
}
