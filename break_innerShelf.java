/*
Aadhya is rearranging her library. She takes the innermost shelf and reverses
the order of books. She breaks the walls of the shelf. In the end, 
there will be only books and no shelf walls. Print the order of books.

Opening and closing walls of shelves are shown by '/' and '\' 
respectively whereas books are represented by lower case alphabets.

Input format
The first line contains string  displaying her library.

Output format
Print only one string displaying Aadhya's library after rearrangement.

Note

The first character of the string is '/' and the 
last character of the string is '\' indicating outermost walls of the shelf. 

Sample Input
/u/love\i\

Sample Output
iloveu

Explanation
/u/love\i\
Here Aadhya breaks the inner most shelf and reverse the order. 
So the library will be  /uevoli\ . 

Now she breaks the outermost wall and reverses the order.
So the library will be iloveu.

*/
import java.util.*;
class Test {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(reverseString(str));
    }
    static String reverseString(String s)
    {
        while(s.charAt(0) == '/')
        {
            int t1=0,t2=0;
            for(int i=s.length()-1;i>=0;i--)
            {
                if(s.charAt(i) == '\\')
                    t2=i;
                if(s.charAt(i) == '/')
                {
                    t1=i;
                    break;
                }
            }
            s=s.substring(0,t1)+reverse(s.substring(t1+1,t2))+s.substring(t2+1);
        }
                    return s;
    }
	static String reverse(String s)
	{
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}
}
