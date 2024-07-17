

class Base
{
    int a,b;
    Base(int a,int b)
    {
        System.out.println("Base class parameterized constructor");
        this.a=a;
        this.b=b; 
    }
    void Display()
    {
        System.out.println("Base Display");
        System.out.println("a="+a);
        System.out.println("b="+b);
        
    }
}
class Child extends Base
{
    int c,d;
    Child(int c,int d)
    {
        
        super(10,20);
        this.c=c;
        this.d=d;
        System.out.println("child class Constructor");
    }
    void Display2()
    {
        System.out.println("c="+c);
        System.out.println("d="+d);
    }
}
public class simpleInheritance
{
    public static void main(String[] args) {
       Child c1= new Child(100,200);
       c1.Display();
       c1.Display2();
    }
}