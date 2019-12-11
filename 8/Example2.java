interface Shape
 {
  void draw();
 }
class Rectangle implements Shape
 {
  public void draw()
   {
    System.out.println("Inside Rectangle draw method ");
   }
 }
class Circle implements Shape
 {
  public void draw()
   {
    System.out.println("Inside Circle draw method ");
   }
 }
class Square implements Shape
 {
  public void draw()
   {
    System.out.println("Inside square draw method ");
   }
 }
class ShapeFactory
 {
     public Shape getShape(String shapeType)
      {
      if(shapeType == null)
       {
         return null;
       }
       if(shapeType.equalsIgnoreCase("CIRCLE"))
       {
         return new Circle();
         
      } 
      else if(shapeType.equalsIgnoreCase("RECTANGLE"))
      {
         return new Rectangle();
         
      } 
      else if(shapeType.equalsIgnoreCase("SQUARE"))
      {
         return new Square();
      }
     return null;
    }
 }
class Example2
 {
  public static void main(String[] args)
   {
     ShapeFactory shape=new ShapeFactory();
     Shape shape1=shape.getShape("Circle");
     Shape shape2=shape.getShape("Rectangle");
     Shape shape3=shape.getShape("Square");
     shape1.draw();
     shape2.draw();
     shape3.draw();
   }
 }
 
