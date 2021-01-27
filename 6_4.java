/*Write a Java program to perform Decimal to any base Conversion.

Read two integers, First integer indicates decimal value and 
second integer indicates base. After conversion print the output.

Note: If base<=0 or base>=9 print -1.

Sample 1:
input=10
2
output=1010

Sample 2:
input=100
5
output=400
*/
import java.util.Scanner;
public class Decimal_AnyBase 
{
    
		static char check(int num)
		{
		    if(num>=0 && num<=9)
		    return (char)(num+48);
		    else 
		    return (char)(num-10+65);
		}
		static String toBase(int dec,int bs)
		{
		    String s="";
		    while(dec>0)
		    {
		        s=s+check(dec%bs);
		        dec=dec/bs;
		    }
		    StringBuilder sb=new StringBuilder();
		    sb.append(s);
		    return new String(sb.reverse());		}
	
		public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		try{
		    int d=sc.nextInt();
		    int b=sc.nextInt();
		    if(b<=0 || b>=9)
		    System.out.println(-1);
		    Decimal_AnyBase m=new Decimal_AnyBase();
		    System.out.println(m.toBase(d,b));
		}
		catch(Exception e){
		    System.out.println();
		}
	}
} 
