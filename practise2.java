class BuildingPlan
{
    //static variables
    static String city1="vijayawada";
    static String city2="vishakapatnam";
    //non-static variables
    byte prayerroom;
    short kitchen;
    int br1;
    long hall;

    //instance block
    {
        System.out.println("Instance block");
    }
    //static block
    {
        System.out.println("static block");
        System.out.println("city1=city2");
    }
    //non-parameterized constructor (or) default constructor
    BuildingPlan()
    {
        System.out.println("This is non-parameterized constructor (or) default constructor");
    }
    BuildingPlan(int n)
    {
        System.out.println("This is parameterized constructor");
        br1=n;
    }
    static void fun1()
    {
        System.out.println("we live in "+city1);
        System.out.println("we live in "+city2);
    }
    void cook()
    {
        System.out.println("cooking");
    }
    void watch()
    {
        System.out.println("watching");
    }
    void run()
    {
        System.out.println("running");
    }
    void BuildingPlan()
    {
        System.out.println("function with same name as class name");
    }

}
public class practise2 {
    public static void main(String[] args) {
        BuildingPlan p1=new BuildingPlan();
        BuildingPlan p2=new BuildingPlan(100);
        p1.cook();
        p1.run();
        p1.watch();
        p1.BuildingPlan();
        BuildingPlan.fun1();
    }
}
