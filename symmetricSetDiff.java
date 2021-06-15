
/* Write a Java program to find the symmetric difference between two sets

Symmetric Difference = (A u B) - (A n B)
i.e resultant set should not contain common elements of both the sets

Sample:
input = 
5       \\set 1 size
ram
rahim
ajay
rishav
aakash
5       \\set 2 size
aakash
ajay
shyam
ram
ravi

output =
[rahim, ravi,  rishav, shyam]

*/
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<String> set1=new HashSet<>();
        Set<String> set2=new HashSet<>();
        for(int i=0;i<n;i++){
            set1.add(sc.next());
        }
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            set2.add(sc.next());
        }

        symmetricSetDifference(set1, set2);
    }

    public static void symmetricSetDifference(Set<String>set1, Set<String>set2){
        SortedSet<String> newSet = new TreeSet<String>(set1);
        newSet.removeAll(set2);
        set2.removeAll(set1);
        newSet.addAll(set2);
        System.out.println(newSet);
    }
}    
