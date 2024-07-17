class parent
{
    void run()
    {
        System.out.println("Parent class method");
    }
}
class child extends parent{
    void run()
    {
        System.out.println("child class method");
    }
}
public class upcasting {
    public static void main(String[] args) {
        //upcasting
        parent p=new child();
        //downcasting
        child c=(child)p;
        p.run();
        c.run();

        
    }
}
