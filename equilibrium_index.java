/*Equilibrium index of an array is an index such that the sum of elements 
at lower indexes is equal to the sum of elements at higher indexes.
Given an array, your task is to find the index of first Equilibrium point in the array.

Sample 1:
input=
4
1 2 0 3
output=
2

Explanation: equilibrium index is 2 
since arr[0]+arr[1] = arr[3]

Sample 2:
input=
4
1 1 1 1
output=
-1

*/
import java.util.*;
public class Test
{
    int equalindex(int[] a,int n){
        int ls,rs,i,j;
        for(i=0;i<n;i++){
            ls=0;
            for(j=0;j<i;j++)
                ls+=a[j];
            rs=0;    
            for( j=i+1;j<n;j++)
                rs+=a[j];
            if(ls==rs)
            return i;
        }
        return -1;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Test m=new Test();
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		    arr[i]=sc.nextInt();
		System.out.println(m.equalindex(arr,n));
		
	}
}

