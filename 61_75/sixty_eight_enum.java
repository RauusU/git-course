enum Status 
{   //0,1,2,3
    Running, Failed, Pending, Success ;
}

public class sixty_eight_enum 
{
    
  public static void main(String args[])
  {
   //int i =5 ; 
   Status s = Status.Running;
   System.out.println(s); 
   //System.out.println(s.ordinal()); //TO get serial of enum constants 

   Status[] ss= Status.values();
  // System.out.println(ss[0]);

   for(Status i : ss)
   {
    System.out.println(i + ":"+ i.ordinal());
   }
  }
}

//enums are named constant 