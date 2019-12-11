/* The program will read three types of scores (quiz, mid-term, and final scores)
and determine the grade based on the following rules:
-if the average score >=90% =>grade=A
-if the average score >= 70% and <90% => grade=B
-if the average score>=50% and <70% =>grade=C
-if the average score<50% =>grade=F
*/
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Grade
{
 public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
   float Quiz,Mid,Final;
   System.out.println("Enter Quiz score");
   Quiz=in.nextFloat();
   System.out.println("Enter Mid Sem score");
   Mid=in.nextFloat();
   System.out.println("Enter Final score");
   Final=in.nextFloat();
   float sum=Quiz+Mid+Final;
   float per=(float)(sum/3);
   if(per>=90)
    System.out.println("Your Grade is A");
   else if(per>=70)
    System.out.println("Your Grade is B");
   else if(per>=50)
    System.out.println("Your Grade is C");
  else
    System.out.println("Your Grade is F");
  }
}
