//Encapsulation

class Human 
{
 private int age =11;  // this var age can be used only inside same class 
 private String name="Navin";

 public int getAge()
 {
    return age;
 }

 public String getName()
 {
    return name;
 }

 public void setAge(int a)
 {
    age =a;
 }

 public void setName(String n)
 {
    name = n;
 }
 
}




public class forty_encapsulation 
{

public static void main(String args[])
{
    Human obj = new Human();
    obj.setAge(30);
    obj.setName("NavinReddy") ;
//System.out.println(obj.name);
System.out.println(obj.getAge() + " : " + obj.getName()) ;

}
    
}
