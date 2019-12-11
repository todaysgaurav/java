/* Write Java program to allow the user to input two float values and
then the program adds the two values together. The result will be assigned to
the first variable.
*/
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class FloatSum
{
 public static void main(String args[])
  {
   float a,b;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter value of a:");
     a= in.nextFloat();
    System.out.println("The value of a before adding is:"+a);
    System.out.println("Enter value of b:");
    b=in.nextFloat();
    a+=b;
    System.out.println("The value of a after addtion with b is:"+a);
   }
}
