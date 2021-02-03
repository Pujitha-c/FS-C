/*Write a java program to print following pattern

input=5
output=
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
    * 
   * * 
  * * * 
 * * * * 
* * * * *

*/
import java.util.Scanner;
public class Task24
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
		    for(int s=1;s<=n-i;s++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=i;j>=1;j--)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
		    for(int s=n-i;s>=1;s--)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	
	}
}
