public class fifteen_Switch {
    
    public static void main(String[] a)
    {
        int n =1;

//switch
switch(n)
{
case 1: 
     System.out.println("Monday");
     break;
case 2:
     System.out.println("Tuesday");
     break;
case 3: 
     System.out.println("Wednesday");
     break;
case 4: 
      System.out.println("Thrusday");
      break;
case 5: 
      System.out.println("Firday");
      break;
case 6: 
      System.out.println("Saturday");
      break;
case 7:
      System.out.println("Sunday");
      break;
default: System.out.println("Enter a valid number");
}

String day ="Friday";
String output;
/*
switch(day)
{
    case "Saturday" -> output="6AM";
    case "Monday" -> output ="8AM";
    default ->output="7AM";

}
 */
/* 
output =  switch(day)
 {
     case "Saturday" -> "6AM";
     case "Monday" -> "8AM";
     default ->"7AM";
 };
 */

 output =  switch(day)
 {
     case "Saturday" : yield "6AM";
     case "Monday" :yield "8AM";
     default :yield "7AM";
 };
 
System.out.println(output);
    

    }
}
