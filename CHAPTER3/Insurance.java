package CHAPTER3;

import java.util.Scanner;
class Insurance {
    public static void main (String args[]) {
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Enter the current year >> ");
        int curr= inputDevice.nextInt();
        System.out.print("Enter the birth year >> ");
        int birth= inputDevice.nextInt();
        inputDevice.close();

        double Money = calculatePremium(curr, birth);
        System.out.println("The premium is $" + Money);
    }

    public static int calculatePremium(int curr, int birth) {
        int mon = (curr - birth)/10;
        return (mon+15)*20;
    }
}
