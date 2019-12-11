/* Design a Geometry class with the following methods:
 A static method that accepts the radius of a circle and
returns the area of the circle.
Use the following formula:
Area=πr^2
Use Math.PI for π and the radius of the circle for r.
 A static method that accepts the length and width of a
rectangle and returns the area of the rectangle. Use the
following formula:
Area = Length x Width
 A static method that accepts the length of a triangle's
base and the triangle's height. The method should
return the area of the triangle. Use the following
formula:
Area = Base x Height x 0.5 */
import java.util.*;
 class Geometry
 {
   public static double areaOfCircle(double radius)
    {
     return Math.PI*radius*radius;
    }
   public static double areaOfRectangle(double length,double width)
   {
    return length*width;
   }
   public static double areaOfTriangle(double base,double height)
   {
    return 0.5*base*height;
   }
 }
 class Example6
 {
 
  public static void main(String args[])
   {
    int choice;
    choice=getMenu();
    do
     {
      if(choice==1)
       {
        CalculateCircleArea();
       }
      else if(choice==2)
       {
        CalculateRectangleArea();
       }
      else if(choice==3)
       {
        CalculateTriangleArea();
       }
      else if(choice==4)
       {
        System.out.println("Thank you for comming here");
       }
     } while(choice!=4);
   }
  public static int getMenu() 
  {

    int userChoice;
    Scanner in = new Scanner(System.in);
    System.out.println("Geometry Calculator\n");
    System.out.println("1. Calculate the Area of a Circle");
    System.out.println("2. Calculate the Area of a Rectangle");
    System.out.println("3. Calculate the Area of a Triangle");
    System.out.println("4. Quit\n");
    System.out.print("Enter your choice (1-4) : ");
    userChoice = in.nextInt();
    while (userChoice < 1 || userChoice > 4)
     {
        System.out.print("Please enter a valid range: 1, 2, 3, or 4: ");
        userChoice = in.nextInt();
     }

    return userChoice;
   }
  public static void CalculateCircleArea() 
  {

    double radius;
    Scanner in = new Scanner(System.in);
    System.out.print("What is the circle's radius? ");
    radius = in.nextDouble();
    while(radius<=0)
     {
      System.out.print("Please enter radius of circle greater than zero");
        radius = in.nextDouble();
     }
    System.out.println("The circle's area is " + Geometry.areaOfCircle(radius));
  }
 public static void CalculateRectangleArea() 
 {
    double length;
    double width;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter length? ");
    length = in.nextDouble();
    System.out.print("Enter width? ");
    width = in.nextDouble();
    while(length<=0 || width<=0)
     {
      System.out.print("Please enter length and width of circle greater than zero");
        length = in.nextDouble();
        width=in.nextDouble();
     }
    System.out.println("The rectangle's area is "+ Geometry.areaOfRectangle(length,width));
  }  
 public static void CalculateTriangleArea() 
 {

    double base;
    double height;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter length of the triangle's base? ");
    base = in.nextDouble();
    System.out.print("Enter triangle's height? ");
    height = in.nextDouble();
    while(height<=0 || base<=0)
     {
      System.out.print("Please enter length and width of circle greater than zero");
        height = in.nextDouble();
        base=in.nextDouble();
      }
    System.out.println("The triangle's area is " + Geometry.areaOfTriangle(base, height));
 }
}  
