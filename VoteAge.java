/* Write Java program to allow the user to input his/her age. Then
the program will show if the person is eligible to vote. A person who is eligible
to vote must be older than or equal to 18 years old.
*/
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class VoteAge
{
 public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your age");
    int age=in.nextInt();
    if(age>18)
     System.out.println("You are eligible for voting");
    else
     System.out.println("You are not eligible for voting");
    
  }
}
