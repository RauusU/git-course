
class A
{

int age;

public void show()
{

}

   static class B
   {
    public void config()
    {
     System.out.println("in config");   
    }
    
   }
}


public class sixty_two_inner_class 
{
    public static void main(String args[])
    {
        A obj = new A();
        obj.show();
        
        //A.B obj1 =  obj.new B(); // To create object of class B , first use object of class A 
        A.B obj2 = new A.B();
        obj2.config();
    }    
}
