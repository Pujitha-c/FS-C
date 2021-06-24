/*
Given an array containing N integers and a positive integer K, 
find the length of the longest sub array with sum of the elements 
divisible by the given value K.

Example 1:
input:
2 7 6 1 4 5
3
output: 4
Explanation:The subarray is {7, 6, 1, 4}
with sum 18, which is divisible by 3.

Example 2:
input:
-2 2 -5 12 -11 -1 7
3
output: 5
Explanation:
The subarray is {2,-5,12,-11,-1} with
sum -3, which is divisible by 3.
*/
import java.util.*;
class Solution
{
     static int divSubArr(int[] arr,int k)
    {
        int res=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        int sum=0,rem=0;
        hm.put(0,-1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            if(hm.containsKey(rem)){
                int index=hm.get(rem);
                int len=i-index;
                if(len>res){
                    res=len;
                }
                else{
                    hm.put(rem,i);
                }
            }
        }
        return res;
    }
    public static void main(String[] arfs)
    {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int n=s.length;
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        int k=sc.nextInt();
        System.out.println(divSubArr(arr,k));
    }
}
