class Base
{
    void run()
    {
        System.out.println("vehicle running");
    }
}
class child extends Base{
    void play()
    {
        System.out.println("happy play");
    }
}
public class overriding {
    public static void main(String[] args) {
        child c=new child();
        c.run();
    }
}
