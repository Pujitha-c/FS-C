/*
 You are given a sequence of N integers of array A. You need to partition the sequence, 
 where the cost of making a partition from L to R is AL + AR. 
 Output the minimum and maximum total cost of making exactly K partitions 
 where the total cost is the sum of costs of each partition.
Example
Input:
5 //size 
2 // k value
1 2 3 4 5 // elements
 
Output:
9 15
*/

import java.util.*;
class Test
{
static int sum(int arr[], int start, int end)
{
    int total = 0;
    for (int i=start;i<=end;i++)
        total += arr[i];
    return total;
}

static int partition(int arr[], int n, int k)
{
    if (k==1) 
        return sum(arr,0,n-1);   
    if (n==1)  
        return arr[0];
    int minval = Integer.MAX_VALUE;
    for (int i=1;i<=n;i++)
        minval = Math.min(minval, Math.max(partition(arr,i,k-1),
                                sum(arr,i,n-1)));
    return minval;
}
 static int partition2(int arr[], int n, int k)
{
    if (k==1) 
        return sum(arr,0,n-1);   
    if (n==1)  
        return arr[0];
    int maxval = Integer.MIN_VALUE;
    for (int i=1;i<=n;i++)
        maxval = Math.max(maxval, Math.max(partition(arr,i,k-1),
                                sum(arr,i,n-1)));
    return maxval;
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
 System.out.print(partition(arr,n,k));
 System.out.print(" ");
 System.out.print(partition2(arr,n,k));
 
}
}
