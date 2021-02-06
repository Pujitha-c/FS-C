/* Print the following pattern.
1 2 3 4 5 6 7 8 9
2 3 4 5 6 7 8 9 1
3 4 5 6 7 8 9 1 2
4 5 6 7 8 9 1 2 3
5 6 7 8 9 1 2 3 4
6 7 8 9 1 2 3 4 5
7 8 9 1 2 3 4 5 6
8 9 1 2 3 4 5 6 7
9 1 2 3 4 5 6 7 8
*/
import java.util.Scanner;
public class Pattern20
{
    public static void main(String[] arfs)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            for(int j=1;j<=i+1;j++)
            {
                if(j<i)
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
}
