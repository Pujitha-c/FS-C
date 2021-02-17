/* Write a java program to print the missing element in array.
User gives the mean value of array elements then find the missing element and print it.

Note : always read size-1 elements.

Sample :
input=5 //size of array
10 20 30 50 //array elements
30 //mean value
output=
40 //missing element

*/
import java.util.Scanner;
public class Missing
{
    public static void main(String[] arfs)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<a.length-1;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        float mv=sc.nextFloat();
        float totalsum=mv*n;
        float mn=totalsum-sum;
        System.out.println((int)mn);
    }
}

