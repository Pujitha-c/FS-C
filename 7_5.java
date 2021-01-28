/*Write a Java program to print following pattern

input=5
output=
1
3 1
5 3 1
7 5 3 1
9 7 5 3 1

*/
import java.util.Scanner;
public class Task5
{
    public static void main(String[] arfs)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print((2*j-1)+" ");
            }
            System.out.println();
        }
    }
}
