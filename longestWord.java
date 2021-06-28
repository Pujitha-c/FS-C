/*

Have the function LongestWord(sen) take the sen parameter being passed and 
return the longest word in the string. If there are two or more words that 
are the same length, return the first word from the string with that length. 
Ignore punctuation and assume sen will not be empty. 
Words may also contain numbers, for example "Hello world123 567"

Examples
Input: "fun&!! time"
Output: time
Input: "I love dogs"
Output: love

*/
import java.util.*; 
import java.io.*;

class Main {

  public static String LongestWord(String sen) {
    // code goes here  
    int count=0;
    int maxlen=Integer.MIN_VALUE;
    String longest="";
    String temp="";
    for(int i=0;i<sen.length();i++)
    {
        char c=sen.charAt(i);
        if((c>=65 && c<=90) || (c>=97 && c<=122))
        {
            count++;
            temp=temp+c;
        }
        else
        {
            if(count>maxlen)
            {
                maxlen=count;
                longest=temp;
            }
            temp="";
            count=0;
        }
    }
    if(count>maxlen)
            {
                maxlen=count;
                longest=temp;
            }
    return longest;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }

}
