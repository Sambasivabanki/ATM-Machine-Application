
abstract class Shape
{
    abstract void Area();
    
}
class Circle extends Shape
{
    void Area()
    {
        System.out.println("Area of circle is");
        double pi=3.14;
        int radius=8;
        double result=pi*radius*radius;
        System.out.println(result);
        
       
    }
}
class Rectangle extends Shape
{
    void Area()
    {
        System.out.println("Area of rectangle is");
    }
}

public class AbstrctDemo2 {
    public static void main(String[] args) {
        
        

        Shape c1=new Circle();
        Shape r1=new Rectangle();
        c1.Area();
        r1.Area();
    }

    
}