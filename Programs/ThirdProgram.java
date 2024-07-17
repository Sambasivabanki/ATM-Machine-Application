class Base
{
    int a;
    Base()
    {
        //super();
        System.out.println("Base class constructor");
        //a=0;
    }
}
class Child extends Base
{
    int b;
    Child()
    {
        //super();
        System.out.println("Child class constructor");
       // b=0;
    }
}



public class ThirdProgram {
    public static void main(String[] args) {
         Child c1=new Child();
         System.out.println(c1.a);
         System.out.println(c1.b);
    }
   
}
