import java.util.*;
class lottery
 {
     int[] userDigits = new int[5];
     int[] lotteryNumbers=new int[5];
     int sameNum=0;
    public lottery() 
               {
	        Random rand = new Random();
	        for (int i = 0; i < lotteryNumbers.length; i++) 
	        {
	            lotteryNumbers[i] = rand.nextInt(10);
	        }
	      }
   public void getUserData()
   {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter digit 1: ");
    userDigits[0] = keyboard.nextInt();
    System.out.print("Enter digit 2: ");
    userDigits[1] = keyboard.nextInt();
    System.out.print("Enter digit 3: ");
    userDigits[2] = keyboard.nextInt();
    System.out.print("Enter digit 4: ");
    userDigits[3] = keyboard.nextInt();
    System.out.print("Enter digit 5: ");
    userDigits[4] = keyboard.nextInt();
   }
 public void compareArrays()
   {
     for (int i = 0; i < 5; i++)
      {
       for (int x = 0; x < 5; x++)
        {
         if (lotteryNumbers[i] == userDigits[x])
           {
           sameNum++;
           }
        }                                               
      }
 }
public void displayLottery()
  {
    System.out.println("Lottery numbers: " + lotteryNumbers[0] + " " +lotteryNumbers[1] + " " + lotteryNumbers[2] + " " + lotteryNumbers[3] +" " + lotteryNumbers[4] + " ");
 }
 public void displayUser()
  {
   System.out.println("Player numbers:  " + userDigits[0] + " " + userDigits[1] + " " + userDigits[2] + " " + userDigits[3] + " " + userDigits[4]+ " ");
  System.out.println("Number of matching digits: " + sameNum);
  }
public void display()
  {
   switch(sameNum)
    {
     case 5:
            System.out.println("Grand PRIZE WINNER");
            break;
     case 4:
           System.out.println("Super PRIZE WINNER");
            break;
     case 3:
            System.out.println("Good PRIZE WINNER");
            break;
     case 2:
           System.out.println("Nice PRIZE WINNER");
            break;
    case 1:
            System.out.println("WINNER");
            break;
     case 0:
           System.out.println("Best of luck for next time");
            break; 
    }
  }
}

class LotteryGame
 {
   public static void main(String[] args)
    {
     lottery l=new lottery();
     l.getUserData();
     l.compareArrays();
     l.displayLottery();
     l.displayUser();
     l.display();
    }
}
