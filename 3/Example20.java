/*
Design a class that stores a temperature in a temperature field and has the
appropriate accessor andmutator methods for the field. In addition to appropriate
constructors, the class
*/
import java.util.*;
class Temparature
 {
   private double temp;
   Temparature(double t)
    {
     temp=t;
    }
  public boolean isEthylAlchoolFreezing()
   {
    if (temp <= -173) 
       {
            return true;
        } 
    else 
        {
            return false;
        }
    }
  public boolean isOxygenFreezing()
   {
    if (temp <= -362) 
       {
            return true;
        } 
    else 
        {
            return false;
        }
    }
  public boolean isWaterFreezing()
   {
    if (temp <= -32) 
       {
            return true;
        } 
    else 
        {
            return false;
        }
    } 
 public boolean isEthylAlchoolBoil()
   {
    if (temp >= 172) 
       {
            return true;
        } 
    else 
        {
            return false;
        }
    }
  public boolean isOxygenBoil()
   {
    if (temp >= -306) 
       {
            return true;
        } 
    else 
        {
            return false;
        }
    }
  public boolean isWaterBoil()
   {
    if (temp >= 212) 
       {
            return true;
        } 
    else 
        {
            return false;
        }
    } 
 }

public class Example20
 {
  public static void main(String args[])
   {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter temparature you want to check :");
    double T=in.nextDouble();
    Temparature temparature=new Temparature(T);
    if (temparature.isEthylAlchoolFreezing()) 
    {
        System.out.println("Ethyl alcohol will freeze.");
    }
    if (temparature.isOxygenFreezing()) 
    {
        System.out.println("Oxygen will freeze.");
    }
    if (temparature.isWaterFreezing()) 
    {
        System.out.println("Water will freeze.");
    }
   if (temparature.isEthylAlchoolBoil()) 
    {
        System.out.println("Ethyl alcohol will boil.");
    }
    if (temparature.isOxygenBoil()) 
    {
        System.out.println("Oxygen will boil.");
    }
    if (temparature.isWaterBoil()) 
    {
        System.out.println("Water will boil.");
    }
   }
 }
