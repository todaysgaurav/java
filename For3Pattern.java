/*
1******
12*****
123****
1234***
12345**
123456*
1234567
*/
import java.io.*;
import java.net.*;
import java.util.*;
public class For3Pattern
{
 public static void main(String args[])
  {
   int i,j,k;
   for(i=1;i<=7;i++)
    {
     for(j=1;j<=i;j++)
      {
       System.out.print(j);
      }
      for(k=i;k<7;k++)
       {
        System.out.print("*");
       }
      System.out.print("\n");
    }
  }
}
