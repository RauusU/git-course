public class sixty_wrapper_classes {
    public static void main(String args[])
    {
     int num =7;
     Integer num1 = new Integer(num); //boxing

     Integer num2 = 8 ; //autoboxing


     int num3 = num1.intValue(); //unboxing 

     int num6 = num1; //auto-unboxing
     System.out.println(num3);


     String str ="12";
     //System.out.println(str*2);

     int num8= Integer.parseInt(str);
     System.out.println(num8*2);

    }
}


//Wrapper class 
/*
 * int - Interger 
 * char - Character
 * double - Double 
 */