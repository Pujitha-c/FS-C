/*Write a java program to divide string into n equal parts

Sample Input n Output:
Enter any string:                                                                                                       
Good Morning   
3
3 equal parts of given string are                                                                                       
Good                                                                                                                    
 Mor                                                                                                                    
ning                                                                                                                    

Enter any string:                                                                                                       
Hello Students       
3
Sorry this string cannot be divided into 3 equal parts.
*/
import java.util.Scanner;
public class DevideString
{
    public static void main(String[] arfs) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string:");
        String s=sc.nextLine();
        int n=sc.nextInt();
        int len=s.length();
        int c=len/n,temp=0;
        String[] str=new String[n];
        
        if(len%n==0)
        {
            for(int i=0;i<len;i=i+c)
            {
                String ss=s.substring(i,i+c);
                str[temp]=ss;
                temp++;
            }
            System.out.println(n+" equal parts of given string are");
            for(int i=0;i<str.length;i++)
            {
                System.out.println(str[i]);
            }
        }
        else
        System.out.println("Sorry this string cannot be divided into" +n+ "equal parts.");
        
    }
}



