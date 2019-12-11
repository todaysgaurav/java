/*
Write a program that takes information about institute staff information for

 Teacher code, name, subject and publication
 Officer code, name and grade
 Typist code, name, speed and daily wages
*/
import java.util.*;
class Staff
 {
  String code,name;
  Scanner in=new Scanner(System.in);
  public void setstaff()
   {
    System.out.println("Enter name and code");
    name=in.nextLine();
    code=in.nextLine();
   }
  public void display()
   {
    System.out.println("Name is :"+name);
    System.out.println("Code is :"+code);
   }
 }
 
class Teacher extends Staff
 {
  String subject,publication;
  Scanner in=new Scanner(System.in);
  public void setteacher()
   {
    setstaff();
    System.out.println("Enter subject and publication");
    subject=in.nextLine();
    publication=in.nextLine();
   }
  public void display()
   {
    System.out.println("Name is :"+name);
    System.out.println("Code is :"+code);
    System.out.println("Subject is :"+subject);
    System.out.println("Publication is :"+publication);
   }
 }

class Typist extends Staff
 {
  int speed;
  Scanner in=new Scanner(System.in);
  public void settypist()
   {
    setstaff();
    System.out.println("Enter speed");
    speed=in.nextInt();
   }
  public void display()
   {
    System.out.println("Name is :"+name);
    System.out.println("Code is :"+code);
    System.out.println("Speed is :"+speed);
   }
 }

class Officer extends Staff
 {
  char grade;
  Scanner in=new Scanner(System.in);
  public void setofficer()
   {
    setstaff();
    System.out.println("Enter grade");
    grade=in.next().charAt(0);
   }
  public void display()
   {
    System.out.println("Name is :"+name);
    System.out.println("Code is :"+code);
    System.out.println("Grade is :"+grade);
   }
 }
 
class Regular extends Typist
 {
  int salary;
  Scanner in=new Scanner(System.in);
  public void setregular()
   {
    settypist();
    System.out.println("Enter total salary");
    salary=in.nextInt();
   }
  public void display()
   {
    System.out.println("Name is :"+name);
    System.out.println("Code is :"+code);
    System.out.println("Speed is :"+speed);
    System.out.println("Total salary is :"+salary);
   }
 }
 
class Causual extends Typist
 {
  int salary;
  Scanner in=new Scanner(System.in);
  public void setcausual()
   {
    settypist();
    System.out.println("Enter daily wages");
    salary=in.nextInt();
   }
  public void display()
   {
    System.out.println("Name is :"+name);
    System.out.println("Code is :"+code);
    System.out.println("Speed is :"+speed);
    System.out.println("Daily wages is :"+salary);
   }
 }
 
public class Example11
 {
  public static void main(String args[])
   {
    Staff staff=new Staff();
    staff.setstaff();
    staff.display();
    Teacher teacher=new Teacher();
    teacher.setteacher();
    teacher.display();
    Officer officer=new Officer();
    officer.setofficer();
    officer.display();
    Typist typist=new Typist();
    typist.settypist();
    typist.display();
    Regular regular=new Regular();
    regular.setregular();
    regular.display();
    Causual causual=new Causual();
    causual.setcausual();
    causual.display();
   }
 }
