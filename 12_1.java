/*Q1) Java Program to Increment Every Element of the Array by One & Print Incremented Array*/

/*
Sample Input & Output:
output:
Enter no. of elements you want in array:5
Enter all the elements:
2
5
8
6
9
Elements of array after increment by 1:3,6,9,7,10
*/
import java.util.Scanner;
public class Increment_Array
{
    public static void main(String[] arfs)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements you want in array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter all the elements:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
            a[i]=a[i]+1;
        }
        System.out.print("Elements of array after increment by 1:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+",");
        }
    }
}
