package CHAPTER6;

import java.util.Scanner;
public class RetirementGoal
{
   public static void main (String[] args) {
        Scanner SC = new Scanner(System.in);

        int years = 1, annual = 0;

        while (true){
            System.out.print("How many years until retirement? >> ");
            years = SC.nextInt();
            System.out.print("How much can you save annually? >> ");
            annual = SC.nextInt();


            if (years <= 0 || annual <= 0){
                System.out.print("How many years until retirement? >> ");
                years = SC.nextInt();
                System.out.print("How much can you save annually? >> ");
                annual = SC.nextInt();
    
            }
            if (years >= 1 && annual >= 1){
                break;
            }
            SC.close();
        }


        System.out.println("If you save $" + annual + " for " + years + " years, you will have $" + (years*annual));

   
}

}