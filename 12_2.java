//Q2) Java Program to Find the Largest Number in an Array

/*
Sample Input & Output:

Enter number of elements in the array:5
Enter elements of array:
4
2
3
6
1
Maximum value:6

*/
import java.util.Scanner;
public class Largest_Number
{
    public static void main(String[] arfs)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=a[0];
        System.out.println("Enter elements of array:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>max)
            max=a[i];
        }
        System.out.print("Maximum value:"+max);
    }
}
