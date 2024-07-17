class one
{
    int a,b;

one()
{
    System.out.println("default constructor");
}
one(int a,int b)
{
    this.a=a;
    this.b=b;
    System.out.println("parameterized constructor");
}
void display()
{
    System.out.println("hi");
}
}
public class This{
    public static void main(String[] args) {
       one O1=new one(10,20);
       O1.display();
       

    }
    
}
