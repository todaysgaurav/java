import java.util.*;
class Example5
 {
  public static void main(String[]  args)
   {
    LinkedList<String> list=new LinkedList<String>();
    list.add("Ankit");
    list.add("Karuna");
    list.add("Nitin");
    list.add("Naman");
    list.add("Deepak");
    list.add("Swati");
    System.out.println(list);
    System.out.println("Now add a extra element  Krati ");
    list.add("krati");
    System.out.print("Now linked list is : ");
    System.out.println(list);
   }
 }
