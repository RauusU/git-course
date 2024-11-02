
//final keyword can be used with a variable/method / class 
//final variable - can't change value of it
//final class - can not be inherited by another class
// final method  - no overriding 

//final 
class Calc
{
   public final void show()
   {
   System.out.println("By Raushan");
   }

   public void add(int a , int b )
   {
   System.out.println(a+b);
   }
}
/* */
class AdvCalc extends Calc
{
    public void show()
    {
        System.out.println("By John");
    }
}
*/
public class fifty_seven_final {
public static void main(String args[])
{
   // final int num =8;
 //   num=9;
   // System.out.println(num);
    //final - constant , can not change its value 


   Calc obj = new Calc();

   obj.show();
   obj.add(4,5);


   AdvCalc  obj1 = new AdvCalc();
   obj.show();
   obj.add(4,5);


}
    
}
