/*
Ramesh’s house is located at a junction from which the places of his four friends 
are located at two coordinate points each. 
He must be at either one of their houses at the same time. 
Help him choose which house to go to by finding out the one 
with the nearest distance from his place. The coordinates of their 
houses are as follows: 
                Name	              Coordinates
              Ramesh	                  (3,2)
              Friend A	                  (2,3)
              Friend B	                  (0,0) 
              Friend C	                  (5,8)
              Friend D	                  (1,4)
*/
import java.util.*;
class Test {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ramesh's location:");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int[] x2=new int[4];
        int[] y2=new int[4];
        ArrayList<Double>al=new ArrayList();
        double dis;
        System.out.println("Enter locations of 4 other friends:");
        for(int i=0;i<4;i++)
        {
            x2[i]=sc.nextInt();
            y2[i]=sc.nextInt();
            dis=Math.sqrt((x2[i]-x1)*(x2[i]-x1)+ (y2[i]-y1)*(y2[i]-y1));
            al.add(dis);
        }
       // System.out.println(al);
        //Collections.sort(al);
        System.out.println(al);
        Double min=Collections.min(al);
        System.out.println(min);
        
        
       
       
    }
}
