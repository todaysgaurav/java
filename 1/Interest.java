/* Write Java program to allow the user to input the amount of
deposit, yearly interest rate (percentage), and income tax(percentage). Then
the program will calculate the amount of interest that the person earns in the
*/
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Interest
{
 public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    float rate,tax,deposit;
    System.out.println("Enter amount of Deposit");
    deposit=in.nextFloat();
    System.out.println("Enter value of Interest");
    rate=in.nextFloat();
    System.out.println("Enter value of Tax");
    tax=in.nextFloat();
    float earn;
    earn=(float)((deposit*rate*0.01));
    earn-=(float)(earn*tax*0.01);
    System.out.println("Total earning is"+earn);
  }
 }
