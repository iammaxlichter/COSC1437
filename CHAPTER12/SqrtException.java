package CHAPTER12;

import java.util.Scanner;

public class SqrtException {

    public static void main(String[] args) {

        int number;

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number :");
        number=sc.nextInt();
        sc.close();
        
        try {
            if(number>=0) {
                System.out.println("The Square Root of "+number+" is :"+Math.sqrt(number));
            }
            else {
                System.out.print("Can't take square root of negative number");
                throw (new ArithmeticException());
            }
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception :"+e);
        }

        
    }

}

