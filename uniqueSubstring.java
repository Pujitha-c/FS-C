/*
Given a string str. Calculate the total number of unique substrings of the given string.

Example 1:

Input:
abd

Ouput:
6

Explanation:
str = abd. The 6 unique substrings 
are {a, b, d, ab, bd, abd}.
Example 2:

Input:
jaja

Ouput:
7

Explanation:
str = jaja. The substrings will be j, a, j, a, 
ja, aj, ja, jaj, aja, jaja. Out of these the 
unique are j, a, ja, aj, jaj, aja, jaja.
*/
import java.util.*;
class Test
{
    public static int uniqueStr(String s)
    {
        Set<String>set=new HashSet<>();
        for(int i=0;i<=s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                set.add(s.substring(i,j));
            }
        }
        return set.size();
    }
    public static void main(String[] arfs)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(uniqueStr(str));
    }
}
