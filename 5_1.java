/* 
Write a program to check whether a given number is an ugly number.
Ugly numbers are positive numbers whose prime factors only include 2, 3, 5 .
Example 1:
Input: 6
Output: true
Explanation: 6 = 2 × 3

Example 2:
Input: 8
Output: true
Explanation: 8 = 2 × 2 × 2

Example 3:
Input: 14
Output: false

Explanation: 14 is not ugly since it includes another prime factor 7.

Note: 1 is typically treated as an ugly number.

*/
import java.util.Scanner;
public class UglyNumber { 

    static int ugly(int n) 
    { 
        if (n==1) 
            return 1; 
        if (n<=0) 
            return 0; 
        if (n%2==0) { 
            return (ugly(n/2)); 
        } 
        if (n%3==0) { 
            return (ugly(n/3)); 
        } 
        if (n%5==0) { 
            return (ugly(n/5)); 
        } 
        return 0; 
    } 
    
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=ugly(num);
        if (res == 1) 
            System.out.println("True"); 
        else
            System.out.println("False"); 
    } 
} 

