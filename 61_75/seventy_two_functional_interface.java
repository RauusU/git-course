@FunctionalInterface 
interface A 
{

    //Functional interface is an interface which has only one method 
    //public abstract void show();
    void show();
   // void run();
}

/*
class B implements A 
{
    public void show()
    {
        System.out.println("in Show");
    }
}
 */

public class seventy_two_functional_interface {
    public static void main(String args[])
    {
     A obj = new A()
     {
        public void show()
        {
            System.out.println("in show");
        }
     };
     obj.show();
    }
}
