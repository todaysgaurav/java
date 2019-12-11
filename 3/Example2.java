/* Make a LandTract class that has two fields, once for the
tract's length and one for the width. The class should have a
method that returns the tract's area, as well as an equals
method and a toString method. Demonstrate the class the
class in a program that asks the user to enter the
dimensions for the two tracts of land. The program should
display the area of each and indicate whether the tracts are
of equal size.
 */
import java.lang.*;
import java.util.*;
class LandTract
{
double length, width, area;
	public double area(double l, double w)
	{
		length=l;
		width=w;
		area=length*width;
		return area;
	}
	public void equals(LandTract lt)
	{
		if(lt.area==this.area)
		{
			System.out.println("Both land tracts have the same area.");
		}
		else
		{
			System.out.println("Both land tracts doesn't have the same area.");
		}
	}
	public String toString(double area)
	{
		return "Area of the first tract is: "+area;
	}
}
class Example2
{
	public static void main(String[] args)
	{
		double l1, w1, l2, w2;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the dimensions(length and width, respectively) of the first tract:");
		l1=in.nextDouble();
		w1=in.nextDouble();
		LandTract lt1=new LandTract();
		lt1.area(l1, w1);
		System.out.println("Enter the dimensions(length and width, respectively) of the second tract:");
		l2=in.nextDouble();
		w2=in.nextDouble();
		LandTract lt2=new LandTract();
		lt1.area(l2, w2);
		String s=new String(lt1.toString(lt1.area(l1, w1)));
		System.out.println(s);
		s=new String(lt2.toString(lt2.area(l2, w2)));
		System.out.println(s);
		lt1.equals(lt2);
	}
}
