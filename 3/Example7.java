/*
Design a class to represent a bank account. Include the following members:
Data Members
->Name of the depositor
->Account Number
->Type of Account
->Balance amount in the account

Methods
->To assign intial values
->To deposit an amount
->To withdraw an amount after checking balance
->To display the name and balance
 */
 import java.io.*;
class BankAccount
 {
  private double balance;
  private String AccountNumber;
  private String AccountType;
  private String NameOfDepositer;
  public void SetInitial(double bal,String name,String type,String number)
   {
    balance=bal;
    AccountNumber=number;
    AccountType=type;
    NameOfDepositer=name;
   }
  public void DepositBal(double amount)
   {
    balance+=amount;
   }
  public void Withdraw(double a)
   {
     if(a<=balance)
      {
       balance=balance-a;
       System.out.println("Amount "+a+" has been succesfully withdrawn");
      }
     else
      {
       System.out.println("Your account has not sufficient balance  Balance in your account is : "+balance);
      }
   }
  public void display()
   {
    System.out.println("Name of Account holder is :"+NameOfDepositer+" Balance in your account is :"+balance+" Your Accoutnt numebr is :"+AccountNumber);
   }
 }
public class Example7
 {
  public static void main(String args[])
   {
    BankAccount bnk=new BankAccount();
     bnk.SetInitial(12000.02,"Ankit","Saving","34132776683");
     bnk.display();
     bnk.Withdraw(9000.01);
     bnk.display();
     bnk.DepositBal(1000.3);
     bnk.display();
   }
 }
