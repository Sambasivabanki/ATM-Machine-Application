 class Second
{
    static int count;
    int a,b;
    static
    {
        count=0;
    }
}
public class SecondProgram
{
    public static void main(String[] args)
     {
        Second s1=new Second();
        Second s2=new Second();
        Second.count=2;
        System.out.println(Second.count);
        //s1 object intilization
        System.out.println("o1 object state");
        s1.a=100;
        s1.b=200;
        //s2 object intialization
        System.out.println("o2 object state");
        s2.a=1000;
        s2.b=2000;
        System.out.println(s1.a);
        System.out.println(s1.b);
        System.out.println(s2.a);
        System.out.println(s2.b);
       
    }
}