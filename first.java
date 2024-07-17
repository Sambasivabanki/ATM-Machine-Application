class One
{
    int a,b;
    One()
    {
       System.out.println("default constructor"); 
    }
    One(int a,int b)
    {
        this();
        this.a=a;
        this.b=b;
        System.out.println("parameterized constr");
    }
}
public class first
{
    public static void main(String[] args){
        One o1=new One(10,20);
    }

}