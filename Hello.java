
class Hello{
public static void main(String a[])
{
 int num1 = 3 ; 
 int num2 = 4;  

 float marks = 5.44f;
 boolean ist= false;
 
 int num3 = 0b101;

 int num4 = 0x7E;
 int num5 = 1000_00_000;

 double x= 12e12;
 System.out.println(x);

 System.out.println(num3);
System.out.println(num4);
 
System.out.println(num5);
 System.out.println("Hello");
 System.out.println(3+5);
 int result = num1+num2;
 System.out.println(result);


char c = 'a';
c++;
System.out.println(c);
 
//Type conversion 
System.out.println("Type Conversion");
System.out.println("______________________");

byte b1 =127;
int a1 = 256;

//b1=a1; not psbl 

//implicit conversion -> cnversion 
a1=b1;

//casting -- explicitly - casting 
b1 = (byte)a1; 

//int x1 = 5.6; this won't work

float f1 = 5.6f ; 

int x2 = (int)f1; 

System.out.println(x2);

byte b2 = 127;

int a3 =b2; 
System.out.println(a3);
//
int a5 = 257; 
byte k5 = (byte)a5; //257%256 =1 
System.out.println(k5);



float f6 = 5.6f;
//int t = f6; // not work 
int t = (int)f6; 
System.out.println(t); 

//conversion is automatic conversion 
// casting is explicit conversion

//Type promotion 

byte a7= 10 ;
byte b7= 30;
int res = a7*b7 ; 
//byte*byte promoted to int 
System.out.println(res);
}
}