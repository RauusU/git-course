
class Computer
{
   public void  playMusic()
    {
    System.out.println("Playing music");
    }

    public String getMeAPen(int cost)
    {
        if(cost>=10)
          return "Pen";
        else 
           return "Nothing";
    }
}


public class twenty_four_methods 
{
    
    public static void main(String a[])
    {
    Computer obj = new Computer();
    obj.playMusic();
    String str = obj.getMeAPen(10);
    System.out.println(str);
    }
}
