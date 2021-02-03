/*Write a Java program to print following pattern

input=5
output=
1        1
12      21
123    321
1234  4321
1234554321

*/
import java.util.Scanner;
public class Task13
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print(j);
		    }
		    for(int s=i*2;s<n*2;s++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=i;j>=1;j--)
		    {
		        System.out.print(j);
		    }
		    System.out.println();
		}
		
	}
}
