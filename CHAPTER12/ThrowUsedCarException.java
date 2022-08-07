package CHAPTER12;

public class ThrowUsedCarException {
    public static void main(String[] args) throws UsedCarException {

        UsedCar[] usedCars = new UsedCar[7];
        
        try {
        usedCars[0] = new UsedCar("45", "Ford", 2009, 78, 890);
        }
        catch (UsedCarException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            usedCars[1] = new UsedCar("1234", "Ford", 2019, 178, 5006);
        }
        catch (UsedCarException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            usedCars[2] = new UsedCar("2222", "Tata", 2010, 176, 1890);
        }
        catch (UsedCarException ex) {
            System.out.println(ex.getMessage());
        }

        try {
        usedCars[3] = new UsedCar("3333", "Toyota", 2011, 718, 8190);
        }
        catch (UsedCarException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            usedCars[4] = new UsedCar("1245", "Other", 2015, 728, 8930);
        }
        catch (UsedCarException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            usedCars[5] = new UsedCar("4511", "Chrysler", 1977, 738, 8920);
        }
        catch (UsedCarException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            usedCars[6] = new UsedCar("4522", "Make1", 1998, 748, 8690);
        }
        catch (UsedCarException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("\nConstructed Cars:");
        for (int i = 0; i <usedCars.length ; i++) {
            if(usedCars[i]!=null)
                System.out.println(usedCars[i]);
        
        }
    }
}