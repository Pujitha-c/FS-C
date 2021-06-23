/*Write a java program that returns the angle in degrees between the hours 
and minutes handsin a clock for any given time

Samples:

case=1
input=12:00                                                                                                                   
output=0                                                                                                                       

case=2
input=5:30                                                                                                                    
output=
15                                                                                                                      

case=3
input=11:25                                                                                                                   
output=
168                                                                                                                     

case=4
input=10:60                                                                                                                   
output=
30                                                                                                                      
 
case=5
input=13:20                                                                                                                   
output=
80                                                                                                                      

case=6
input=14:95                                                                                                                   
output=
-1                                                                                                                      
   
*/
import java.util.*;
public class Test
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Test m=new Test();
		String str=sc.nextLine();
		String[] shm=str.split(":");
		int hr=Integer.parseInt(shm[0]);
		int min=Integer.parseInt(shm[1]);
		angle(hr,min);
	}
	public static void angle(int h,int m)
	{
	    if(h<0 ||m<0||h>24||m>60)
	        System.out.println("-1");
	    int hr=(h*360)/12+(m*360)/(12*60);
	    int min=(m*360)/60;
	    int diff=Math.abs(hr-min);
	    if(diff>180)
	    {
	        diff=360-diff;
	    }
	    System.out.println(diff);
	}
}

