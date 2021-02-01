/*Write a Java program to print following pattern

input=5
output= 
    1                                                                                                                   
   123                                                                                                                  
  12345                                                                                                                 
 1234567                                                                                                                
123456789    
*/   
import java.util.Scanner;
public class Task5
{
    public static void main(String[] arfs)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int s=1;s<=n-i;s++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
