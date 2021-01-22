binary to decimal
import java.util.*;
public class Main
{
	  public static int btod(int bnum){
	      int dec=0;
	      int n=0;
	      
	      while(true){
	          if(bnum==0)
	          break;
	          else{
	              int r=bnum%10;
	              dec+=r*Math.pow(2,n);
	              bnum=bnum/10;
	              n++;
	          }
	      }
	      return dec;
	  }     

	      
	      public static void main(String[] arfs){
	          Scanner sc=new Scanner(System.in);
	          int x=sc.nextInt();
	          System.out.println(btod(x));
	          
	       /*   String bnum=sc.next();
	          int dec=Integer.parseInt(bnum,2);
	          System.out.println(dec);*/
}	
}	
