package CHAPTER5;

import java.util.*;
public class TestApartments {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        Apartment apt1 = new Apartment(101, 2, 1, 725);
        Apartment apt2 = new Apartment(102, 2, 1.5, 775);
        Apartment apt3 = new Apartment(103, 3, 2, 870);
        Apartment apt4 = new Apartment(104, 3, 2.5, 960);
        Apartment apt5 = new Apartment(105, 3, 3, 1100);
        int bdrms;
        int baths;
        double rent;
        int count = 0;
        System.out.print("Enter minimum number of bedrooms needed >> ");
        bdrms = input.nextInt();
        System.out.print("Enter minimum number of bathrooms needed >> ");
        baths = input.nextInt();
        System.out.print("Enter maximum rent willing to pay >> ");
        rent = input.nextDouble();
        System.out.println("\nApartments meeting citeria of\nat least " + bdrms +
                           " bedrooms, at least " + baths + " baths, and " + " no more than $" +
                           rent + " rent:");

		Apartment[] apartments = {apt1,apt2,apt3,apt4,apt5};
	
		for (int i = 0; i < apartments.length; i++) {
			if(checkApt(apartments[i], bdrms, baths, rent)) {
				display(apartments[i]);
				count++;
			}
		}
		if(count == 0) {
			System.out.println("No apartments met your criteria.");
		}
		
		input.close();
    }


    public static boolean checkApt(Apartment apt, int bdrms, double baths, double rent) {

		if(apt.getBedrooms() >= bdrms && apt.getBaths() >= baths && apt.getRent() <= rent) {
			return true;
		}
		return false;
        
    }
    public static void display(Apartment apt) {
        System.out.println("   Apt #" + apt.getAptNumber() + "    " + apt.getBedrooms() +
                           " bedrooms, and " + apt.getBaths() + " baths. Rent $" + apt.getRent());
    }
}


