
    class BuildingPlan
    {
        static String city="vizag";
        //non static variables
        byte Prayerroom;
        short kitchen;
        int br1;
        long hall;
        //default constructor
        BuildingPlan()
        {
            System.out.println("Constructor with no parameter");
        }
        //parameterized constructor
        BuildingPlan(int n)
        {
            System.out.println("parameterized constructor"); 
        
        }
        static void fun()
        {
            System.out.println("we live in" +city);
        }
      void cook()
        {
            System.out.println("Food is ready");
        }
        void Pray()
        {
            System.out.println("we pray to God in prayroom");
        }
        void Watch()
        {
            System.out.println("We watch T.V");
        }
    }
class Classobj{
    public static void main(String[] args){
        new BuildingPlan();
        new BuildingPlan(1000);
    }
}
