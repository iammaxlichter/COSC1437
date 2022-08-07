package CHAPTER2;

import java.util.Scanner;
class Dollars {
    public static void main(String[] args) {
       
         Scanner inputDevice = new Scanner(System.in);
         System.out.println("Enter $ of dollars you want to convert >> ");
         int money = inputDevice.nextInt();

         inputDevice.close();
         
         int Twenty = money / 20;
         int Ten = (money - (20 * Twenty)) / 10;
         int Five = (money - ((20 * Twenty) + (10 * Ten))) / 5;
         int One = (money - ((20 * Twenty) + (10 * Ten) + (5 * Five)));

         System.out.println("$" + money + " converted is " + Twenty + " $20s, " + Ten + " $10s, " + Five + " $5s, and " + One + " $1s.");


    }
}