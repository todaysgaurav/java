/* 
*****
 ****
  ***
   **
    *
*/
import java.io.*;
import java.net.*;
import java.util.*;
import java.lang.Math.*;
public class Example9
{
 public static void main(String args[])
  {
   int i,j;
   for(i=5;i>=1;i--)
    {
     for(j=i;j<5;j++)
      System.out.print(" ");
     for(j=1;j<=i;j++)
      System.out.print("*");
    System.out.print("\n");
    }    
  }
}

