

public class seventy_eight_try_with_multiple_catch {
    public static void main(String args[])
    {
    int i = 1;
    int j = 0;
    int nums[] = new int[5];

    String str = null;
    try
    {   System.out.println(str.length());
        j = 18/i;
        System.out.println(nums[0]);
        System.out.println(nums[5]);
    }
    catch(ArithmeticException e )
    {
    //System.out.println("Somemthing went wrong" + e);
    System.out.println("can not divide by zero");
    }
   catch(ArrayIndexOutOfBoundsException e)
   {
    System.out.println("Stay in your limit");
   }
   // have this parent class exception at the end , else it will everything then what is the need for other exceptions like arithmetic etc. 
   catch(Exception e) 
     {
    System.out.println("Something went wrong" + e);
   }
 System.out.println("==========================");
  




    }
}
