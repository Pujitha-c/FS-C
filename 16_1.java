/*Write a java program to reverse each word in a sentence using  reverse method in StringBuilder class.

Sample I/O:
Enter any String:                                                                                                       
Kindly concentrate on ur Studies                                                                                        
yldniK etartnecnoc no ru seidutS                                                                                        
                          
*/
import java.util.*;
public class TestReverse
{
    public static void main(String[] ars)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String:");
        String s=sc.nextLine();
        String[] words=s.split(" ");
        String rev="";
        for(String w:words)
        {
        StringBuilder sb=new StringBuilder(w);
        sb.reverse();
        rev=rev+sb+" ";
        }
        System.out.println(rev);
    }
}
