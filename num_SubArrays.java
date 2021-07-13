/*Given an unsorted array of integers, find the number of continuous subarrays 
having sum exactly equal to a given number k.


Example 1:

Input:
N = 5
Arr = {10 , 2, -2, -20, 10}
k = -10
Output: 3
Explaination: 
Subarrays: arr[0...3], arr[1...4], arr[3..4]
have sum exactly equal to -10.

Example 2:

Input:
N = 6
Arr = {9, 4, 20, 3, 10, 5}
k = 33
Output: 2
Explaination: 
Subarrays : arr[0...2], arr[2...4] have sum
exactly equal to 33.
 */
 import java.util.*;
 class Test
 {
     public static void main(String[] arff)
     {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
             a[i]=sc.nextInt();
         
         int k=sc.nextInt();
         int count=0;
         for(int i=0;i<a.length;i++){
             int sum=0;
             for(int j=i;j<a.length;j++){
                 sum+=a[j];
                 if(sum==k)
                 count++;
             }
         }
         System.out.println(count);
     }
 }

