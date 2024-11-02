class Human
{   private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    } 

   
    
}

public class forty_two_this 
{
 public static void main(String args[])
 {
    Human obj = new Human();
    obj.setAge(30);
    obj.setName("Reddy");

    //System.out.println(obj.getName() + ":" + obj.getAge());
 }
    
}
