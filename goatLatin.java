/*

A sentence sentence is given, composed of words separated by spaces. 
Each word consists of lowercase and uppercase letters only.

We would like to convert the sentence 
to "Goat Latin" (a made-up language similar to Pig Latin.)

The rules of Goat Latin are as follows:

If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
For example, the word 'apple' becomes 'applema'.
 
If a word begins with a consonant (i.e. not a vowel), 
remove the first letter and append it to the end, then add "ma".
For example, the word "goat" becomes "oatgma".
 
Add one letter 'a' to the end of each word per its word index in the sentence, 
starting with 1.

For example, 
the first word gets "a" added to the end, 
the second word gets "aa" added to the end and so on.
Return the final sentence representing the conversion from sentence to Goat Latin. 

 

Example 1:

Input: "I speak Goat Latin"
Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"

Example 2:
Input: "The quick brown fox jumped over the lazy dog"
Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"

*/
import java.util.*;
class Test {
    public String GoatLatin(String str) {
        String[] words=str.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<words.length;i++){
            res.append(convert(words[i]));
            for(int j=0;j<i+1;j++)
                res.append("a");
            if(i!=words.length-1)
                res.append(" ");
        }
        return res.toString();
    }
    public String convert(String word) {
        if(isVowel(word.charAt(0))) {
            return word + "ma";
        } else {
            return word.substring(1)+word.charAt(0)+"ma";
        }
    }
    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    public static void main(String[] afs)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Test m=new Test();
        System.out.println(m.GoatLatin(s));
    }
}
