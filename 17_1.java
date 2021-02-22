/*Given a String, the task is to insert another string in between the given String 
at a particular specified index.

Input=	
Original string = Computer Engineering                                                                                  
String to be inserted = Science                                                                                         
Index = 8                                                                                                               

Output= 
ComputerScience Engineer

*/
import java.util.*;
public class Insertion
{
    public static void main(String[] arfs)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Original string =");
        String s=sc.nextLine();
        System.out.print("String to be inserted =");
        String is=sc.nextLine();
        System.out.print("Index = ");
        int n=sc.nextInt();
        StringBuffer sb=new StringBuffer(s);
        sb.insert(n,is);
        System.out.println(sb);
        
    }
}
