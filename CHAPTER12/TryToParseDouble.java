package CHAPTER12;

import java.util.Scanner;

public class TryToParseDouble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num;

        try {
            System.out.print("Enter a number: ");
            num = Double.parseDouble(scan.nextLine());
        } 

        catch (NumberFormatException e) {
            num = 0;
            System.out.println("Value entered cannot be converted to a floating-point number.");
        }

        scan.close();
        System.out.println("Value entered: " + num);
    }
}