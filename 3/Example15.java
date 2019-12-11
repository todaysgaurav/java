/*
Write a class named RetailItem that holds data about an item in a retail store.
The class should have the following fields:
Description: The description field references a String object that holds a
brief description of the item.
unitsOnHand: The unitsOnHand field is an int variable that holds the
numbers of units currently in inventory.
Price: The price filed is a double that holds the item's retail price.Write a constructor that accepts arguments for each field, appropriate
mutator methods that store values in these fields, and accessor methods
that returns the values in these fields. Once you have written the class
*/
import java.util.*;
class RetailItem
{
 private String description;
 private int units;
 private double price;
 RetailItem(String ds,int u,double p)
  {
   description=ds;
   units=u;
   price=p;
  }
 public void display()
  {
   System.out.println(" "+description+"                 "+units+"                 "+price);
  }
}
public class Example15
 {
  public static void main(String args[])
   {
    RetailItem re1=new RetailItem("Jacket",12,59.95);
    RetailItem re2=new RetailItem("Designer Jeans",40,34.95);
    RetailItem re3=new RetailItem("Shirt",20,24.95);
    System.out.println(" "+"Description"+"           "+"Units on Hand"+"              "+"Price");
    re1.display();
    re2.display();
    re3.display();
   }
 }
