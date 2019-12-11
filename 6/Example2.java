import java.util.Scanner;
class Test
 {
  int[] ank={12,13,14,15,16,17};
  void display()
   {
    System.out.print("Array elements are : ");
    for(int i=0;i<ank.length;i++)
     System.out.print(ank[i]+" ");
    System.out.println();
   }
   void update()
    {
     Scanner in=new Scanner(System.in);
     System.out.print("Enter index and value of new thing : ");
     int m=in.nextInt();
     int h=in.nextInt();
     ank[m]=h;
    }
 }
class Example2
 {
  public static void main(String[] args)
   {
     Test t=new Test();
     t.display();
     t.update();
     t.display();
   }
 }
