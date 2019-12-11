import java.util.*;
class Example7
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
    Scanner in=new Scanner(System.in);
    System.out.print("Enter to search ");
    String str=in.nextLine();
    if(list.contains(str))
     System.out.println("Found");
    else
     System.out.println("Not Found");
   }
 }
