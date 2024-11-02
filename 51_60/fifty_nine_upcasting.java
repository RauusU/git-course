class A
{
    public void show1()
    {
        System.out.println("Show1");
    }
}
class B extends A
{
    public void show2()
    {
        System.out.println("Show2");
    }
}



public class fifty_nine_upcasting {
    
    public static void main( String args[])
    {
        /* 
        double d = 4.5;
        int i =(int)d ;//typecasting 
        System.out.println(i);
        */
        /*
        A obj = new A();
        obj.show1();
        */
        
        /* 
        A obj = (A) new B();  //upcasting
        obj.show1();
        */
        A obj = new B();  //parent reference child object
        obj.show1();

        B obj1 =(B) obj;  
        obj1.show2();
    }

}
