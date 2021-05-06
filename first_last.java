/*Sample Input :
4
word
localization
internationalization
pneumonoultramicroscopicsilicovolcanoconiosis

Sample Output :
word
l10n
i18n
p43s
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a[]=new String[n+1];
		for(int i=0;i<a.length;i++)
		{
		    a[i]=sc.nextLine();
		    
		}
		for(String s:a)
		{
		    if(s.length()>10)
		    
		    {
		        int len=s.length();
		        char f=s.charAt(0);
		        char l=s.charAt(len-1);
		        int count=0;
		        for(int i=0;i<s.length();i++)
		        {
		             count++;
		        }
		        System.out.print(f);
		        System.out.print(count-2);
		        System.out.println(l);
		        }
		        else{
		            System.out.println(s);
		        }
		}
		
		
	}
}
