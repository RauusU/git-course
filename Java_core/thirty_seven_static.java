
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


}

public class thirty_seven_static {
    public static void main(String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand= "Apple";
        obj1.price=1500;
        obj1.name = "Smartphone";
        //obj1.show();
        

        Mobile obj2 = new Mobile();
        obj2.brand= "Samsung";
        obj2.price=1700;
        Mobile.name = "Smartphone";
        
        obj1.name="phone";

        obj2.show();
        obj1.show();
        
        //static common for all objects 

        //In non static method you can use static variable 

        // static - making something to class member not object level member 
        

    }
}
