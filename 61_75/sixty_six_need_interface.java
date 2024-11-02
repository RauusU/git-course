//abstract class Computer
interface Computer
{
    public abstract void code();
}



//class Laptop extends Computer 
class Laptop implements Computer 
{
    public void code()
    {
        System.out.println("code,compile,run");
    }
}

class Desktop implements Computer 
{
    public void code()
    {
        System.out.println("code,compile,run:Faster");
    }
}


class Developer
{

    //public void devApp(Laptop lap)
    public void devApp(Computer lap)    
    {
       // System.out.println("Coding");
       lap.code();
    }
}



public class sixty_six_need_interface {
    public static void main(String args[])
    {

    
    Laptop lap = new Laptop();
    
    
     Developer navin = new Developer();

     navin.devApp(lap);
    
     Desktop desk = new Desktop();

    //navin.devApp(desk); //tight coupling
    
    Computer lap1 = new Laptop();
    Computer desk1 = new Desktop();
    navin.devApp(desk);
    navin.devApp(lap);


}
}
