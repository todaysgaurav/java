/*
Print the sum of the reciprocals of the first 100 natural numbers.
*/ 
import java.io.*;
import java.net.*;
import java.util.*;
import java.lang.Math.*;
public class Example4
{
 public static void main(String args[])
  {
   int n=5,i,j;
   double sum=0;
   for(i=1;i<=100;i++)
    sum=sum+(double)1/i;
   System.out.println("Sum of reciprocal of first 100 natural numbers is :"+sum); 
  }
}
