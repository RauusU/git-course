//abstract class A
//interface is not abstract class
//all methods inside an interface has to be public abstract 


//class-class- extends 
//class-interface - implements 
//interface-interface - extends 
interface A
{
    //public abstract void show();
    //public abstract void config();
    
    //vriables -> final and static 
    int age =44; 
    String area="Mumbai";

    public abstract void show();
    public abstract void config();
}

interface X
{
    void run();
}

interface Y extends X
{
//this interface has method declaration - run();
}

class B implements A ,X
{

    public void show() 
    {
        System.out.println("in show");
    }

    
    public void config() 
    {
       System.out.println("in config");   
    }

    public void run()
    {
        System.out.println("Running");
    }
    
}

public class sixty_five_interface 
{
    public static void main(String args[])
    {
     //A obj ; 
     //obj = new A(); error
     
     A obj; 
     obj= new B();
     obj.show();
     obj.config();

     System.out.println(A.area);

    }
}
