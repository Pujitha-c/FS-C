/*Write a Java program to print following pattern

input=5
output=
55555
54444
54333
54322
54321

*/
import java.util.Scanner;
public class Task2
{
    public static void main(String[] ags)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=n;j>0;j--)
            {
                if(j>i)
                System.out.print(j);
                else
                System.out.print(i);
            }
            System.out.println();
        }
    }
} 
