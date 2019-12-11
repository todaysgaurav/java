class MyThread implements Runnable
 {
  public void run()
   {
    for(int i=0;i<5;i++)
     {
      System.out.println("Ankit");
     }
     System.out.println("This block is executed by : "+Thread.currentThread().getName());
   }
 }
class Example2
{
 public static void main(String[] args)
  {
   MyThread t=new MyThread();
   Thread t1=new Thread(t);
   t1.start();
   for(int i=0;i<5;i++)
    {
      System.out.println("Vijay");
    }
     System.out.println("This block is executed by : "+Thread.currentThread().getName());
  }
}
