/* By using do while loop, write Java program to
prompt the user to choose the correct answer from a list of
answer choices of a question.
The user can choose to continue answering the question or stop answering it.
See the example below:
What is the command keyword to exit a loop in Java?
a. int
b. continue
c. break
d. exit
*/
import java.io.*;
import java.net.*;
import java.util.*;
public class DoWhileCorrect
{
 public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
 System.out.println("What is the command keyword to exit a loop in Java?");
 System.out.println("a. int");
 System.out.println("continue");
 System.out.println("c. break");
 System.out.println("d. exit");
   char correct='c';
   char ans;
 do
  {
    System.out.println("ENter your choice");
    ans=in.next().charAt(0);
    if(ans==correct)
    System.out.println("Congratulations");
     else
      {
        System.out.println("Try again");
      }				
  }while(ans!=correct);
 }
}
