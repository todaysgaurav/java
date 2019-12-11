/* Read a sequence of characters from the terminal until q is read. Output
the largest character read, not
including the q
*/
import java.io.*;
import java.net.*;
import java.util.*;
public class Example1
 {
  public static void main(String args[])
   {
     char a='A';
     char max='A';
     Scanner in=new Scanner(System.in); 
     while(a!='q')
      {
       System.out.println("Enter a character");
         a=in.next().charAt(0);
         if(a!='q')
         if(a>max)
          max=a;
      }
     System.out.println("maximum value is :"+max);
   }
 }

