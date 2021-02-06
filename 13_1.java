/*Write a Java program to check whether a number is a Duck Number or not.

A Duck number is a number which has zeroes present in it, 
but there should be no zero present in the beginning of the number.

Sample
input=3210
output=true

input=0234
output=false

input=1234
output=false

*/
import java.util.Scanner;
public class DuckNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=false;
        while(n>0)
        {
            int r=n%10;
            if(r==0){
                flag=true;
            }
            n=n/10;
        }
        if(flag)
        System.out.println("true");
        else
        System.out.println("false");
    }
}
