/* Write a program that given r, a, and n, displays the first � terms of the
       corresponding geometric progression. */
import java.io.*;
import java.net.*;
import java.util.*;
import java.lang.Math.*;
public class Example3
{
 public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int a,n,i;
    float r;
    System.out.println("Enter value of a");
    a=in.nextInt();
    System.out.println("Enter value of n");
    n=in.nextInt();
    System.out.println("Enter value of r");
    r=in.nextFloat();
    for(i=0;i<n;i++)
     {
       System.out.println((i+1)+"th term"+(a*Math.pow(r,i)));
     }
    
  }
}       

