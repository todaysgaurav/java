/*  Write a Java program that allows the user to
choose the correct answer of a question.
See the example below:
What is the correct way to declare a variable to store an integer value in Java?
a. int 1x=10;
b. int x=10;
c. float x=10.0f;
d. string x="10";
Enter your choice: c
Invalid choice
*/
import java.io.*;
import java.net.*;
import java.util.*;
public class CorrectChoice
{
 public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
   System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
     System.out.println("a. int 1x=10");
      System.out.println("b. int x=10");
    System.out.println("c. float x=10.0f");
System.out.println("d. string x=\"10\"");
   char ans=in.next().charAt(0);
   char correct='b';
   if(ans==correct)
    System.out.println("Congratulations");
   while(ans!=correct)
    {
      if(ans==correct)
       System.out.println("Congratulations");
     else
      {
        System.out.println("Try again");
        ans=in.next().charAt(0);
       }				
    }
  }
}
