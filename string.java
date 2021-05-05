/* Petya started to attend programming lessons. On the first lesson his 
task was to write a simple program. The program was supposed to do the following: 
the given string, consisting if uppercase and lowercase Latin letters, it:


    deletes all the vowels,
    inserts a character "." before each consonant,
    replaces all uppercase consonants with corresponding lowercase ones. 

Vowels are letters "A", "O", "E", "U", "I", and the rest are consonants. The program's input is exactly one string, it should return the output as a single string, resulting after the program's processing the initial string.

Help Petya cope with this easy task.

Sample :
tour //input
.t.r //output

Sample 2:
aBAcAba //input
.b.c.b //output


*/
import java.util.*;
public class Test
{
    public static void main(String[] ars)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        String str=s.replaceAll("[aeiou]","");
        char[] c=str.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<c.length;i++)
        {
            sb.append(".");
            sb.append(c[i]);
        }
        System.out.print(sb);
    }
}
