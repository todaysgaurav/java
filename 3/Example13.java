/*
Design a class that holds the following personal data: name, address, age, and phone
number. Write appropriate accessor and mutator functions. Demonstrate the class by
writing a program that creates three instances of it. One instance should hold your
information, and the other two should hold your friends or family members information.
*/
import java.util.*;
class PerData
 {
  private String name;
  private String add;
  private String  age;
  private String phone;
  Scanner in=new Scanner(System.in);
  public void set()
   {
    System.out.println("Enter name");
    name=in.nextLine();
    System.out.println("Enter address");
    add=in.nextLine();
    System.out.println("Enter age");
    age=in.nextLine();
    System.out.println("Enter phone number");
    phone=in.nextLine();
   }
   public void display()
    {
     System.out.println(name+"   "+add+"   "+age+"  "+phone);
    }
 }
public class Example13
 {
  public static void main(String args[])
   {
    PerData per1=new PerData();
    PerData per2=new PerData();
    PerData per3=new PerData();
    System.out.println("Enter asked information for three persons");
    per1.set();
    per2.set();
    per3.set();
    System.out.println("Enterd information of first person is ");
    per1.display();
    System.out.println("------------------------------------------------------------------------");
    System.out.println("Enterd information of second person is ");
    per2.display();
    System.out.println("------------------------------------------------------------------------");
    System.out.println("Enterd information of third person is ");
    per3.display();
    System.out.println("------------------------------------------------------------------------");
   }
 }
