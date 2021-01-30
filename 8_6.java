/* Write a java program that takes three integers a, b, c and returns 
the number of integers which are of equal value.

Examples
3, 4, 3 -----> 2

1, 1, 1 -----> 3

3, 4, 1 -----> 0

Notes
Your function must return 0, 2 or 3.

Sample:
case=1
input=3
5
3
output=2
*/
import java.util.Scanner;
public class Program2
{
    public static void main(String[] arfs)
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int count=0;
        if(n1==n2 && n2==n3 && n3==n1)
        count=3;
        else if(n1==n2 || n1==n3 || n2==n3)
        count+=2;
        System.out.println(count);
        
    }
}
