/* Write a Java program to determine whether an input number is an
even number.
*/
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Check
{
 public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
   int num;
   System.out.println("Enter any number");
   num=in.nextInt();
   if(num%2==0)
    System.out.println("Number is even");
   else
   System.out.println("Number is odd");
  }
}
