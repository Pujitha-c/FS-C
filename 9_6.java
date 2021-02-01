/*Write a Java program to print following pattern

input=5
output=
*****                                                                                                                   
 ****                                                                                                                   
  ***                                                                                                                   
   **                                                                                                                   
    *   
*/   
import java.util.Scanner;
public class Task6
{
    public static void main(String[] arfs)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
