/*Write a Java program to print following pattern

input=5
output=
 ****
* ***
** **
*** *
****

*/
import java.util.Scanner;
public class Task1
{
    public static void main(String[] arf)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==j)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
