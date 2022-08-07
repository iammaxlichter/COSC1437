package CHAPTER5;

import java.util.Scanner;
public class AscendingAndDescending {
    public static void main(String[] args) {
        Scanner InputDevice = new Scanner(System.in);
        System.out.print("Enter an integer... ");
        int int1 = InputDevice.nextInt();
        System.out.print("And another... ");
        int int2 = InputDevice.nextInt();
        System.out.print("And just one more... ");
        int int3 = InputDevice.nextInt();

        InputDevice.close();

        if ((int1 > int2) && (int1 > int3)){
            if (int2 > int3){
                System.out.println("Ascending: " + int3 + " " + int2 + " " + int1);
                System.out.println("Descending: " + int1 + " " + int2 + " " + int3);
            }
            else{
                System.out.println("Ascending: " + int2 + " " + int3 + " " + int1);
                System.out.println("Descending: " + int1 + " "  + int3 + " " + int2);
            }
        }
        else if ((int2 > int1) && (int2 > int3)){
            if (int1 > int3){
                System.out.println("Ascending: " + int3 + " " + int1 + " " + int2);
                System.out.println("Descending: " + int2 + " "  + int1 + " "  + int3);
            }
            else{
                System.out.println("Ascending: " + int1 + " " + int3 + " " + int2);
                System.out.println("Descending: " + int2 + " " + int3  + " "  + int1);
            }
        }
        else if ((int3 > int1) && (int3 > int2)){
            if (int1 > int2){
                System.out.println("Ascending: " + int2 + " " + int1 + " " + int3);
                System.out.println("Descending: " + int3 + " "  + int1 + " "  + int2);
            }
            else{
                System.out.println("Ascending: " + int1 + " " + int2 + " " + int3);
                System.out.println("Descending: " + int3  + " " + int2 + " "  + int1);
            }
        }


    }
}
