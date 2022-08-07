package CHAPTER6;

import java.util.Scanner;

public class RetirementGoal2 {

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        double years=0;
        double amount=0;
        
        do{
            System.out.print("How many years until retirement? >> ");
            years=scan.nextDouble();
        }while (years <=0);

        do{
            System.out.print("How much can you save annually? >> ");
            amount=scan.nextDouble();
        }while (amount <=0);


        double previousAmount=amount;
        double totalAmount=0;

        for(int i=1;i<=years;i++)
        {
            double simpleInterest=(previousAmount*4*1)/100;
            totalAmount=simpleInterest +previousAmount;
            previousAmount =totalAmount+amount;
        }

        System.out.println("You will have total amount at retirement $"+totalAmount);
        scan.close();
    }
}
