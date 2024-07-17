class One 
{
  static String car;
  int number;
  float value;

  //instance block
  {

  }
  //static block
  static
  {

  }
  //method
  void add()
  {
    int a=10;
    int b=5;
    int c=a+b;
    System.out.println(c);
  }
  static void sub()
  {
    int a=5;
    int b=6;
    int c=a-b;
    System.out.println(c);
  }
  One()
  {
    System.out.println("hello");
  }
}

public class day1 {
    public static void main(String[] args) {
        System.out.println("hello all");
        One o1=new One();
        o1.add();
       One.sub();
       System.out.println (o1.number);
        
        


    }
}
