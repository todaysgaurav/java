import java.util.*;
class Example10
 {
  public static void main(String[] args)
   {
    TreeSet<String> list1=new TreeSet<String>();
    list1.add("Ankit");
    list1.add("Karuna");
    list1.add("Nitin");
    list1.add("Naman");
    list1.add("Deepak");
    list1.add("Swati");
    TreeSet<String> list2=new TreeSet<String>();
    list2.add("Amal");
    list2.add("Viraat");
    list2.add("Arti");
    list2.add("Jyoti");
    list2.add("Pragya");
    list2.add("Swati");
    System.out.print("fist Tree set is  : ");
    System.out.println(list1); 
    System.out.print("Second Tree set is  : ");
    System.out.println(list2);
    list1.addAll(list2);
    System.out.print("After adding elements are : ");
    System.out.println(list1);
   }
 }
