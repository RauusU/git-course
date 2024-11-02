package tools;


class A extends Object //Every class in java extends object class 
{
public A() 
{   super();
    System.out.println("in A");
}
public A(int n)
{   super();
    System.out.println("in A int");
}
}


class B extends A 
{
 public B()
 {
    super(); // call the constructor of super class 
    System.out.println("in B");
 }

 public B(int n)
 { 
    this();
   // super(n); //to call parametrized super class constructor
    System.out.println("in B int");
 }
}

public class fifty_one_this_super_metod 
{
    public static void main(String args[])
    {
     B obj = new B(5);
    }
}
