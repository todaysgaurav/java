/*
Design a SavingsAccount class that stores a savings account’s annual interest rate and
balance. The class constructor should accept the amount of the savings account’s starting
balance. The class should also have methods for subtracting the amount of a withdrawal,
adding the amount of a deposit, and adding the amount of monthly interest to the balance.
The monthly interest rate is the annual interest rate divided by twelve. To add the
monthly interest to the balance, multiply the monthly interest rate by the balance, and add
the result to the balance.
Test the class in a program that calculates the balance of a savings account at the
end of a period of time. It should ask the user for the annual interest rate, the
starting balance, and the number of months that have passed since the account was
established. A loop should then iterate once for every month, performing the
following:
2. Ask the user for the amount deposited into the account during the month. Use the class
method to add this amount to the account balance.
3. Ask the user for the amount withdrawn from the account during the month. Use the class
method to subtract this amount from the account balance.
4. Use the class method to calculate the monthly interest.After the last iteration, the program should display the ending balance, the
total amount of deposits, the total amount of withdrawals, and the total interest
*/
import java.util.*;
class SavingAccount
 {
   double balance,rate,rate1;
  int month;
  double interest=0,amount=0,deposit=0;
  Scanner in=new Scanner(System.in);
  SavingAccount(double bal)
   {
    balance=bal;
   }
  public void withdrawn(double amt)
   {
    
    if(amt>balance)
     System.out.println("You have not enough balance");
    else
     {
      balance=balance-amt;
      System.out.println(amt+" has been successfully withdrawn");
      amount+=amt;
     }
   }
   public void add(double a)
    {
     balance+=a;
     deposit+=a;
    }
    public void rat(double r)
     {
      rate=r;
     }
     //rate1=rate/12;
   public void cal()
    {
     interest+=balance*rate/12/100;
     balance+=interest;
    }
 }

class Example19
 {
  public static void main(String args[])
   {
    Scanner in=new Scanner(System.in);
    int Month;
    double Amount;
    SavingAccount acc=new SavingAccount(1000);
    System.out.println("Enter total number of months and interest rate for yearly");
    Month=in.nextInt();
    double Rate=in.nextDouble();
    acc.rat(Rate);
    for(int i=1;i<=Month;i++)
    {
     System.out.println("Enter amount to be deposited :");
     Amount=in.nextDouble();
     acc.add(Amount);
     System.out.println("Enter amount to withdrawn:");
     Amount=in.nextDouble();
     acc.withdrawn(Amount);
     acc.cal();
    }
   System.out.println("Total remaining balance is :"+acc.balance +"  "+"Total withdrawn amount is : "+acc.amount+" "+"Total interest      "+acc.interest+" "+"Total amount deposited is: "+acc.deposit);
   }
 }

