/* Given an array of positive and negative numbers. 
Find if there is a subarray (of size at-least one) with 0 sum.

Input:
5
4 2 -3 1 6
Output: 
Yes
Explanation: 
2, -3, 1 is the subarray 
with sum 0.

*/
import java.util.*;
class Test 
{
      static boolean subArr(int[] arr){
          Set<Integer> set=new HashSet<>();
          int sum=0;
          for(int i=0;i<arr.length;i++){
              sum+=arr[i];
              if(arr[i]==0 ||sum==0||set.contains(sum)) return true;
              set.add(sum);
          }
          return false;
      }
      public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int[] arr=new int[n];
          for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
          }
          if(subArr(arr))
          System.out.println("Yes");
          else
          System.out.println("No");
             
      }
}
 
