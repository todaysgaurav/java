/* The discount rate is 10% for the quantity purchased between 100 and 120
units, and 15% for the quantity purchased greater than 120 units. If the
quantity purchased is less than 100 units, the discount rate is 0%. See the
example output as shown below:
*/
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Revenue
{
 public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
   float price,revenue,discount;
   int unit,discount1;
   System.out.println("Enter number of unit you want to perchage");
   unit=in.nextInt();
   System.out.println("Enter price of per unit");
   price=in.nextFloat();
   if(unit>120)
    discount1=15;
   else if(unit>100)
    discount1=10;
   else
    discount1=0;
   revenue=(float)(unit*price);
   discount=(float)(revenue*discount1*0.01);
   revenue=(float)(revenue-discount);
   System.out.println("The revenue from sale:"+revenue);
   System.out.println("After discount:"+discount);
  }
}
