/*
Given an array containing N integers and an integer K., 
Your task is to find the length of the longest Sub-Array with the sum of the
elements equal to the given value K.

Example 1:
input :
10 5 2 7 1 9
15
Output : 4
Explanation:
The sub-array is {5, 2, 7, 1}.

Example 2:
input : 
-1 2 3
6
Output : 0


*/

import java.util.*;
class Test{
      static int lenSubArr(int[] arr,int n,int k)
      {
             HashMap<Integer,Integer>map=new HashMap<>();
             int sum = 0, maxLen = 0;
             for(int i=0;i<n;i++){
                  sum+=arr[i];
                  if (sum==k)
                      maxLen=i+1;
                  if (!map.containsKey(sum)) {
                      map.put(sum,i);
                  }
                  if (map.containsKey(sum-k)) {
                      if (maxLen<(i-map.get(sum-k)))
                          maxLen=i-map.get(sum-k);
                  }
             }
             return maxLen;            
      }
      public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
          String[] s=sc.nextLine().split(" ");
          int n=s.length;
          int[] arr=new int[n];
          for(int i=0;i<arr.length;i++){
              arr[i]=Integer.parseInt(s[i]);
          }
          int k=sc.nextInt();
          System.out.println(lenSubArr(arr,n,k));
      }
}
