/* Write a java program with following scenario
Takes two numbers and a mathematical operator + - / * and 
perform a calculation with the given numbers and return the output.

Examples
4 '+' 4---> 8

3 '*' 2---> 6

6 '/' 2---> 3

Notes
take the inputs and in same sequence (integer , operator, integer)
If the input tries to divide by 0, return 0.

Sample:
input=3
+
3
output=6
*/

import java.util.Scanner;
public class Operations
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		String op=sc.next();
		int n2=sc.nextInt();
		    switch(op){
		        case "+": 
		        System.out.println(n1+n2);
		        break;
		        case "*": 
		        System.out.println(n1*n2);
		        break;
		        case "/": 
		        if(n2==0)
		        System.out.println(0);
		        else
		        System.out.println(n1/n2);
		        break;
		        case "-":
		        System.out.println(n1-n2);
		        break;
		        default:
		        break;
		    }
	}
}


