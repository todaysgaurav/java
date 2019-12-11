class Test
 {
    double total = 0;
    public double getTotal(double[][] array) 
    {
       for (int row = 0; row < array.length; row++) 
        {
          for (int col = 0; col < array[row].length; col++) 
           {
            total += array[row][col];
           }
         }
      return total;
     }
    public  double getAverage(double[][] array)
    {
      return getTotal(array) / getElementCount(array);
    }
   public double getRowTotal(double[][] array, int row) 
   {
    double total = 0;
    for (int col = 0; col < array[row].length; col++) 
     {
        total += array[row][col];
     }
    return total;
   }
 public double getColumnTotal(double[][] array, int col) 
  {
   double total = 0;
    for (int row = 0; row < array.length; row++) 
    {
        total += array[row][col];
    }
   return total;
  }
 public double getHighestInRow(double[][] array, int row) 
  {
    double highest = array[row][0];
    for (int col = 1; col < array[row].length; col++) 
    {
        if (array[row][col] > highest) 
         {
            highest = array[row][col];
         }
    }
   return highest;
 }

 public  double getLowestInRow(double[][] array, int row) 
 {
    double lowest = array[row][0];
    for (int col = 1; col < array[row].length; col++) 
    {
        if (array[row][col] < lowest) 
        {
            lowest = array[row][col];
        }
    }
    return lowest;
 }
 public int getElementCount(double[][] array) 
  {
    int count = 0;
    for (int row = 0; row < array.length; row++) 
    {
        count += array[row].length;
    }
    return count;
  }
}
class Array2Operations
 {
 public static void main(String[] args) 
  {
    Test t=new Test();
    double[][] studentTestScores = { { 65.5, 54.43, 23.54, 99.5 },{ 33.4, 22.55, 54.66, 11.12 } };
    System.out.println("Total : " + t.getTotal(studentTestScores));
    System.out.println("Average : " + t.getAverage(studentTestScores));
    System.out.println("Total of row 0 : "+ t.getRowTotal(studentTestScores, 0));
    System.out.println("Total of row 1 : "+ t.getRowTotal(studentTestScores, 1));
    System.out.println("Total of col 0 : "+ t.getColumnTotal(studentTestScores, 0));
    System.out.println("Total of col 1 : "+ t.getColumnTotal(studentTestScores, 2));
    System.out.println("Highest in row 0 : "+ t.getHighestInRow(studentTestScores, 0));
    System.out.println("Highest in row 1 : " + t.getHighestInRow(studentTestScores, 1));
    System.out.println("Lowest in row 0 : "+ t.getLowestInRow(studentTestScores, 0));
    System.out.println("Lowest in row 1 : " + t.getLowestInRow(studentTestScores, 1));
 }
}
