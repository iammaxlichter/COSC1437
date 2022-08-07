package CHAPTER8;

import java.util.*;

public class DistanceFromAverage {
    public static void main(String[] args) {

        double[] value = new double[15];
        double entry;
        int x = 1;
        int y = 0;
        double total = 0;
        double avg;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the interger or enter 99999 for quiting >> ");
        entry = input.nextDouble();

        if(entry == 99999){
            System.out.println("Error, You have not entered any value");
        }

        while(entry != 99999 && x < value.length) {

            value[x] = entry;
            total = total + entry;
            System.out.print("Enter the interger or enter 99999 for quiting >> ");
            entry = input.nextDouble();

            if(entry == 99999)
                break;
                x++;
        }
        
        avg = total / x;
        System.out.println("You have " + x + " integers and the average found is " + avg);
        
        input.close();
        
        for (y = 1; y <= x; y++) {
            System.out.println(value[y] + " is " + (value[y] - avg) + " away from the average");
        }

        
    }
}

