/*
Design a TestScores class that has fields to hold three test scores. The class
should have a constructor, accessor and mutator methods for the test score
fields, and a method that returns the average of the test scores. Demonstrate
the class by writing a separate program that creates an instance of the class.
The program should ask the user to enter three test scores, which are stored
in the TestScores object. Then the program should display the average of the
scores, as reported by the TestScores object.
*/
import java.util.*;
class TestScore
 {
   private double test1;
   private double test2;
   private double test3;
   Scanner in=new Scanner(System.in);
   TestScore()
    {
     test1=0;
     test2=0;
     test3=0;
    }
   public void set()
    {
     System.out.println("Enter first Test score");
     test1=in.nextDouble();
     System.out.println("Enter Second Test score");
     test2=in.nextDouble();
     System.out.println("Enter Third Test score");
     test3=in.nextDouble();
    }
    public double result()
     {
      return (test1+test2+test3)/3;
     }
 }
 
 public class Example16
 {
  public static void main(String args[])
   {
     TestScore obj=new TestScore();
     obj.set();
     System.out.println("Total average score is : "+obj.result());
   }
  }
