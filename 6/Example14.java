import java.util.*;
class Example14
 {
  public static void main(String[] args)
   {
     HashMap <Integer,String> hash_map1 = new HashMap <Integer,String> ();
     HashMap <Integer,String> hash_map2 = new HashMap <Integer,String> ();
     hash_map1.put(1, "Red");
     hash_map1.put(2, "Green");
     hash_map1.put(3, "Black");
     System.out.println("\nValues in first map: " + hash_map1);
     hash_map2.put(4, "White");
     hash_map2.put(5, "Blue");
     hash_map2.put(6, "Orange");
     System.out.println("\nValues in second map: " + hash_map2);
     hash_map2.putAll(hash_map1);
     System.out.println("\nNow values in second map: " + hash_map2);
   }
 }
