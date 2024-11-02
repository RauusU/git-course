public class twenty_eight_array {
    
    public static void main(String a[])
    {
        int nums[] = {3,7,2,4};
        System.out.println(nums[0]);

        int n[] = new int[4];
        n[0] = 4;
        n[1] = 14;
        n[2] = 114;
        n[3] = 1114;
        
        for (int i =0; i<4;i++)
        {
            System.out.println(n[i]);
        }
    //2-d array 

    int ntd[][] = new int[3][4];
/*
    for (int i=0;i<3;i++)
    {
        for(int j=0;j<4;j++)
        {
            System.out.print(ntd[i][j] + " ");
        }
        System.out.println();
    }
*/


for (int i=0;i<3;i++)
    {
        for(int j=0;j<4;j++)
        {
            ntd[i][j] = (int)(Math.random()*100);
        }
    }

    for (int i=0;i<3;i++)
    {
        for(int j=0;j<4;j++)
        {
            System.out.print(ntd[i][j] + " ");
        }
        System.out.println();
    }

//enhanced for loop 
System.out.println("=======================");

for(int p[] : ntd)
{
    for(int m:p)
    {
        System.out.print(m+ " ");
    }
    System.out.println();
}






    }
}
