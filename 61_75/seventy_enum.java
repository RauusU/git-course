enum Laptop{
    Macbook(2000),XPS(2200),Surface,ThinkPad(1800);

    private int price;

    
    private Laptop() {
        price=500;
    }

    private Laptop(int price)
    {
        this.price=price;
        System.out.println("in laptop"+this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}

public class seventy_enum 
{
public static void main(String args[])
{
  Laptop lap = Laptop.Macbook;
  System.out.println(lap);

  System.out.println(lap+":"+lap.getPrice());

  for(Laptop lap1 : Laptop.values())
  {
  System.out.println(lap1+":"+lap1.getPrice());
  }
  
}    
}
