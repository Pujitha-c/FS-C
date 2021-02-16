/*Write a java program to find and print number of words in a line
    and also print the words along with its length
    
   Sample input:
   Enter any String:                                                                                                       
    Welcome to kmit                                                                                                         
    3 words.                                                                                                                

    
*/
import java.util.Scanner;
public class WordCount
{
    public static void main(String[] arfs)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String:");
        String s=sc.nextLine();
        String[] w=s.split(" ");
        System.out.println(w.length+ " words.");
    }
}
