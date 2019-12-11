/*
Design a Payroll class that has fields for an employee's name, ID number,
hourly pay rate, and number of hours worked. Write the appropriate accessor
and mutator methods and a constructor that accepts the employee's name
and ID number as arguments. The class should also have a method that
returns the employee's gross pay, which is calculated as the number of hours
worked multiplied by the hourly rate. Write a program that demonstrates the
class by creating a Payroll object, then asking the user to enter the data for
an employee. The program should display the amount of gross pay earned.
*/
import java.util.*;
class Payroll
 {
  private String name;
  private int id;
  private double rate;
  private double hour;
  //private double gross;
  Scanner in=new Scanner(System.in);
  Payroll(String nm,int number)
   {
    name=nm;
    id=number;
   }
   public void set()
    {
     System.out.println("Enter rate of hour");
     rate=in.nextDouble();
     System.out.println("Enter number of hours worked");
     hour=in.nextDouble();
    }
 // double gross=(double)rate*hour;
  public double Getgross()
   {
    return rate*hour;
   }
 }
public class Example14
 {
  public static void main(String args[])
   {
    Payroll emp1=new Payroll("Kamal",786);
    emp1.set();
    System.out.println("Total Gross pay is :"+emp1.Getgross());
   }
 }
