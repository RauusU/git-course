
@FunctionalInterface 
interface A 
{

    //Functional interface is an interface which has only one method 
    //public abstract void show();
    void show(int i );
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

 public class seventy_three_lambda_expression {
  
    //code without lambda expression 
  /*   public static void main(String args[])
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

*/
 /*   //code with lambda expression 
    public static void main(String args[])
    {
     A obj = () -> System.out.println("in show");
        
     obj.show();
    }
 */

//code with lambda expression 
public static void main(String args[])
{
 A obj = (i) -> System.out.println("in show" +i );
    
 obj.show(4);
}





}

//Since Class A has implemented a method of functional interface 
//which makes it obvious that this interface has only one method void show()
// so we are replacing obvious loc with a lambda expression 