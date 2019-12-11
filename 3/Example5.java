/*
For this assignment, you will design a set of classes that
work together to simulate a car's fuel gauge and odometer.
 */
 class FuelGauge
  {
   static final int MAXIMUM_GALLONS=15;
   private int gallons;
   public FuelGauge() 
   {
        gallons = 0;
   }
   public FuelGauge (int gallons)
    {
     if(gallons<=MAXIMUM_GALLONS)
      {
       this.gallons=gallons;
      }
     else
       {
        this.gallons=MAXIMUM_GALLONS;
       }
    }
    public int getGallons()
     {
      return gallons;
     }
    public void addGallons()
     {
      if(gallons<MAXIMUM_GALLONS)
       {
        gallons++;
       }
      else
       {
        System.out.println("Fuel is overflowing");
       }
     }
    public void burnFuel()
     {
      if(gallons>0)
       {
        gallons--;
       }
      else
       {
        System.out.println("Out of Fuel");
       }
     }
  }
class Odometer
 {
    public final int MAXIMUM_MILEAGE = 999999;
    public final int MPG = 24;
    private int initialMileage;
    private int mileage;
    private FuelGauge fuelGauge;
     public Odometer(int mileage, FuelGauge fuelGauge) 
     {
        this.initialMileage = mileage;
        this.mileage = mileage;
        this.fuelGauge = fuelGauge;
     }
     public int getMileage() 
     {
        return mileage;
     }
    public void addMileage() 
    {

        if (mileage < MAXIMUM_MILEAGE) 
        {
            mileage++;
        } 
        else 
        {
            mileage = 0;
        }
         int driven = initialMileage - mileage;
        if (driven % MPG == 0) 
        {
            fuelGauge.burnFuel();
        }
     }
 }
public class Example5
 {
  public static void main(String args[])
   {
   // CarInstrumentSimulator carInstrumentSimulator = new CarInstrumentSimulator();

    FuelGauge fuel =  new FuelGauge();
    Odometer odometer = new Odometer(0, fuel); 

    for (int x = 0; x < FuelGauge.MAXIMUM_GALLONS; x++) 
    {
        fuel.addGallons();
    }

    while (fuel.getGallons() > 0) 
    {
        odometer.addMileage();
        System.out.println("Mileage: " + odometer.getMileage());
        System.out.println("Fuel level: " + fuel.getGallons() + " gallons");
        System.out.println("------------------------------");
   }
  }
 }
