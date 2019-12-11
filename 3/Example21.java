/*
Write a class named Coin. The Coin class should have the following field:

A String named sideUp. The sideUp field will hold either “heads” or “tails”
indicating the side of the coin that is facing up.
The Coin class should have the following methods:
 A no-arg constructor that randomly determines the side of the coin that is
facing up (“heads” or “tails”) and initializes the sideUp field accordingly.
 A void method named toss that simulates the tossing of the coin. When the
toss method is called, it randomly determines the side of the coin that is facing
up (“heads” or “tails”) and sets the sideUp field accordingly.
 A method named getSideUp that returns the value of the sideUp field.
Write a program that demonstrates the Coin class. The program should create an instance
of the class and display the side that is initially facing up. Then, use a loop to toss the
coin 20 times. Each time the coin it tossed, display the side that is facing up. The program
should keep count of the number of times heads is facing up and the number of times tails
is facing up, and display those values after the loop finishes.
*/
import java.util.*;
class Coin
 {
  private String sideup;
  Coin()
  {
   toss();
  }
  public void toss()
   {
    Random rand=new Random();
    int value = rand.nextInt(2);
    if (value == 0)
      {
            this.sideup = "heads";
      }
   else 
        {
            this.sideup = "tails";
        }
   }
  public String getsideup()
   {
    return sideup;
   }
 }

public class Example21
{
 public static void main(String args[])
  {
  int headcount=0,tailcount=0;
  Scanner in=new Scanner(System.in);
  System.out.println("Enter number of tosses you want to check : ");
  int n=in.nextInt();
  Coin coin=new Coin();
  System.out.println("Now i will toss coin to : "+n+"  times");
  for(int i=1;i<=n;i++)
   {
    coin.toss();
    System.out.println("Toss : "+coin.getsideup());
    if ("heads".equals(coin.getsideup()))
      headcount++;
    else
     tailcount++;
   }
  System.out.println("Heads facing up: " + headcount);
  System.out.println("Tails facing up: " + tailcount);
  }
}
