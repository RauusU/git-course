abstract class A 
{
    public abstract void show();
    public abstract void config();
}

/* 
//if we have to use it only once then just do it in annonymous inner class 
class B extends A 
{
public void show()
{
    System.out.println("in B Show");
}
}
*/

public class sixty_four_abs_inn 
{
    public static void main(String args[])
    {
     A obj = new A()
     {
        //here we are nt creating object of class A , rather we 
        //are creating the object of annonymous inner class 
        public void show()
        {
            System.out.println("in new show");
        }
 
        public void config()
        {
            System.out.println("in config");
        }


     };
     obj.show();
     obj.config();
    }
}
