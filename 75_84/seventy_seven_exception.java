

public class seventy_seven_exception {
    public static void main(String args[])
    {
       int i =0; // normal statement

       int j = 0;

      try
      {
        j= 8 /i ; //critical statement 
      }
      catch(Exception e)
      {
        System.out.println("Something went wrong");
      }
      System.out.println(j);

      System.out.println("Bye");

    }
}

//catch block will be executed only in the case of exception 
//else catch block will be skipped 