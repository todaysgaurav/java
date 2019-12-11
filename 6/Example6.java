import java.util.*;
class Example6
 {
  public static void main(String[] args)
   {
    LinkedList<String> list=new LinkedList<String>();
    list.add("Ankit");
    list.add("Karuna");
    list.add("Nitin");
    list.add("Naman");
    list.add("Deepak");
    list.add("Swati");
    System.out.print("Original linked list is : ");
    System.out.println(list);
    //Object first=list_getFirst();
     Object first = list.getFirst();
    Object last=list.getLast();
    System.out.println("First element is : "+first);
    System.out.println("Last element is : "+last);
   }
 }
