/*Write a Java program to print following pattern

input=5
output=
    *****
   *****
  *****
 *****
*****

*/
import java.util.Scanner;
public class Task10
{
    public static void main(String[] arfs)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(" ");
                
            }
            for(int k=n;k>0;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
