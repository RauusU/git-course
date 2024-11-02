@FunctionalInterface
interface A 
{
    int add(int i, int j);
}


public class seventy_four_lambda_with_return {
    /* 
    //without lambda expression
    public static void main(String args[])
    {
     A obj = new A() 
     //annonymous class 
     {
        public int add(int i , int j)
        {
            return i+j;        
        }
     };

     int result = obj.add(5,4);
     System.out.println(result);

     }
     */

//with lambda expression

public static void main(String args[])
    {
        //lambda expression 
     A obj = (i , j) -> i+j;       

     int result = obj.add(5,4);
     System.out.println(result);

     }
    

}
//lambda expression works only with the functional interface 
//because if your interface has more than one method then ,
//compiler will confuse which method you are calling from main method
