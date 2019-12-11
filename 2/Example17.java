/*
1
2 3
3 4 5
4 5 6 7 
5 6 7 8 9
*/
import java.io.*;
import java.net.*;
import java.util.*;
import java.lang.Math.*;
public class Example17
{
 public static void main(String args[])
  {
   int i,j;
    for(i=1;i<=5;i++)
    {
     for(j=i;j<(2*i);j++)
      System.out.print(j+" ");
     System.out.print("\n");
    }
  }
}

