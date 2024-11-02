abstract class Car //abstract class 
{ 
    //you can have abstract method only in abstract class
    //but its not necessary to have an abstract method in an abstract class  
    public abstract void drive();
    

    public void playMusic()
    {
        System.out.println("play music");
    }
}

class WagonR extends Car  //concrete class 
{
    public void drive()
    {
        System.out.println("Driving");
    }
}


public class sixty_one_abstract 
{
    public static void main(String args[])
    {
    Car obj = new WagonR();

    //you can't create object of an abstract class 
    //If you extend an abstract class and don't implement all the abstract methods of parent class 
    // then you will have to make new class also as abstract class 

    obj.drive();
    obj.playMusic();
    }
}
