/* Write a Java program by using two for loops to
produce the output shown below:
*******
******
*****
****
***
**
*
*/
import java.io.*;
import java.net.*;
import java.util.*;
public class PattenFor
{
 public static void main(String args[])
  {
   int i,j;
   for(i=0;i<=8;i++)
    {
      for(j=i;j<=8;j++)
       {
         System.out.print("*");
       }
     System.out.print("\n");
    }
  }
}
