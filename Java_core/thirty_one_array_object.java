class Student 
{
    int rollno;
    String name;
    int marks;

}

public class thirty_one_array_object {
   
    public static void main(String args[])
    {
    Student s1 = new Student();
    s1.rollno=1;
    s1.name= "Navin";
    s1.marks=88;

    Student s2 = new Student();
    s2.rollno=2;
    s2.name= "Avin";
    s2.marks=45;
    
    Student s3 = new Student();
    s3.rollno=3;
    s3.name= "Ravin";
    s3.marks=85;
    
    Student students[] = new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;
    
    for (int i=0;i<students.length;i++)
    {
        System.out.println(students[i].name + ":" + students[i].marks);
    }

/* 
    int nums[] = new int[4];
    nums[0] = 4;
    nums[1] = 8;
    nums[2] = 3;
    nums[3] = 9;
    
for (int n: nums)
{
    System.out.println(n);
}
*/
//enhanced for loop , for each loop 

System.out.println("==============");
for (Student stud: students)
{
System.out.println(stud.name + ":" + stud.marks);
}

}
}
