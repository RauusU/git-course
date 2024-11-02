class A 
{
   public void showTheDataWhichBelongToThisClass()
   {
    System.out.println("in A show");
   }
}
class B extends A 
{  
    @Override
    //public void showTheDataWhichBelongsToThisClass()
    public void showTheDataWhichBelongToThisClass()
    {
        System.out.println("in B show");
    }

}

public class seventy_one_annotation {

    public static void main(String args[])
    {
      B obj = new B();
      obj.showTheDataWhichBelongToThisClass();
    }
    
}

//suppliment to the compiler - some extra information to the compiler 
//metadata 