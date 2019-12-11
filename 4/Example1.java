/* A java Code written by ANKIT MISHRA
Reg. NO. 2017CA63 
*/
import java.util.*;
import java.io.*;
class Student
{
 String name,fname,mob;
 Scanner in=new Scanner(System.in);
 public void set()
 {
  System.out.print("Enter student name : ");
  name=in.nextLine();
  System.out.print("Enter name of father of student : ");
  fname=in.nextLine();
  System.out.print("Enter Mobile number of student : ");
  mob=in.nextLine();
 }
 public void display()
 {
  System.out.println("---------------------------------------------------------");
  System.out.println("Entered details are");
  System.out.println("Name :            "+name);
  System.out.println("Father's name :   "+fname);
  System.out.println("Mobile Number :   "+mob);
 }
}

class UG extends Student 
{
 Scanner in=new Scanner(System.in);
 String department;
 double cpi,spi;
 public void set()
 {
  System.out.print("Enter student name : ");
  name=in.nextLine();
  System.out.print("Enter name of father of student : ");
  fname=in.nextLine();
  System.out.print("Enter Mobile number of student : ");
  mob=in.nextLine();
  System.out.print("Enter name of department of student : ");
  department=in.nextLine();
  System.out.print("Enter cpi of student : ");
  cpi=in.nextDouble();
  System.out.print("Enter Spi of student : ");
  spi=in.nextDouble();
 }
 
 public void display()
 {
  System.out.println("---------------------------------------------------------");
  System.out.println("Entered details are");
  System.out.println("Name :            "+name);
  System.out.println("Father's name :   "+fname);
  System.out.println("Mobile Number :   "+mob);
  System.out.println("Department :      "+department);
  System.out.println("CPI  :            "+cpi);
  System.out.println("SPI :             "+spi);
 }
}

class PG extends Student
 {
  Scanner in=new Scanner(System.in);
  String ugdegree,uginstitution;
  public void set()
 {
  System.out.print("Enter student name : ");
  name=in.nextLine();
  System.out.print("Enter name of father of student : ");
  fname=in.nextLine();
  System.out.print("Enter Mobile number of student : ");
  mob=in.nextLine();
  System.out.print("Enter name of UG DEGREE of student : ");
  ugdegree=in.nextLine();
  System.out.print("Enter name of UG INSTITUTION of student : ");
  uginstitution=in.nextLine();
 }
 public void display()
 {
  System.out.println("---------------------------------------------------------");
  System.out.println("Entered details are");
  System.out.println("Name :                 "+name);
  System.out.println("Father's name :        "+fname);
  System.out.println("Mobile Number :        "+mob);
  System.out.println("UG DEGREE :            "+ugdegree);
  System.out.println("UG INSTITUTION :       "+uginstitution);
 }
}

class PHD extends Student
 {
 Scanner in=new Scanner(System.in);
 String supervisor;
 public void set()
 {
  System.out.print("Enter student name : ");
  name=in.nextLine();
  System.out.print("Enter name of father of student : ");
  fname=in.nextLine();
  System.out.print("Enter Mobile number of student : ");
  mob=in.nextLine();
  System.out.print("Enter name of supervisor : ");
  supervisor=in.nextLine();
 }
 public void display()
 {
  System.out.println("---------------------------------------------------------");
  System.out.println("Entered details are");
  System.out.println("Name :            "+name);
  System.out.println("Father's name :   "+fname);
  System.out.println("Mobile Number :   "+mob);
  System.out.println("Supervisor Name : "+supervisor);
 }
}

public class Example1
{
 public static void main(String args[])
 {
  Scanner in=new Scanner(System.in);
  int choice;
  System.out.print("Enter your choice 1.Student 2.UG Student 3. PG Student 4. PHD Student : ");
  choice=in.nextInt();
  switch(choice)
  {
   case 1:
         Student stu=new Student();
         System.out.println("Enter student details");
         stu.set();
         stu.display();
         break;
   case 2:
         UG ug=new UG();
         System.out.println("Enter UG Student details");
         ug.set();
         ug.display();
         break;
  case 3:
         PG pg=new PG();
         System.out.println("Enter PG Student details");
         pg.set();
         pg.display();
         break;
  case 4:
         PHD phd=new PHD();
         System.out.println("Enter PHD Student details");
         phd.set();
         phd.display();
         break;
 default :
          System.out.println("You have entered wrong choice ");
          break;
  }
 }
}
