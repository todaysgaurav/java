/*
Write Java program to print the table of characters
that are equivalent to the Ascii codes from 1 to 122.
The program will print the 10 characters per line.
using while loop
*/
import java.io.*;
import java.net.*;
import java.util.*;
public class WhileAscii
{
public static void main(String[] args)
{
 int i =1;
 while (i <=122)
  {
   System.out.print((char)i+"\t");
   if (i % 10 == 0)
    System.out.print("");
    i++;
   }
}

}

