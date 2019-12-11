/* For this assignment you will design a set of classes that work
together to simulate a police officer issuing a parking ticket */
 class ParkedCar 
  {
 
	 String make;
	 String model;
	 String color;
	 String license;
	 static int minutes;
 
	public ParkedCar() 
	
	{
 
	}
 
	public ParkedCar(String carMake, String carModel, String carColor, String carLicense, int carMinutes) 
	{
 
		make = carMake;
		model = carModel;
		color = carColor;
		license = carLicense;
		minutes = carMinutes;
	}
 
	public String getMake() 
	{
		return make;
	}
	public String getModel() 
	{
		return model;
	}
	public String getColor() 
	{
		return color;
	}
	public String getLicense() 
	{
		return license;
	}
	public static int getMinutes() 
	{
		return minutes;
	}
 
	public String toString() 
	{
 
		String string = "Make: " + make
				+ "\nModel: " + model
				+ "\nColor: " + color
				+ "\nLicense Plate: " + license;
			return string;
 
	}
 
 
}


 class ParkingMeter 
{
 
	 static int minPurchased;
 
	public ParkingMeter() 
	{
 
	}
 
	public ParkingMeter(int carMinPurchased) 
	{
 
		minPurchased = carMinPurchased;
	}
 
	public static int getMinPurchased() 
	{
		return minPurchased;
	}
 
	public String toString()
	 {
		String string = "Minutes Purchased: " + minPurchased;
		return string;
	}
}


 class ParkingTicket 
{
 
		 ParkedCar vehicle;
		 PoliceOfficer copster;
		 double fine;
		 int minutes;
		 double firstFine = 25;
		 double moreFine = 10;
 
		public ParkingTicket(ParkedCar car, PoliceOfficer cop, double manFine, int mins) 
		{
 
			vehicle = car;
			copster = cop;
			fine = manFine;
			minutes = mins;
		}
 
		public void getTotalFine()
		 {
			int  time = ParkedCar.getMinutes() - ParkingMeter.getMinPurchased();
 
			if(time <= 60)
			 {
				fine = firstFine;
			 }
			else 
			{
				fine = firstFine + moreFine * (time / 60);
			}
		 }
 
		public double getFirstFine()
		 {
			return firstFine;
		 }
		public double getMoreFine() 
		{
			return moreFine;
		}
		public ParkedCar getVehicle() 
		{
			return vehicle;
		}
		public PoliceOfficer getCopster() 
		{
			return copster;
		}
		public int getMinutes() 
		{
			return minutes;
		}
		public double getFine() 
		{
			return fine;
		}
 
 
	}


 class PoliceOfficer 
{
 
	 String name;
	 int badge;
	 static double ticket;
 
	public PoliceOfficer() 
	{
 
	}
 
	public PoliceOfficer(String poName, int poBadge) 
	{
 
		name = poName;
		badge = poBadge;
	}
 
	public String getName() 
	{
		return name;
	}
	public int getBadge() 
	{
		return badge;
	}
 
	static  double search(ParkedCar car, ParkingMeter meter) 
	{
 
		int  time = ParkedCar.getMinutes() - ParkingMeter.getMinPurchased();
 
		if(ParkedCar.getMinutes() > ParkingMeter.getMinPurchased()) 
		{
			if(time <= 60) 
			{
				ticket = 25;
			}
 
		      else 
		      {
			ticket = 25 + (10 * (time/60));
		      }
		}
		return ticket;
 
	}
 
}


public class Example4 
    {
 
	public static void main(String[] args) 
	{
 
		ParkedCar car = new ParkedCar("Swift", "Dzire", "Black", "124-9", 100);
 
		ParkingMeter meter = new ParkingMeter(10);
 
		PoliceOfficer john = new PoliceOfficer("Vijay", 786);
 
		double ticket = PoliceOfficer.search(car, meter);
 
		if(ticket >0) 
		{
			System.out.println(ticket);
		}
		else 
		{
			System.out.println("Car is not doing anything wrong!");
		}
	}
 
}


