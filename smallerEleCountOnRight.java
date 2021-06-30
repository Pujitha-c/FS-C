/*

You are given an integer array nums and you have to return a new counts array. 
The counts array has the property where counts[i] is the number of smaller elements 
to the right of nums[i].

 

Example 1:

Input: nums = [5,2,6,1]
Output: [2,1,1,0]
Explanation:
To the right of 5 there are 2 smaller elements (2 and 1).
To the right of 2 there is only 1 smaller element (1).
To the right of 6 there is 1 smaller element (1).
To the right of 1 there is 0 smaller element.
Example 2:

Input: nums = [-1]
Output: [0]
Example 3:

Input: nums = [-1,-1]
Output: [0,0]

*/
import java.util.*;
class Test
{
    void smallerEle(int arr[],int count[],int n)
    {
        int i, j;
        for (i=0;i<n;i++)
            count[i]=0;
        for (i=0;i<n;i++)
        {
            for (j=i+1;j<n;j++)
            {
                if (arr[j]<arr[i])
                    count[i]++;
            }
        }
    }
 
    public static void display(int[] a)
    {
        System.out.print("[");
        for(int i=0;i<a.length;i++)
        {
            if (i>0)
        {
            System.out.print(",");
        }
            System.out.print(a[i]);
        }
        System.out.println("]");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Test t=new Test();
        String[] s=sc.nextLine().split(" ");
        int n=s.length;
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        int temp[] = new int[n];
        t.smallerEle(arr,temp,n);
        t.display(temp);
    }
}
