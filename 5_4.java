/* 
Write a java program that takes two arguments: the original price and the discount percentage 
as integers and returns the final price after the discount (Integer).

Alternative Text

Examples sample
input       output
1500, 50---> 750

89, 20---> 71

100, 75---> 25

Sample:
input=150
50
output=75

*/

import java.util.Scanner;
public class Price
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int d=sc.nextInt();
		System.out.println(p-(p*d)/100);
	}
}
