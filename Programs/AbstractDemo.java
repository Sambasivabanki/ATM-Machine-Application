abstract class One
{
    abstract void add(int a,int b);
    void sub(int a,int b)
    {
        System.out.printf("%d-%d=%d",a,b,(a-b));
    }
}
class Child extends One
{
    void add(int a,int b)
    {
        
    }
}

public class AbstractDemo
 {
    public static void main(String[] args) {
        One c1= new Child();
        c1.add(10,20);
        c1.sub(20,10);
    }
}
