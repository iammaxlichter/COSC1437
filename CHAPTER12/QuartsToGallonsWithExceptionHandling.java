package CHAPTER12;

import java.util.Scanner;
class QuartsToGallonsWithExceptionHandling {
     
    public static void main(String[] args) 
    {  
        final int QUARTS_IN_GALLON = 4;
        int quartsNeeded = 18;
        int gallonsNeeded;
        boolean valid = false;
        int extraQuartsNeeded;
        String s;

        Scanner input = new Scanner(System.in);

        while (!valid) {
            try {
                System.out.print("Enter quarts needed >> ");
                s = input.nextLine();
                quartsNeeded = Integer.parseInt(s);
                valid = true;
            } catch (Exception e) {
                System.out.println("Invalid data entry");
            }
        }
            
        gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
        extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
        System.out.println("A job that needs " + quartsNeeded +
            " quarts requires " + gallonsNeeded + " gallons plus " +
            extraQuartsNeeded + " quarts.");
        input.close();
    }
}

