enum Status{
    Running, Failed, Pending, Success;
}



public class sixty_nine_enum {
    public static void main(String args[])
    {
       Status s = Status.Pending ;

       System.out.println(s.getClass().getSuperclass());
    /*    
       if(s==Status.Running)
          System.out.println("All Good");
       else if(s== Status.Failed)
          System.out.println("Try Again");
       else if(s==Status.Pending)
          System.out.println("Please Wait");
       else
          System.out.println("Done");   
    */
    
    switch(s)
    {
        case Running:
           System.out.println("All Good");
           break;

        case Failed:
           System.out.println("Try Again");
           break;
        
        case Pending:
           System.out.println("Please Wait");
           break;
        default:
           System.out.println("Done");
           break ;  

    }

    }
}

//enum extends enum class in java 
//all other methods are we getting from enum class 
// toString() and hascode() we are getting because every class in java 
// extends object class 

