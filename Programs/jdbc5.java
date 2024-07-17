import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
class DAO
{
    Connection con;
    DAO() throws ClassNotFoundException,SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gecdb2", "root","siva");
        System.out.println("Connection established");
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
        pstmt.setInt(2, eno);
        int r=pstmt.executeUpdate();
        if(r==1)
        System.out.println("deleted");
        else
        System.out.println("deletion failed");
    }
    void viewAll() throws SQLException
    {
        String cmd="select * from emp10";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(cmd);
        while (rs.next()) 
        {
            System.err.printf("%-5d %-30s %n",rs.getInt("eno"),rs.getString("ename"));

        }
    }
}
public class jdbc5 {
    public static void main(String[] args) throws ClassNotFoundException,SQLException
    {
        DAO d1=new DAO();
        Scanner sc=new Scanner(System.in);
        int n,eno;
        String ename;
        while(true)
        {
        System.out.println("1.Insert");
        System.out.println("2.update");
        System.out.println("3.Delete");
        System.out.println("4.view all");
        System.out.println("option:\t");
        int opt=sc.nextInt();
        switch (opt)
        {
            case 1:
            d1.Insert(20, "bumrah");
            break;
            case 2:
            d1.updateName(11,"satvik");
            break;
            case 3:
            d1.deleteEmp(15);
            break;
            case 4:
            d1.viewAll();
            break;
        
            default:
            System.out.println("Invalid option");
            }    break;
        }
        


    }

    
}
