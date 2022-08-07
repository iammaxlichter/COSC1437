package CHAPTER7;

import java.util.Scanner;

public class PhoneNumberFormat {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);

        String str = "";
        String formatted = "";
        float num = 0;

        do {

            System.out.println("Enter an area code and phone number");
            System.out.println("as a series of 10 digits");
            System.out.println("Enter 999 to quit");
            str = SC.next();

            num = Float.parseFloat(str);

            if (str.length() == 10) {
                formatted = "(" + str.substring(0, 3) + ") " + str.substring(3,6) + "-"+str.substring(6);
                System.out.println("The number is  "+formatted + "\n");
                } 

            else if(num != 999) {
                System.out.println("Phone number must be 10 digits");
            }
        } while(num != 999);
        SC.close();
    }
}
