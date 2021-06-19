import java.util.*;
public class Main {
    public List<List<Integer>> palindromePairs(String[] words) {
     List<List<Integer>> res=new ArrayList<>();
     if(words==null || words.length<1) return res;
     int len=words.length;
     for(int i=0;i<len-1;i++){
         for(int j=i+1;j<len;j++){
             String t=words[i]+words[j];
             if(palindrome(t))
                 res.add(new ArrayList(Arrays.asList(i,j)));
                 
             t=words[j]+words[i];
             if(palindrome(t))
                 res.add(new ArrayList(Arrays.asList(j,i)));
             
         }
     }
     return res;
    }
    
    boolean palindrome(String s){
        int len=s.length();
        for(int i=0,j=len-1;i<j;i++,j--)
            if(s.charAt(i)!=s.charAt(j))
                return false;
        return true;    
        
    }
    public static void main(String[] arfs){
        Scanner sc=new Scanner(System.in);
        Main tt=new Main();
        int n=sc.nextInt();
        String[] a=new String[n];
        for(int i=0;i<a.length;i++)
            a[i]=sc.next();
            
        System.out.println(tt.palindromePairs(a));
    }
}
