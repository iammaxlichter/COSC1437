package CHAPTER6;

import java.util.Scanner;
public class Inbetween {
    public static void main (String args[]) {
        
        int num1,num2, larger = 0, smaller = 0;

        Scanner SC = new Scanner(System.in);
        System.out.print("Enter an integer >> ");
        num1 = SC.nextInt();
        System.out.print("Enter another integer >> ");
        num2 = SC.nextInt();

        SC.close();
        
        if (num1 > num2){
            larger = num1;
            smaller = num2;
        }
        else if (num2 > num1){
            larger = num2;
            smaller = num1;
        }

        int temp = smaller;

        if (larger-smaller == 1){
            System.out.println("There are no integers between " +  num1 + " and " + num2);
        }
        else{
            System.out.print("The numbers between " + num1 + " " + num2 + " include: ");
            for(smaller = temp; smaller < larger-1 ; smaller++){
                System.out.print((smaller + 1) + " ");
            }
        }

    }
}

