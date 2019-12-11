import java.util.Scanner;
class rainfall
{
 double[] rain=new double[12];
 double sum=0;
 Scanner in=new Scanner(System.in);
 void setData()
 {
  System.out.println("Enter Rainfall for this year ");
  for(int i=0;i<12;i++)
   {
    System.out.println("For the month : "+(i+1)+" ");
    rain[i]=in.nextDouble();
   }
 }
 void findTotal()
  {
    for(int i=0;i<12;i++)
     sum+=rain[i];
     System.out.println("Total rainfall in this year is : "+sum);
  }
 void findAverage()
  {
   double average=sum/12;
   System.out.println("Average rainfall per month is : "+average);
  }
 void findMax()
  {
    double max=rain[0];
    int m1=0;
    for(int i=0;i<12;i++)
     {
      if(max<rain[i])
       {
        max=rain[i];
        m1=i;
       }
     }
    System.out.println("Maximum rainfall was in the month of : "+(m1+1)+"and rainfall was : "+max);
  }
 void findMin()
  {
    double min=rain[0];
    int m1=0;
    for(int i=0;i<12;i++)
     {
      if(min>rain[i])
       {
        min=rain[i];
        m1=i;
       }
     }
    System.out.println("Minimum rainfall was in the month of : "+(m1+1)+"and rainfall was : "+min);
  }
}

class Rainfall
 {
  public static void main(String[] args)
   {
    rainfall r=new rainfall();
    r.setData();
    r.findTotal();
    r.findAverage();
    r.findMax();
    r.findMin();
   }
 }
