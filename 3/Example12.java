/*
Write a class named employee with the following fields:
name: The name field references a String object that holds the employee's name.
idNumber: The idNumber is an int variable that holds the employee's ID number.
department: The department field references a String object that holds the name of the
department where the employee works.
*/
class Employee
 {
  private String name;
  private int idnumber;
  private String department;
  private String position;
  Employee(String nm, int id, String dp, String ps)
   {
    name=nm;
    idnumber=id;
    department=dp;
    position=ps;
   }
  Employee(String nm,int id)
   {
    name=nm;
    idnumber=id;
    department=" ";
    position=" ";
   }
  Employee()
   {
    name=" ";
    idnumber=0;
    department=" ";
    position=" ";
   }
  public String getname()
   {
    return name;
   }
  public int getidnumber()
   {
    return idnumber;
   }
  public String getdepartment()
   {
    return department;
   }
  public String getposition()
   {
    return position;
   }
 }

class Example12
 {
  public static void main(String args[])
   {
      Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice Pres");
      Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
      Employee employee3 = new Employee("Joy Rodgers", 81774, "Manufacturing", "Engineer");
      System.out.println("  Name        ID Number   Department      Position  ");
      System.out.println("_______________________________________________________");
      System.out.print(" " + employee1.getname() + "    " + employee1.getidnumber() + "         " + employee1.getdepartment());
      System.out.println("      " + employee1.getposition());
      System.out.print(" " + employee2.getname() + "    " + employee2.getidnumber() + "            " + employee2.getdepartment());
      System.out.println("        " + employee2.getposition());
      System.out.print(" " + employee3.getname() + "    " + employee3.getidnumber() + "         " + employee3.getdepartment());
      System.out.println("      " + employee3.getposition());
   }
 }
