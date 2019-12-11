import java.util.*;
class Example17
 {
  public static void main(String[] args) 
   {  
     TreeMap<Integer,String> tree_map1=new TreeMap<Integer,String>();
     tree_map1.put(10, "Red");
     tree_map1.put(20, "Green");
     tree_map1.put(30, "Black");
     tree_map1.put(40, "White");
     tree_map1.put(50, "Blue");
     tree_map1.put(60, "Orange");
     System.out.println("Orginal TreeMap content: "+tree_map1);
	System.out.println("Checking the entry for 10: ");
     System.out.println("Key(s): "+tree_map1.lowerEntry(10));  
     System.out.println("Checking the entry for 20: ");
     System.out.println("Key(s): "+tree_map1.lowerEntry(20));  
     System.out.println("Checking the entry for 70: ");
     System.out.println("Key(s): "+tree_map1.lowerEntry(70));
   }
 }
