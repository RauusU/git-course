class A 
{
    public A()
    {
        System.out.println("object created");
    }
    public void show()
    {
        System.out.println("in a show");
    }
}


public class forty_six_annonymous_obj {
    public static void main()
    {
        int marks;
        marks=99;

        new A().show();//Annoymous object 
        //rest referenced object 

        A obj;
        obj= new A();
        
        obj.show();

    }
}
