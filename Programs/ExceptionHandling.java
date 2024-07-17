import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        try
        {
         c=a/b;
        }
        catch(ArithmeticException ae)
        {
            ae.printStackTrace();
        }
        finally
        {
            System.out.println("Happy Ending");
        }
        System.out.println(c);
        System.out.println("End of Program");
        sc.close();
    }
}
