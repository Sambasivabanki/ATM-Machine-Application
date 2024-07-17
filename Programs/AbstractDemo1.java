abstract class Bank
{
     void openAccount()
    {
        System.out.println("Account is opened");
    }
   abstract void deposit(float amt );
}
class cityBank extends Bank
{
     void deposit(float amt)
     {
        System.out.println("Deposited:"+amt);
     }
}


public class AbstractDemo1 
{
    public static void main(String[] args) {
        Bank b=new cityBank();
        b.openAccount();
        b.deposit(10000);
        System.out.println();
    }
}
