/*  Write a Java program by using BufferedReader
class to prompt a user to input his/her name and then
the output will be shown as an example below:
*/
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class BufferedReader
{
 public static void main(String args[])
  {
   String str;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your name");
     str = in.nextLine();
     System.out.println("Hello\t"+str+"!");
  }  
}
