/*Write a program to print the following pattern

Example:
input=4
output=
12344321
123**321
12****21
1******1

*/
import java.util.*;
public class Test
{
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
    for (int i=n;i>=1;i--) {
      for (int j=1;j<=n;j++) {
        if (j>i) {
          System.out.print("*");
        } else {
          System.out.print(j);
        }
      }
      for (int j=n;j>=1;j--) {
        if (j>i) {
          System.out.print("*");
        } else {
          System.out.print(j);
        }
      }
      System.out.println();
    }
  }
}

/*test cases:
case=1
input=4
output=
12344321
123**321
12****21
1******1

case=2
input=
2
output=
1221
1**1

case=3
input=6
output=
123456654321
12345**54321
1234****4321
123******321
12********21
1**********1
*/
