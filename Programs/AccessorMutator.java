class Emp
{
    private int eno;
    private String ename;
    private float sal;
    //mutator method
    public void setEno(int eno)
    {
        this.eno=eno;
    }
     //mutator method
     public void setEname(String ename)
     {
         this.ename=ename;
     }
      //mutator method
    public void setsal(float sal)
    {
        this.sal=sal;
    }
    //accessor method
    public int getEno()
    {
        return eno;
    }
      //accessor method
    public String getEname()
    {
        return ename;
    }
      //accessor method
    public float getsal()
    {
        return sal;
    }
}

public class AccessorMutator {
    public static void main(String[] args) {
        Emp e1=new Emp();
        e1.setEno(10);
        e1.setEname("siva");
        e1.setsal(340000);
        System.out.println(e1.getEname());
    }
    
}
