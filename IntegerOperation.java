/* Write Java program to allow the user to input two
integer values and then the program prints the results of
adding, subtracting, multiplying, and dividing among the two
*/
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class IntegerOperation
{
 public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Two integers");
     int num1 = in.nextInt();
     int num2 = in.nextInt();
     System.out.println("Addition is: "+(num1+num2));
     System.out.println("Subtraction is: "+(num1-num2));
     System.out.println("Multiplication  is: "+(num1*num2));
     System.out.println("Divison is: "+(num1/num2));
  }  
}
