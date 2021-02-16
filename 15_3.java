/* Write a java program to find sum of digits in a string
Sample input = Kmit123$
output = 6
*/

import java.util.*;
/* Write method here*/
public class SumofDigits
{
static int sumDigits(String str)
{
    int sum=0;
    String temp;
    for(int i=0;i<str.length();i++)
    {
        
        char c=str.charAt(i);
        if(Character.isDigit(c)){
            temp=str.substring(i,i+1);
            sum=sum+Integer.parseInt(temp);
        }
    }
    return sum;
}

public static void main (String[] args)
    {
      SumofDigits m= new SumofDigits();
      String str1 =  "ab5c2d4ef12s";
      System.out.println("The given string is: "+str1);
      System.out.println("The sum of the digits in the string is: "+m.sumDigits(str1));
	  }
}

