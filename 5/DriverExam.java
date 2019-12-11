import java.util.Scanner;
class driver
 {
  int mis=0;
  int correct=0;
  int wrong=0;
  String lic="BDAACABACDBCDADCCBDA";
  int[] answer=new int[20];
  void init()
   {
    for(int i=0;i<20;i++)
     answer[i]=0;
   }
  void giveAnswer()
   {
    Scanner in=new Scanner(System.in);
    init();
    System.out.println("Enter correct choice as A,B,C,D and F if want to miss ");
    for(int i=0;i<20;i++)
     {
      System.out.print("Enter answer of Question : "+(i+1)+" ");
      String ch=in.nextLine();
	 char c=ch.charAt(0);  
	 if(c=='F')
	  {
	   mis++;
	   continue;
	  }
	 answer[i]++;  
	 if(lic.charAt(i)==c)
	   correct++;
	 if(lic.charAt(i)!=c)
	  wrong++;
     }
   }
 boolean ispassed()
  {
   if(correct>14)
    return true;
   return false;
  }
 int totallCorrect()
  {
   return correct;
  }
 int totallnCorrect()
  {
   return wrong;
  }
 void questionMissed()
  {
   System.out.println("Totall missed Questions are: "+mis+" and numbers of questions are ");
   for(int i=0;i<20;i++)
    if(answer[i]==0)
     System.out.print((i+1)+" ");
   System.out.print("\n");
  }
 }
 class DriverExam
  {
   public static void main(String[] args)
    {
     driver d=new driver();
     d.giveAnswer();
     System.out.println(d.ispassed()?"passed":"failed");
     int t=d.totallCorrect();
     int n=d.totallnCorrect();
     System.out.println("Totall correct answers is : "+t);
     System.out.println("Totall wrong answers is : "+n);
     d.questionMissed();
    }
  }
