/*This Triangular Number Sequence is generated from a pattern of dots that form a triangle. 
The first 5 numbers of the sequence, or dots, are:

1, 3, 6, 10, 15
This means that the first triangle has just one dot, the second one has three dots, 
the third one has 6 dots and so on.

Write a function that gives the number of dots for its corresponding 
triangle number of the sequence.

Examples:
input=1
output=1

input=6
output=21

input=215
output=23220

*/
import java.util.Scanner;
public class Dots
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(n*(n+1)/2);
	}
}
