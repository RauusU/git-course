//every class in java extends the object class 

class Laptop
{
    String model;
    int price;

    public String toString()
    {
        return "Hey";
    }

    public boolean equals(Laptop that)
    {
     if(this.model.equals(that.model) && this.price==that.price)
     return true ;
     else 
     return false ;
    }
}



public class fifty_eight_object_class 
{
    public static void main(String args[])
    {
Laptop obj = new Laptop();
obj.model = "Lenovo Yoga";
obj.price =10000;

//System.out.println(obj);
System.out.println(obj.toString()); //same output as obj

 
//when ever we try to print object 
//to string method 
//toString() method - object class 

//Hashcode 


Laptop obj2 = new Laptop();
obj2.model= "Lenovo Yoga";
obj2.price=10000;

//boolean result = obj==obj2;
boolean result1 = obj.equals(obj2);

//equals method of object class - compares hexadecimlas value of both obj1 and obj2 and returns false 
//but if we want to create our own equals method 

System.out.println(result1);

}
}


//source code 
//generate hashcode and equals / select all variables which you want to
//compare 