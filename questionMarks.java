/*
Have the function QuestionsMarks(str) take the str string parameter, which will 
contain single digit numbers, letters, and question marks, and check if there are 
exactly 3 question marks between every pair of two numbers that add up to 10. 
If so, then your program should return the string true, otherwise it should return
the string false. If there aren't any two numbers that add up to 10 in the string, 
then your program should return false as well.

For example: if str is "arrb6???4xxbl5???eee5" 
then your program should return true because there are exactly 
3 question marks between 6 and 4, and 3 question marks 
between 5 and 5 at the end of the string.

Examples
Input: "aa6?9"
Output: false
Input: "acc?7??sss?3rr1??????5"
Output: true

*/
import java.util.*; 
import java.io.*;

class Main {

  public static String QuestionsMarks(String str) {
    // code goes here  
    int cur=0;
    int next=0;
    int count=0; 
    boolean equalsTen=false;
    String qMarks="true";
    for (int i=0;i<str.length();i++)
    {
        if (Character.isDigit(str.charAt(i)))
        {
            cur=Character.getNumericValue(str.charAt(i));
            for (int j=i+1;j<str.length();j++)
            {
                if (str.charAt(j)=='?')
                    count++;
                else if (Character.isDigit(str.charAt(j)))
                {
                    next=Character.getNumericValue(str.charAt(j));
                    if (cur+next==10)
                    {
                        equalsTen=true;
                        if (count!=3)
                            qMarks="false";
                    }
                i=j+1;
                count=0;
                }
            }
        }
    }
    if (equalsTen==false)
        qMarks="false";
    return qMarks;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(QuestionsMarks(s.nextLine())); 
  }

}
