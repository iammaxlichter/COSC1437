package CHAPTER3;

import java.util.Scanner;
class JobPricing {
    public static void main(String[] args) {
        String description;
        double materials, hoursOnJob, hoursTraveling, price;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter job description >> ");
        description = input.nextLine();
        System.out.print("Enter cost of materials >> ");
        materials = input.nextDouble();
        System.out.print("Enter hours on the job work >> ");
        hoursOnJob = input.nextDouble();
        System.out.print("Enter hours traveling >> ");
        hoursTraveling = input.nextDouble();

        price = computePrice(materials, hoursOnJob, hoursTraveling);

        System.out.println("The price for " + description + " is $" + price);
        
        input.close();
    }

    public static double computePrice(double materials, double hours, double travel) {
        double HoursMoney = hours * 35;
        double TravelMoney = travel * 12;
        return materials+HoursMoney+TravelMoney;
    }
}