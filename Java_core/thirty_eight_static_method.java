
class Mobile
{
    String brand;
    int price;
    String network;
    static String name;

    public void show()
    {
        System.out.println(brand + ":" + price + ":"+ name);
    }

    public static void show1(Mobile obj)
    {
    System.out.println("In static method") ;  
    System.out.println(obj.brand + ":" + obj.price + ":"+ name);
    }

    }





public class thirty_eight_static_method {
    public static void main(String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand= "Apple";
        obj1.price=1500;
        

        Mobile obj2 = new Mobile();
        obj2.brand= "Samsung";
        obj2.price=1700;
        Mobile.name = "Smartphone";
        
        
      //  obj2.show();
       // obj1.show();
      
       //static method can't access a non static variable directly
       //because which object referring to is confusing 
        
Mobile.show1(obj2);

Mobile.show1(obj1);
    } 
}
