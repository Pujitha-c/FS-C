* Write a java program to check if a given positive number is a strong number. 
A strong number is a number whose sum of factorial of each digit is the number itself. 
Print 1 if it is strong number, else 0.

example: 145
1! + 4! + 5! = 1+24+120 = 145

Sample:
Input=145
output=1

Input=128
output=0

*/


import java.util.*;
public class Main
{
	    public static int fact(int n)
		{
		    if(n==1||n==0)
		       return 1;
		    else
		       return fact(n-1)*n;
		}
	   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
		 int temp=a;
		 int sum=0;
		 while(a>0){
		     int r=a%10;
		     sum+=fact(r);
		     a=a/10;
		 }
		 if(temp==sum)
		       System.out.println(1);
		 else
		     System.out.println(0);
	}
}	
