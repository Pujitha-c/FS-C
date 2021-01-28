/*Write a Java program to print following pattern

input=5
output=
10101
01010
10101
01010
10101

*/
import java.util.Scanner;
public class Task3
{
    public static void main(String[] arfs)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int a;
            if(i%2==0)
            {
                a=0;
                for(int j=1;j<=n;j++)
                {
                    System.out.print(a);
                    a=(a==0)?1:0;
                }
            }
            else
            {
                a=1;
                for(int j=1;j<=n;j++){
                    System.out.print(a);
                    a=(a==1)?0:1;
                }
            }
            System.out.println();
        }
        
    }
}
