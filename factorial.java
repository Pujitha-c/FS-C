import java.util.*;
class  FactorialItr
{
	static long fact(int n)
	{
		//declare a long variable f
		long f=1;
		for(int i=1;i<=n;i++)
		{
			//write the logic
			if(n==0)
			return 1;
			else
			f=n*(fact(n-1));
			
		}
		return f;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		//declare a variable n and read value into it
		int n=s.nextInt();
		//call the function fact and store the value in f
		long f=fact(n);
		System.out.println("Factorial of  "+n+" is "+f);
	}
}
