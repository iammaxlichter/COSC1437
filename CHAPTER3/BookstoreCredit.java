package CHAPTER3;

import java.util.Scanner;
public class BookstoreCredit {
    public static void main (String args[]) {
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Enter your name >> ");
        String name = inputDevice.nextLine();

        System.out.print("Enter your GPA >> ");
        double gpa = inputDevice.nextDouble();

        inputDevice.close();

        computeDiscount(name, gpa);
    }

    public static void computeDiscount(String name, double gpa) {
        
        double credit = gpa * 10.0;

        System.out.print(name + ", your GPA is " + gpa + ", so your credit is $" + credit);

    }

}
