import java.util.*;
class quart
 {
  final int div=6;
  final int qua=4;
  double totalSales=0.0;
  double[][] sales=new double[div][qua];
  void setData()
   {
    Scanner in=new Scanner(System.in);
    for(int i=0;i<div;i++)
     {
      for(int j=0;j<qua;j++)
       {
        System.out.print("Enter details of "+(i+1)+" and "+(j+1)+" ");
        sales[i][j]=in.nextDouble();
       }
     }
   }
  void calculate()
   {
    for(int i=0;i<div;i++)
     {
      for(int j=0;j<qua;j++)
       {
        totalSales+=sales[i][j];
       }
      }
   }
 void display()
  {
   calculate();
   System.out.println("Totall sale of company is : "+totalSales);
  }
}
class QuartelySales
 {
  public static void main(String[] args)
   {
    quart q=new quart();
    q.setData();
    q.display();
   }
 }
