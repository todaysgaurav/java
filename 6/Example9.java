import java.util.*;
class Example9
 {
  public static void main(String... args)
   {
    HashSet<String> list1=new HashSet<String>();
    list1.add("Ankit");
    list1.add("Karuna");
    list1.add("Nitin");
    list1.add("Naman");
    list1.add("Deepak");
    list1.add("Swati");
    HashSet<String> list2=new HashSet<String>();
    list2.add("Amal");
    list2.add("Viraat");
    list2.add("Arti");
    list2.add("Jyoti");
    list2.add("Pragya");
    list2.add("Swati");
    System.out.print("fist Hash set is  : ");
    System.out.println(list1); 
    System.out.print("Second Hash set is  : ");
    System.out.println(list2);
    HashSet<String>result_set = new HashSet<String>();
         for (String element : list1){
             System.out.println(list2.contains(element) ? "Yes" : "No");
          }      
   }
 }
