package CHAPTER7;

import java.util.Scanner;

public class ValidatePassword {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        do {

            System.out.print("Enter password: ");
            String password="";
            password=scanner.nextLine();

            int upperFound=0,lowerFound=0,digitFound=0;

            for(char c:password.toCharArray()) {
                if(Character.isUpperCase(c))
                    upperFound++;
                else if(Character.isLowerCase(c))
                    lowerFound++;
                else if(Character.isDigit(c))
                    digitFound++;
            }

            String errorMessage="";
            if(upperFound<2)
                errorMessage+="\nuppercase letters";
            if(lowerFound<3)
                errorMessage+="\nlowercase letters";
            if(digitFound<1)
                errorMessage+="\ndigits";

            if((errorMessage.length())>=1)
                System.out.println("The password did not have enough of the following: "+errorMessage);
            else {
                System.out.println("Valid password");
                break;
            }
        } while(true);
        scanner.close();
    }
}