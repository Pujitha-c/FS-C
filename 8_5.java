/* 
You hired three programmers and you (hopefully) pay them. 
Write a java programe that takes three numbers (the hourly wages of each programmer) and 
returns the difference between the highest-paid programmer and the lowest-paid.

Examples
input                    output
147, 33, 526 ------------> 493

33, 72, 74 ------------> 41

1, 5, 9 ------------> 8
Notes
Don't forget to print the result.

sample:
input=72
75
33
output=42

*/
import java.util.Scanner;
public class Program1
{
    public static void main(String[] arfs)
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int max=n1;
        int min=n1;
        if(n3>=n1 && n3>=n2)
        max=n3;
        else if(n2>=n3 && n2>=n1)
        max=n2;
        if(n2<=n3 && n2<=n1)
        min=n2;
        else if(n3<=n1 && n3<=n2)
        min=n3;
        System.out.println(max-min);
    }
}
