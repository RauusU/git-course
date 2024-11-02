
class A
{
 public void show()
 {
    System.out.println("in A show");
 }
}

class B extends A
{
    public void show()
    {
    System.out.println("in B show");
    }
}


public class fifty_six_DMD {

    public static void main(String args[])
    {
//B obj  = new B();
//We can mention type(reference) as parent but the object can be of type child
A obj = new A();
obj.show();

//In case of inhetiance
//At compile time it is not sure obj.show() will call which clss method 
//obj.show()- In a , In B .. 
//runtime polymorphism
//Dynamic method dispatch

//you can have child object for parent variable 
obj = new B();
obj.show();
}
}
