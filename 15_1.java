/*Java program to find the number of charters in the longest word in the sentence. 

Sample I/O:

Enter any String:                                                                                                       
I am an intern at MicrosoftSolutions                                                                                    
18                                                                                                                      
                                                                                                                        
                                                                                                                        
               

*/
import java.util.*; 
public class LongestWordLength
{
    public static void main(String[] ars)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String:");
        String s=sc.nextLine();
        String[] str=s.split(" ");
        int len=0;
        for(String word:str)
        {
            if(len<word.length())
            len=word.length();
        }
        System.out.println(len);
    }
}
