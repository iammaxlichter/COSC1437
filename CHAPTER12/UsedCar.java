package CHAPTER12;

public class UsedCar {

    String vin;
    String make;
    int year;
    int mileage;
    int price;
    
    public final static String DEFAULT_VIN = "9999";
    final int VIN_NUM_LENGTH = 4;
    final int LOW_YEAR = 1997;
    final int HIGH_YEAR = 2017;
    final String[] MAKES = {"Ford", "Honda", "Toyota", "Chrysler", "Other"};
    
    public UsedCar(String vin, String carMake,int carYear, int miles, int pr) throws UsedCarException {
        
        if(vin.length()!=VIN_NUM_LENGTH)
            throw new UsedCarException(vin+ " is not four digits.");

        else if(!(carMake.equalsIgnoreCase("Ford")||
            carMake.equalsIgnoreCase("Honda")||
            carMake.equalsIgnoreCase("Toyota")||
            carMake.equalsIgnoreCase("Chrysler")||
            carMake.equalsIgnoreCase("Other")))
            {
            throw new UsedCarException(carMake+" is not valid make....");
            }

        else if (carYear<LOW_YEAR || carYear>HIGH_YEAR) 
            {
            throw new UsedCarException(carYear+ " must be between "+LOW_YEAR+" and "+HIGH_YEAR);
            }

        else if(pr<0)
            {
            throw new UsedCarException(pr+" must be a positive value.");
            }

        else {
            this.vin = vin;
            this.year = carYear;
            this.make = carMake;
            this.mileage = miles;
            this.price = pr;
            }
    }
        
    public UsedCar() {

        vin =DEFAULT_VIN;
        year =LOW_YEAR;
        make ="";
        mileage =0;
        price =0;

    }

    public String getVin() {
        return vin;
    }

    public String toString() {
        return "VIN " + vin + " Make: " + make + "\n Year: " + year + " " + mileage + " miles $" + price;
    }
}
    