/* . Write a class named month. This class should have an int
field named monthNumber that holds the number of months.
For example, January would be 1. Feburary would be 2, and
so forth. In addition, provide this following methods.
 */
class Month {
    String[] monthName = { "January", "Februry", "March",
            "April", "May", "June", "July", "August", "September",
            "October", "November", "December" };
    int monthNumberInt = 0;
    public static String lastMonthCreate;
    public Month()
    {
        monthNumberInt = 1;
    }
public Month(int monthNumber)
    {
        if((monthNumber < 1 ) || ( monthNumber > 12)) {
        this.monthNumberInt = 1;
        } else {
            this.monthNumberInt = monthNumber;
        }

    }

    public Month(String monthName)
    {
        monthNumberInt = monthName.indexOf(monthName);
    }

    public int getMonthNumberInt() {
        return monthNumberInt;
    }

    public void setMonthNumberInt(int monthNumberInt) {
        this.monthNumberInt = monthNumberInt;
    }

    public String toString()
    {
       return  "monthName: " + monthName[monthNumberInt];
    }

    

    public boolean Equals(Month m)
    {
        if(this.monthNumberInt == m.getMonthNumberInt())
            return true;
        else
            return false;
    }

   
    public boolean GreatThan(Month m1)
    {
        if(monthNumberInt > m1.monthNumberInt)
            return true;
        else
            return false;
    }

    
    public boolean LesserThan(Month m1)
    {
        if(monthNumberInt < m1.monthNumberInt)
            return true;
        else
            return false;
    }
  }
 public class Example3
  {
  public static void main(String args[])
   {
    Month m;
    for(int i=0;i<12;i++)
     {
        m = new Month();
        m.setMonthNumberInt(i);
        System.out.println("Month " + m.getMonthNumberInt() + " is " + m);
     }
   }
 }
