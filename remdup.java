import java.util.ArrayList;
import java.util.Scanner; 
public class Task3
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
// Delcare Arraylist
    ArrayList<Integer>al=new ArrayList<>();
//add elements to arraylist
   for(int i=0;i<n;i++)
   {
       int j=sc.nextInt();
       al.add(j);
   }
   
//print arraylist before removal
System.out.println("arraylist before removal");
   System.out.println(al);
 //write logic for removing duplicate numbers using for loop
 for(int i=0;i<al.size();i++)
 {
     for(int j=i+1;j<al.size();j++)
     {
         if(al.get(i)==al.get(j))
         {
             al.remove(j);
         }
     }
 }
 //print the arrayList after removal
 System.out.println("arrayList after removal");
 System.out.println(al);
 
 }
}
