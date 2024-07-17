class One
{
    final int a=10,b=0;
    public void display()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
public class Immutable {
    public static void main(String[] args) {
        One o1=new One();
        o1.display(10,100); 
    }
    
    
}
