class Test
 {
  private static Test t=null;
  private Test()
   {
    
   }
  public static Test getTest()
   {
    if(t==null)
     t=new Test();
    return t;
   }   
 }
class Example1
 {
  public static void main(String[] args)
   {
     Test tt=Test.getTest();
    // Test t1=new Test();
   }
 }
