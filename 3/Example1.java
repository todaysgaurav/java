/* Write a class that has three overloaded static methods for
calculating the areas of the following geometric shapes:
circles
rectangles
cylinders
*/
import java.lang.*;
import java.util.*;
class Shapearea
 {
   double radius,height,length;
   float breath;
   public static double area(double radius)
    {
     return Math.PI*radius*radius;
    }
   public static double area(double length,float breath)
    {
       return length*breath;
    }
   public static double area(double radius,double height)
    {
      return Math.PI*radius*radius*height;
    }
 }
 public class Example1
  {
   public static void main(String args[])
    {
     double r,ar,ac,acy;
     Scanner in=new Scanner(System.in);
     System.out.println("Enter value of radius of circle :");
     r=in.nextDouble();
     System.out.println("Enter breath and height of rectange :");
     double h1=in.nextDouble();
     float b1=in.nextFloat();
     System.out.println("Enter radius and height of cylinder :");
     double r1=in.nextDouble();
     double h2=in.nextDouble();
     ac=Shapearea.area(r);
     ar=Shapearea.area(h1,b1);
     acy=Shapearea.area(r1,h2);
     System.out.println("Area of circle is : "+ac);
     System.out.println("Area of Rectangle is : "+ar);
     System.out.println("Area of cylinder is : "+acy);
    }
  }
