/*  Write Java program to generate a random number
between 1 to 6.
*/
import java.util.Random;
import java.io.*;
import java.net.*;
import java.lang.Math;
public class Randon
{
 public static void main(String args[])
  {
  Random name=new Random();
  int num=Math.abs(name.nextInt());
   System.out.println((num%6)+1);
  }
}
