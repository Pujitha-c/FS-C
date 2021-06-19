/*
You are given an array A of length N. You need to find maximum length of subsequence
of A which contains any one digit common in all the elements of that subsequence. 
You are not allowed to count leading zeroes.


Input Format:

First line of input contains N, denoting number of elements.
Second line of input contains N space separated integers, denoting array elements.

Output Format:

Single integer representing maximum length of subsequence containing one digit common.

Sample Input
5
12 11 3 4 5

Sample Output
2

Explanation
Maximum length subsequence with one digit common is [ 12 11 ].
*/
import java.util.*;
public class Test
{
    public static void main(String[] arfs)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[25];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        subsequence(a,n);
    }
    static void subsequence(int[] a,int n){
        int count[]=new int[25];
        for(int i=0;i<n;i++)
            keepCount(count,a[i]);
        int maxLen=0;
        for(int i=0;i<n;i++)
            maxLen=Math.max(count[i],maxLen);
        System.out.println(maxLen);    
    }
    static void keepCount(int[] a,int n){
        boolean[] hash=new boolean[25];
        while(n>0)
        {
            if(hash[n%10]==false)
                a[n%10]++;
            hash[n%10]=true;
            n/=10;
        }
    }
}
