/*
A bank charges $10 per month plus the following check fees for a commercial
checking
account:
$.10 each for fewer than 20 checks
$.08 each for 20 39 checks
$.06 each for 40 59 checks
$.04 each for 60 or more checks
The bank also charges an extra $15 if the balance of the account falls
below
$400
(before any check fees are applied). Write a program that asks for the
beginning
balance
and the number of checks written. Compute and display the bank s
service
fees
for the month.
*/
import java.util.*;
class Bank
 {
  private int check;
  private double balance;
  double initial=10;
  double charge;
  Scanner in=new Scanner(System.in);
  public void set()
   {
    System.out.println("Enter initial balance in account ");
    balance=in.nextDouble();
    System.out.println("Enter number of checks");
    check=in.nextInt();
   }
   public void show()
    {
     System.out.println("Initial balance in account is :"+balance);
    }
   public void cal()
    {
      if(check>=60)
       charge=initial+check*0.04;
      else if(check>=40)
       charge=initial+check*0.06;
      else if(check>=20)
       charge=initial+check*0.08;
     else 
       charge=initial+check*0.10;
     if(balance<400)
      charge+=15;
    }
   public void showcharge()
    {
     System.out.println("Total bank charges are :"+charge);
    }
 }
public class Example18
 {
  public static void main(String args[])
   {
    Bank bnk=new Bank();
    bnk.set();
    bnk.show();
    bnk.cal();
    bnk.showcharge();
   }
 }
