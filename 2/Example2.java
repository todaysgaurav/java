/* Write a program that displays
the following pattern
*/
import java.io.*;
import java.net.*;
import java.util.*;
public class Example2
{
 public static void main(String args[])
  {
    int i,j;
    for(i=1;i<=8;i++)
     {
       for(j=i;j<=(i*5);j=j+i)
        {
         System.out.print(j+" ");
        }
       System.out.print("\n");
     }
  }
}
