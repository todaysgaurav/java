/* Write Java program to prompt the user to choose
the correct answer from a list of answer choices of a
question.
The user can choose to continue answering the question or stop answering it.
See the example below:
What is the command keyword to exit a loop in Java?
a. int
b. continue
c. break
d. exit
Enter your choice: b
Incorrect!
Again? press y to continue:
Enter your choice: c
Congratulations!
*/
import java.io.*;
import java.net.*;
import java.util.*;
public class WhileCorrect
{
 public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
 System.out.println("What is the command keyword to exit a loop in Java?");
 System.out.println("a. int");
 System.out.println("continue");
 System.out.println("c. break");
 System.out.println("d. exit");
 System.out.println("ENter your choice");
   char ans=in.next().charAt(0);
   char correct='c';
   if(ans==correct)
    System.out.println("Congratulations");
   while(ans!=correct)
    {
      if(ans==correct)
       System.out.println("Congratulations");
     else
      {
        System.out.println("Try again");
        ans=in.next().charAt(0);
       }				
    }
  }
}
