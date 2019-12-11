/*
Write a Circle class that has the following fields:
radius: a double
PI: a final double initialized with the value 3.14159
The class should have the following methods:
Constructor: accepts the radius of the circle as an argument.
Constructor: A no-arg constructor that sets the radius field to 0.0.
setRadius: A mutator method for the radius field.
getRadius: An accessor method for the radius field.
getArea: Returns the area of the circle which is calculated as
area=PI*radius*radius
getDiameter: Returns the diameter of the circle which is calculated as
diameter=radius*2
getCircumference: Returns the circumference of the circle, which is
calculated as circumference= 2*PI*radiusWrite a program that demonstrates the Circle class by asking the user for
the circle's radius, creating a Circle object, and then reporting the circle's
area, diameter, and circumference.
*/
import java.util.*;
class Circle
 {
  private double radius;
  Scanner in=new Scanner(System.in);
  final double PI=3.14159;
  Circle(double r)
   {
    radius=r;
   }
   Circle()
    {
     radius=0;
    }
   public void setRadius()
    {
      System.out.println("Enter radius of circle");
      radius=in.nextDouble();
    }
   public double getRadius()
    {
     return radius;
    }
    public double getArea()
    {
     return PI*radius*radius;
    }
   public double getDiameter()
    {
     return 2*radius;
    }
   public double getCircumference()
    {
     return 2*PI*radius;
    }
 }

public class Example17
 {
  public static void main(String args[])
   {
    Circle circle=new Circle();
    circle.setRadius();
    System.out.println("Radius is :"+circle.getRadius());
    System.out.println("Area is :"+circle.getArea());
    System.out.println("Diameter is :"+circle.getDiameter());
    System.out.println("Circumference is :"+circle.getCircumference());
   }
 }
