package CHAPTER3;

import java.util.Scanner;
public class Percentages {
    public static void main (String args[]) {

        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Enter first integer >> ");
        double x = inputDevice.nextDouble();
        System.out.println("Enter second integer >> ");
        double y = inputDevice.nextDouble();

        inputDevice.close();


        computePercent(x,y);
        computePercent(y,x);

    }
    public static void computePercent(double x, double y) {
        
        double percent = (x/y) * 100;
        System.out.println(x + " is " + percent + " percent of " + y);
    }
}

