/* Write a java program for the following scenario
 find the longest common prefix string amongst group of strings.

If there is no common prefix, return -1.

 

Example 1:
Input: 3   // no of strings
"flower","flow","flight"    // strings do not use ""  or , while reading
Output: "fl"


Example 2:

Input: 3   // number of strings
"dog","racecar","car"      // strings do not use ""  or , while reading 
Output: -1
Explanation: There is no common prefix among the input strings.
 

Note;
strings consists of only lower-case English letters.

*/
import java.util.*;
public class Test
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }
        int len=s.length;
        if(len==0)
        System.out.println(-1);
        Arrays.sort(s);
        int m=Math.min(s[0].length(),s[len-1].length());
        int i=0;
        while(i<m && s[0].charAt(i)==s[len-1].charAt(i))
        i++;
        String res=s[0].substring(0,i);
        if(res.length()>0)
        System.out.println(res);
        else
        System.out.println(-1);
        
    }
}
