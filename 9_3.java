/*Write a Java program to print following pattern

input=5
output=
    *                                                                                                                   
   * *                                                                                                                  
  * * *                                                                                                                 
 * * * *                                                                                                                
* * * * *  
*/
import java.util.Scanner;
public class Task3
{
    public static void main(String[] arfs)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int s=1;s<=n-i;s++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
