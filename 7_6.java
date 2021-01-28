/*Write a Java program to print following pattern

input=5
output=
1
10
101
1010
10101

*/
import java.util.Scanner;
public class Task6
{
    public static void main(String[] arrd)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j%2==0)
                System.out.print(0);
                else
                System.out.print(1);
            }
            System.out.println();
        }
    }
} 
