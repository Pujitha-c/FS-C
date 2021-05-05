/*Write a Java program to find greatest element in each individual rows of an array
and print matrix along with its greatest element

sample
input =
2      (//enter order of an array)                                                                                                                 
2                                                                                                                       
1       (//enter array elements)                                                                                                                
2                                                                                                                       
3                                                                                                                       
4      
output =
1 2 = 2                                                                                                                 
3 4 = 4                                                                                                                 

*/
import java.util.*;
public class Test
{
    public static void display(int mat[][],int r,int c,int res[])
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.print("= "+res[i]);
            System.out.println();
        }
        
    }
    public static void maxMat(int m[][],int r,int c)
    {
        int i=0;
        int max=0;
        int maxRowVal[]=new int[r];
        while(i<r)
        {
            for(int j=0;j<c;j++)
            {
                if(m[i][j]>max){
                    max=m[i][j];
                }
            }
            maxRowVal[i]=max;
            i++;
            max=0;
        }
        display(m,r,c,maxRowVal);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int m[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
             m[i][j]=sc.nextInt();   
            }
        }
        maxMat(m,r,c);
    }
}
