class Base{
}
class Child extends Base{
}
public class upcastdowncast
{
    public static void main(String[] args)
    {      
         //Upcasting
         Base b=new Child();  
         //Downcasting
         Child c=(Child)b;
         //Child c=(Child)new Base(); //you will get a ClassCastException during execution
         
    }    
}