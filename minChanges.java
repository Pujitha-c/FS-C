/*
You are given a string  'S' of 'N' characters comprising of A's and B's . 
You can choose any index i and change Si  to either A  or B .

Find the minimum number of changes that you must make to string S such that the
resulting string is of the following format:

AAAA... BBBB...

In other words, your task is to determine the minimum number of changes 
such that string S  has  x number of A's in the beginning, followed by the 
remaining(n-x)  number of B's.

input
3
AAB
output
0
input
5
AABAA
output
1
input
1
B
output
0
input
4
BABA
output
2

Explanation
For the string AAB we don't need to make any changes.

For the string AABAA  we can change B to  A and get the string in the required form.

For the string B we don't need to make any changes.

For the string BABA we need to make atleast 2 changes to get the string in 
required form. One possible way is AABB


*/
import java.util.*;
public class Test
{
    public static void main(String[] arfs)
    {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String s=sc.nextLine();
        int res=minChanges(s,s.length());
        System.out.println(res);
    }
    static int minChanges(String s,int n){
        int count=0,x=0,y=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='a'){
                x++;
            if(y!=0 && x>y){
                count+=y;
                x+=y;
                y=0;
            } 
            }else {
                if(y==0){
                    x=0;
                    y++;
                }
                else
                y++;
            }
        }
        if(x!=0 && y!=0){
            count=(x>y)?count+y:count+x;
        }
        return count;
    }
}
