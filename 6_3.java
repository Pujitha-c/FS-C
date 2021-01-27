/*Write a Program in Java to check whether given number is a Disarium Number or not.

Disarium Number: A number is called Disarium if sum of its digits powered with their 
respective positions is equal to the number itself.

For example 135 is a DISARIUM
(Workings 1^1+3^2+5^3 = 135)

Sample :
Input= 135
Output= Yes 

Input=80
Output=No
*/
import java.util.Scanner;
public class Disarium
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		int len=Integer.toString(n).length();
		while(temp>0)
		{
		    int r=temp%10;
		    sum=sum+((int)Math.pow(r,len--));
		    temp=temp/10;
		    
		}
		if(sum==n)
		System.out.println("Yes");
		else
		System.out.println("No");
	
	}
}
