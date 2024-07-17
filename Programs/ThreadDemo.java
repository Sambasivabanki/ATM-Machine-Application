class one extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }
}
class two extends Thread
{
    public void run()
    {
        for(int i=100;i<=109;i++){
            System.out.println(i);
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        one o1=new one();
        o1.setName("first");
        two o2=new two();
        o2.setName("second");
        
    }
    
}
