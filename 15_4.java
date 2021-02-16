/*Remove all digits & SP characters  
Write a java program to remove all the digits and special characters from the
   input string and display the output in the specified format
   sample
   input = &*re(9m)o^v6e
   output = remove
            total number of digits removed = 2
            total number of special characters removed = 5
*/
import java.util.Scanner;
public class Remove
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sp=0,num=0;
        String s=sc.nextLine();
        s=s.replaceAll("\\W+","");
        s=s.replaceAll("\\d","");
        System.out.println(s);
        int c1=s.length()-s.replaceAll("\\W+","").length();
        int c2=s.length()-s.replaceAll("\\d","").length();
     /*   for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c>='0' && c<='9')
            num++;
            else if(c=='^'||c=='&'|| c=='*'||c=='('||c==')')
            sp++;
        }*/
        System.out.println("total number of digits removed = "+c1);
        System.out.print("total number of special characters removed = "+c2);
    }
}
   

