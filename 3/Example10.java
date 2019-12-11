/*
Assume that a bank maintains two kinds of accounts for customers, one called savings account and the other as current account. The savings account provides compound interest and withdrawal facilities but no cheque book facility. The current account provides cheque book facility but no interest. Current account holders should also maintain a minimum balance and if the balance falls below this level, a service charge is imposed. Create a class ACCOUNT that stores customer name, account number and type of account. From this derive the class CUR_ACCT and SAV_ACCT to make them more specific to their requirements. Include necessary member functions in order to achieve the following: a) accept deposit from a customer and update the balance b) display the balance c) compute and deposit interest d) permit withdrawal and update the balance e) check for minimum balance, impose penalty, if necessary, and update the balance Use member functions to initialize the class members. Use constructors  */
import java.util.*;
import java.lang.*;
class Account
 {
   String CustomerName;
   String AccountNumber;
   String AccountType;
   double Balance;
   Account()
    {
      CustomerName="Rahul";
     AccountNumber="718401011010474";
     AccountType="Saving";
     Balance=0; 
    }
   Account(String name,String Number,String Type,double bal)
    {
      CustomerName=name;
     AccountNumber=Number;
     AccountType=Type;
     Balance=bal;
    }
   public void SetBal(String name,String Number,String Type,double bal)
    {
     CustomerName=name;
     AccountNumber=Number;
     AccountType=Type;
     Balance=bal;
    }
   public void display()
    {
      System.out.println("Account Holder name is :"+CustomerName);
      System.out.println("Account Number is :"+AccountNumber);
      System.out.println("Account Type is :"+AccountType);
    }
   public void deposit()
    {
     int amount;
     Scanner in=new Scanner(System.in);
     System.out.println("Enter amount to be deposited :");
      amount=in.nextInt();
     Balance+=amount;
    }
 }
class SAV_ACCT extends Account
 {
  double inter;
  Scanner in=new Scanner(System.in);
  public double comp_int()
     { 
      int time1,rate1;
      rate1=10;
      System.out.println("Eneter time:");
      time1=in.nextInt();
      inter=Balance*Math.pow(1+rate1/100.0,time1)-Balance;
      return inter;
     }
 public void update_bal()
     {
       Balance=Balance+comp_int();
     }

 public void withdrawn()
     {
      int amt;
      System.out.println("Enter amount to withdrawn");
      amt=in.nextInt();
      if(Balance>=amt)
        Balance=Balance-amt;
      else
          System.out.println("Amount Can not be withdrawn");
      }
 }
class CURR_ACCT extends Account 
 {
  int chq_bk;
  int penal;
  Scanner in=new Scanner(System.in);
public int min_bal()
  { 
   int ret1=1;
   if(Balance<=500)
       { 
        penal=50;
        Balance=Balance-penal;
        ret1=0;
       }
   else
     {
      System.out.println("No Penalty is enable to customer ");
     }
  return ret1;
   }

     public void withdrawn()

      {

            int amt;

            System.out.println("Enter the amount to withdrawn");
            amt=in.nextInt();
            if(amt<Balance)
             System.out.println("Amount can not be withdrawn");
            else
             Balance=Balance-amt;
        }
 }
public class Example10
 {
  public static void main(String args[])
   {
     CURR_ACCT c1=new CURR_ACCT(); 
     SAV_ACCT s1=new SAV_ACCT();
     c1.display();
     s1.display();
     c1.SetBal("Ankit","32107089674","Current",12500);
     c1.display();
     c1.deposit();
     c1.display();
     c1.withdrawn();
     c1.display();
     s1.SetBal("Karuna","34132776683","Saving",76400);
     s1.update_bal();
     s1.withdrawn();
     s1.display();
   }
 }
