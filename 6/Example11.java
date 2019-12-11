import java.util.*;
class Example11
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
    System.out.print("Without clone Tree set is : ");
    System.out.println(list1); 
    TreeSet<String> list2 = (TreeSet<String>)list1.clone();
    System.out.println("Clones Tree set is : "+list2);
   }
 }
