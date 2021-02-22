/*Write a Java program to move zeros if any in the array to end of the array and print array.

sample
input=
5 //enter size
10 0 30 0 50  //enter array elements)
output=
10 30 50 0 0

*/
import java.util.*;
public class Test
{
    public static void main(String[] arhs)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int temp,c=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0){
                a[c++]=a[i];
            }
        }
        for(int i=c;i<n;i++)
        {
            a[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
