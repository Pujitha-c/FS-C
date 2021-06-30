/*

Given an integer num, repeatedly add all its digits until the result has only 
one digit, and return it.

 

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
Example 2:

Input: num = 0
Output: 0

*/
import java.util.*;
public class Main
{
    public static int singleNum(int n)
    {
        if(n==0) return 0;
        if(n%9==0) return 9;
        return n%9;
    }
    public static void main(String[] arfs)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(singleNum(sc.nextInt()));
    }
}
