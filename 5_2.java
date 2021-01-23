/* Write a java program 
Given a number n, write an efficient function to print all unique prime factors of n. 
For example, if the input number is 12, then output should be "2 3".
And if the input number is 315, then output should be "3 5 7".

Sample Input:
315

Sample Output:
3 5 7

*/

import java.util.Scanner;

public class UniquePrimeFactors {
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=2;i<n;i++)
      {
          while(n%i==0){
          System.out.print(i+" ");
          n=n/i;
          //if(i==i )
          //break;
          }
      }
      if(n>2)
      System.out.println(n);

   }
}
