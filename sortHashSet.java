 /*Riya is a bibliophile and wants you to develop a program which takes in 5 words from a dictionary as dynamic user input and stores them in a Hashset. It should then print them in lexicographical order.
 */

import java.util.*;
public class Lexicography {
    public static void main(String args[]) {
       //Declare hashset
       HashSet<String>set=new HashSet();
     //delcare line
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 strings: ");
        //add lines using for loop to hashset
        for(int i=0;i<5;i++)
        {
          String str=sc.nextLine();  
          set.add(str);
        }
        System.out.println("Original HashSet: " + set);
       //create arraylist
       ArrayList<String>al=new ArrayList(set);
       Collections.sort(al);
       
    //sort the list
        System.out.println("HashSet elements " + "in sorted order " +al );
    }
} 
