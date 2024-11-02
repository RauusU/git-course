class Mobile
{
String brand;
int price;
static String name;

static 
{
    name= "Phone";
    System.out.println("In static block");
}

public Mobile()
{
    brand= "";
    price =200;

    System.out.println("In Constructor");
    
    //name = "Phone";
}

public void show()
{
    System.out.println(brand + ":" + price + ":" + name);
}
}


public class thirty_nine_static_block 
{
    public static void main(String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smartphone";
    
        Mobile obj2= new Mobile();    
    
    }
    
    //If we don't create an object then usually class is not loaded 
    // but if we want the class to be loaded then 
    //we need to use 
    //Class.forName(className:"Mobile");
}
