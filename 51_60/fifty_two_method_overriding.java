//method overriding

class A
{
  public void show()
  {
    System.out.println("in show: A");
  }   
  public void config()
  {
    System.out.println("in A Config");
  }
}

class B extends A
{
public void show()
{
    System.out.println("in B Show");
}
}
public class fifty_two_method_overriding 
{
    public static void main(String args[])
    {
    B obj = new B();
    obj.show();
    obj.config();
}}
