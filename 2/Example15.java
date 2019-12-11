import java.util.*;

public class Example15 
{
   public static void main(String[] args) 
   {
    int n=6;
    for (int i = 0; i < n; i++)
     {
        for (int j = 0; j < n;j++)
         {
            if (i == 0 || i == n - 1 || j == n - 1 - i)
             
                System.out.print("*");
             else 
                System.out.print(" ");
        }
        System.out.println();
    }
  }
}


