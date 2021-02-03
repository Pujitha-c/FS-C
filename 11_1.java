/*
Write the java program to print the following pattern

input=8
output=
8 7 6 5 4 3 2 1
8 7 6 5 4 3 2
8 7 6 5 4 3
8 7 6 5 4
8 7 6 5
8 7 6
8 7
8
*/
import java.util.Scanner;
public class Task25
{
    public static void main(String[] ars){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int j=n;j>=i;j--)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
}
