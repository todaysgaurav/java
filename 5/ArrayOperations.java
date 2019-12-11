class array
 {
  int t1=0,h1,l1;
  double d1;
  int getTotal(int[] arr)
   {
     for(int i=0;i<arr.length;i++)
      t1+=arr[i];
     return t1;
   }
  double getAverage(int[] arr)
   {
    int m=arr.length;
    double k=t1/m;
    return k;
   }
  int getHighest(int[] arr)
   {
    int b=arr[0];
    for(int i=0;i<arr.length;i++)
     if(b<arr[i])
      b=arr[i];
    return b;
   }
  int getLowest(int[] arr)
   {
    int b=arr[0];
    for(int i=0;i<arr.length;i++)
     if(b>arr[i])
      b=arr[i];
    return b;
   }
 }
class ArrayOperations
 {
  public static void main(String[] args)
   {
     int[] arr={10,20,30,40,5,90,2};
     array a=new array();
     int t=a.getTotal(arr);
     double d=a.getAverage(arr);
     int h=a.getHighest(arr);
     int l=a.getLowest(arr);
     System.out.println("Total is : "+t+" Average is : "+d+" Highest is : "+h+" Lowest is : "+l);
   }
 }
