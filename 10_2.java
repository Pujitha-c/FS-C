/*Write a Java program to print following pattern

input=5
output=
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

*/
import java.util.Scanner;
public class Task10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<=i-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
