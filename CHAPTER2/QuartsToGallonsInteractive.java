package CHAPTER2;

import java.util.Scanner;
class QuartsToGallonsInteractive
{
   public static void main(String[] args) 
   {   
      // Modify the code below
      Scanner inputDevice = new Scanner(System.in);
      System.out.println("Enter quarts needed >> ");
      int quartsNeeded = inputDevice.nextInt();
      final int QUARTS_IN_GALLON = 4;
      int gallonsNeeded;
      int extraQuartsNeeded;
      gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
      extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
      System.out.println("A job that needs " + quartsNeeded +
         " quarts requires " + gallonsNeeded + " gallons plus " +
         extraQuartsNeeded + " quarts."); 
      inputDevice.close();
   }
}
