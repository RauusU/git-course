class A 
{
    public void show()
    {
        System.out.println("in A show");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("in B show");
    }

}



public class sixty_three_anno_inner_class {
    public static void main(String args[])
    {
    //creating object of class B with the reference of class A 
    //annonymous inner class 
    A obj = new A()
      {
      public void show()
      {
        System.out.println("In new show");
      }
      };
    obj.show();
    }
}
