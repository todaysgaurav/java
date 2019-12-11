/*
1
12
123
1234
12345
*/
import java.io.*;
import java.net.*;
import java.util.*;
import java.lang.Math.*;
public class Example5
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
  }
}
