import java.util.*;
class Example13
 {
  public static void main(String[] args)
   {
          PriorityQueue<String> c1=new PriorityQueue<String>();
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");
         System.out.println("Element of PriorityQueue are : "+c1);
         System.out.println("First element is : "+c1.peek());
   }
  }
