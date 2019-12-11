import java.util.*;
class Example15
 {
  public static void main(String[] args)
   {
     TreeMap<String,String> tree_map1=new TreeMap<String,String>();
     tree_map1.put("1", "Red");
     tree_map1.put("2", "Green");
     tree_map1.put("3", "Black");
     tree_map1.put("4", "White");
     tree_map1.put("5", "Blue");
     tree_map1.put("6", "Orange");
     System.out.println("Values are : "+tree_map1);
     Set<String> keys = tree_map1.keySet();
        for(String key: keys)
         {
            System.out.println(key);
         }
   }
 }
