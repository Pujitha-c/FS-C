/*Write a Java Program to Find the Non-Repeated Elements in an Array

Example:
input=
8
12 25 8 12 43 5 8 43

output=
25 5

*/
import java.util.*;
public class Main
{
    public static void main(String[] tas)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                count++;
            }
            if(count==1)
            System.out.print(arr[i]+" ");            
            
        }
    }
}
