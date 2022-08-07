package CHAPTER2;

import java.util.Scanner;
class ChilliToGoProfit {
    public static void main(String[] args) {
       
        Scanner inputDevice = new Scanner(System.in);

        System.out.println("Enter number of adult meals ordered >> ");
        int AdultMeals = inputDevice.nextInt();

        System.out.println("Enter number of child meals ordered >> ");
        int ChildMeals = inputDevice.nextInt();

        inputDevice.close();
        
        final double AdultCost = 7.0;
        final double ChildCost = 4.0;

        double totalChild = ChildMeals * ChildCost;
        double totalAdult = AdultMeals * AdultCost;

        double AdultProfit = totalAdult - (AdultMeals * 4.35);
        double ChildProfit = totalChild - (ChildMeals * 3.10);

        System.out.println(AdultMeals + " adult meals were ordered at " + AdultCost + " each.");
        System.out.println("\tTotal is " + totalAdult);
        System.out.println(ChildMeals + " adult meals were ordered at " + ChildCost + " each.");
        System.out.println("\tTotal is " + totalChild);

        System.out.println("Grand total for all meals is " + (totalChild + totalAdult));

        System.out.println("Profits:");
        System.out.println("\tAdult profit is " + AdultProfit);
        System.out.println("\tChild profit is " + ChildProfit);
        System.out.println("Total profit is " + (AdultProfit + ChildProfit));



    }
}
