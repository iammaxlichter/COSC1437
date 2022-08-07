package CHAPTER2;

import java.util.Scanner;
public class MinutesConversion {
    public static void main(String[] args) {
        
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter number of minutes to convert >> ");
        int minutes = inputDevice.nextInt();

        inputDevice.close();

        double hours = minutes / 60.0;
        double days = minutes / 1440.0;

        System.out.println(minutes + " minutes is " + hours + " hours or " + days + " days.");

    }
}
