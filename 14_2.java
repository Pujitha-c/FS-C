/* Write a Java program to find the second most frequent character in a given string.

Sample Input n Output:
Enter the String:                                                                                                       
success                                                                                                                 
The given string is: success                                                                                            
The second most frequent char in the string is: c                                                                       
                                                                                                                        
                                                                                                                        
                                          
*/
import java.util.Scanner;
public class SecondLargest
{
    public static void main(String[] arfs)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.next();
        System.out.println("The given string is: "+s);
        int c[]=new int[256];
        int f=0,sd=0;
        for(int i=0;i<s.length();i++)
        {
            (c[s.charAt(i)])++;
        }
        for(int i=0;i<256;i++)
        {
            if(c[i]>c[f])
            {
                sd=f;
                f=i;
            }
            else if(c[i]>c[sd] && c[i]!=c[f])
            sd=i;
        }
        System.out.print("The second most frequent char in the string is: "+(char)sd);
    }
}
