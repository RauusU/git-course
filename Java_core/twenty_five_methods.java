class Calculator
{
    public int add(int n1, int n2 )
    {
        return n1+n2;
    }
    public int add(int n1, int n2 ,int n3)
    {
        return n1+n2+n3;
    }
}

//Function Overloading 

public class twenty_five_methods 
{
public static void main(String a[])
{
    int num1=2;
    int num2=3;
    int num3=6;
    Calculator calc = new Calculator();
    int result = calc.add(num1,num2);
    System.out.println(result);

    int result1 = calc.add(num1,num2,num3);
    System.out.println(result1);
}   
}
