/*Write a Java program to detect key presses.
If the user pressed number keys( from 0 to 9), the program will tell the number
*/
import java.io.*;
import java.net.*;
import java.util.*;
public class KeyPress
{
 public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
   int num;
   System.out.println("Press any key");
   try
   {
   num=in.nextInt();
   }
   catch(InputMismatchException e)
   {
   	num=0;
   }
   switch(num)
    {
     case 1:
          System.out.println("You have pressed"+num);
          break;
     case 2:
          System.out.println("You have pressed"+num);
          break;
     case 3:
          System.out.println("You have pressed"+num);
          break;
     case 4:
          System.out.println("You have pressed"+num);
          break;
     case 5:
          System.out.println("You have pressed"+num);
          break;
     case 6:
          System.out.println("You have pressed"+num);
          break;
     case 7:
          System.out.println("You have pressed"+num);
          break;
     case 8:
          System.out.println("You have pressed"+num);
          break;
     case 9:
          System.out.println("You have pressed"+num);
          break;
    default :
          System.out.println("Wrong choice");
          break;
    }
  }
}
