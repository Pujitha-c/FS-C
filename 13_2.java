/*Java Program to Delete the Specified Integer from an Array

Sample input & Output:
 
Enter no. of elements you want in array:5
Enter all the elements:
3
5
8
1
4
Enter the element you want to delete:5
After Deleting:3,8,1,4

*/
import java.util.*;
public class Delete
{
    public static void main(String[] arfs)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n=sc.nextInt();
        List<Integer>l=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            int j=sc.nextInt();
            l.add(j);
        }
        System.out.print("Enter the element you want to delete:");
        int r=sc.nextInt();
        l.remove(new Integer(r));
        String op=l.toString().replaceAll("(^\\[|\\]$)","");
        System.out.print("After Deleting:"+op);
    }
}
