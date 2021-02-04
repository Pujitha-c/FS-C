// Q3) Java Program to Insert an Element in a Specified Position in a Given Array


/* Sample Input & Output:
Enter no. of elements you want in array:6
Enter all the elements:                                                          this one works not the second one
2
4
6
9
4
5
Enter the position where you want to insert element:3
Enter the element you want to insert:7
After inserting:2,4,7,6,9,4,5
*/
import java.util.*;
public class Insert_Array   
{
    public static void main(String[] arhs)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n=sc.nextInt();
        int a[]=new int[n+1];
        System.out.println("Enter all the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the position where you want to insert element:");
        int pos=sc.nextInt();
        System.out.print("Enter the element you want to insert:");
        int ele=sc.nextInt();
        for(int i=n-1;i>=pos-1;i--)
        {
            a[i+1]=a[i];
        }
        a[pos-1]=ele;
        System.out.print("After inserting:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]);
            if(i<=n-1)
            System.out.print(",");
        }
        System.out.print(a[n]);
    }
}

// Q3) Java Program to Insert an Element in a Specified Position in a Given Array


/* Sample Input & Output:
Enter no. of elements you want in array:6
Enter all the elements:
2
4
6
9
4
5
Enter the position where you want to insert element:3
Enter the element you want to insert:7
After inserting:2,4,7,6,9,4,5
*/
import java.util.*;
public class Insert_Array
{
    public static void main(String[] arhs)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[30];
        System.out.print("Enter no. of elements you want in array:");
        int n=sc.nextInt();
        System.out.println("Enter all the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the position where you want to insert element:");
        int pos=sc.nextInt();
        System.out.print("Enter the element you want to insert:");
        int ele=sc.nextInt();
        for(int i=n;i>pos;i--)
        {
            a[i]=a[i-1];
        }
        a[pos]=ele;
        System.out.print("After inserting:");
        for(int i=0;i<n+1;i++)
        {
            System.out.print(a[i]);
            if(i<=n-1)
            System.out.print(",");
        }
    }
}
