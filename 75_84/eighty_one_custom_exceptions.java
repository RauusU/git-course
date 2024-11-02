
class CustomException extends Exception
{
    public CustomException(String string)
    {
    super(string);
    }
}

public class eighty_one_custom_exceptions {
    public static void main(String args[])
    {
    int i=20;
    int j=0;

    try{
        j=18/i;
        if(j==0)
           throw new CustomException("mera msg print kro");
    }
    catch(ArithmeticException e)
    {
    j=18/1;
    System.out.println("thats the default output");
    }
    catch(Exception e)
    {
        System.out.println("Somethign went wrong"+e);
    }
    }
}
