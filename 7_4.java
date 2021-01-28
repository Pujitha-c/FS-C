/*Write a Java program to print following pattern

input=4
output=
1
23
456
78910

*/
import java.util.Scanner;
public class Task4
{
    public static void main(String[] ags)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num++);
            }
            System.out.println();
        }
    }
}
