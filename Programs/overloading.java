class one
{
   int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b ,int c)
    {
        return a+b+c;
    }
    float add(float a,float b)
    {
        return a+b;
    }
}
public class overloading {
    public static void main(String[] args) {
        one o1=new one();
         o1.add(2,5);
         System.out.println(o1.add(2,5));
         
    }
    
}
