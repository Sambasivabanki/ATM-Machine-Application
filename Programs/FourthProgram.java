class One
{
    int a;
    int b;
    One(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void display()
    {
        System.out.println("object state");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
public class FourthProgram 
{
    public static void main(String[] args) 
    {
        One o1=new One(10,20);
        o1.display();
        One o2=new One(100,200);
        o2.display();
    }

}
