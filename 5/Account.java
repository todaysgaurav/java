import java.util.*;
class account
{
 public boolean isValidAccount(int account)
 {
  int[] Accounts = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 8080152, 4562555,
                  5552012, 5050552, 7825877, 1250255, 1005231, 6545231, 3852085, 7576651,7881200, 4581002};

 for(int i=0; i<Accounts.length; i++)
 {
  if(Accounts[i] == account) return true;
  }    			  
 return false;
 }
}
class Account
 {
  public static void main(String[] args)
   {
	Scanner in = new Scanner(System.in);
	account local = new account();
	System.out.println("Enter an account number :");
	int account = in.nextInt();
	System.out.println("Account number "+account + " is "+ (local.isValidAccount(account)?"Valid":"Invalid"));
 }
}
