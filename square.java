public class Solution 
{
	public static void main(String[] ats) 
	{
		int n1,n2,i;
		boolean flag1,flag2,flag3;
		for(int n=1000;n<=9999;n++) 
		{
			n1=n%100;
			n2=n/100;
			flag1=false;
			i=(int)Math.sqrt(n2);
			if(n2==i*i) 
			{
				flag1=true;
			}
			flag2=false;
			i=(int)Math.sqrt(n1);
			if(n1==i*i)
			{
				flag2=true;
			}
			flag3=false;
			i=(int)Math.sqrt(n);
			if(n==i*i ) 
			{
				flag3=true;
			}
			if(flag1 && flag2 && flag3) {
				System.out.print(n+" ");
			}
		}
	}
}
