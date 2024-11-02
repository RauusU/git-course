class Human 
{
    private int age;
    private String name;


    //default constructor

    public Human()
    {
        //System.out.println("in constructor");
        age=12;
        name= "john";

    }
    //parametrized constructor
    public Human(int a , String n)
    {
     age =a;
     name =n;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
}




public class forty_three_constructors {
   
 public static void main(String args[])
   {
    Human obj = new Human();
    System.out.println(obj.getName() + ":" + obj.getAge());

    Human obj1  = new Human(3,"Shahsi");
    System.out.println(obj1.getName() + ":" + obj1.getAge());
   } 
}
