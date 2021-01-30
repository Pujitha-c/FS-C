//count the number of 1's in a binary string

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		String s=Integer.toBinaryString(n);
		char ch[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
		    ch[i]=s.charAt(i);
		}
		for(char c:ch)
		{
		    if(c=='1')
		    count++;
		}
		System.out.println(count);
	}
}
