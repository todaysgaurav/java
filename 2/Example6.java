/*
1
12
123
1234
12345
1234
123
12
1
*/
import java.io.*;
import java.net.*;
import java.util.*;
import java.lang.Math.*;
public class Example6
{
 public static void main(String args[])
  {
   int i,j;
   for(i=1;i<=5;i++)
    {
     for(j=1;j<=i;j++)
      System.out.print(j);
     System.out.print("\n");
    }
   for(i=4;i>=1;i--)
    {
     for(j=1;j<=i;j++)
       System.out.print(j);
     System.out.print("\n");
    }
  }
}
  
