package CHAPTER3;

import java.util.Scanner;
public class PaintCalculator {
    public static void main (String args[]) {
        

        
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Enter length >> ");
        double length= inputDevice.nextDouble();
        System.out.print("Enter width >> ");
        double width= inputDevice.nextDouble();
        System.out.print("Enter height >> ");
        double height= inputDevice.nextDouble();

        inputDevice.close();

        double price = computeArea(length, width, height);
        System.out.println("The price to paint the room is $"+price);

    }

    public static double computeArea(double length, double width, double height) {
        double area = (2*length*height) + (2*width*height);
        double gallons = computeGallons(area);
        System.out.println("You will need "+gallons+" gallons");
        return 32.0*Math.ceil(gallons);
    }
    public static double computeGallons(double area) {
        return area/350;
    }
}