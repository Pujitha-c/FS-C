you are given n pairs of strings. Two pairs (a,b) and (c,d) are identical if a=c and b=d . That also implies (a,b) is not same as (b,a). After taking each pair as input, you need to print number of unique pairs you currently have.Show Hint

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test {
    public static void main(String[] args) {
    //create scanner object
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    //Scan left pair
    String left[]=new String[n];
    String right[]=new String[n];
    for(int i=0;i<n;i++)
    {
        left[i]=sc.next();
        right[i]=sc.nextLine();
    }
    //Scan right pair
        
       //create hash set
       HashSet<String>hs=new HashSet();
       //logic 
       for(int i=0;i<n;i++)
       {
           hs.add(left[i]+" "+right[i]);
           System.out.println(hs.size());
       }
        
    }
}
