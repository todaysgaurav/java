import java.util.Scanner;
class payroll
{
 Scanner in=new Scanner(System.in);
 int[] employeeid={5658845,4520125,7895122,8777541,8451277,1302850,7580489};
 int[] hours=new int[7];
 double[] payRate=new double[7];
 double[] wages=new double[7];
 void setData()
 {
   for(int i=0;i<7;i++)
    {Scanner in=new Scanner(System.in);
     System.out.println("Enter payrate  wages and hours of employee of id : "+employeeid[i]+" : ");
     payRate[i]=in.nextDouble();
     wages[i]=in.nextDouble();
     hours[i]=in.nextInt();
    }
 }
 public double getGross(int m)
  {
   for(int i=0;i<7;i++)
    {
     if(m==employeeid[i])
      return payRate[i]*wages[i];
    }
    System.out.println("You have entered wrong id number");
     return 0;
  }
 void display()
  {
   System.out.println("Details of employee are : ");
   for(int i=0;i<7;i++)
    {
     System.out.println(employeeid[i] + " "+hours[i]+" "+wages[i]);
    }
  }
}

class Payroll
 {
  public static void main(String... args)
   {
   Scanner in=new Scanner(System.in);
    payroll p=new payroll();
    p.setData();
    System.out.println("Enter any employee number to search :");
     int h=in.nextInt();
    double m=p.getGross(h);
    if(m!=0)
    System.out.println("Gross pay of employee is : "+m);
    p.display();
   }
 }
