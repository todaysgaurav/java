import java.util.*;
class Example3
 {
  public static void main(String[] args)
   {
       List<String> list_Strings = new ArrayList<String>();
       list_Strings.add("Red");
       list_Strings.add("Green");
       list_Strings.add("Orange");
       list_Strings.add("White");
       list_Strings.add("Black");
       System.out.println(list_Strings);
       list_Strings.clear();
       System.out.print("After making empty array list is");
       System.out.println(list_Strings);
   }
 }
