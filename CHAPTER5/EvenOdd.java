package CHAPTER5;

import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {
        Scanner InputDevice = new Scanner(System.in);
        System.out.print("Enter a number >> ");
        int number = InputDevice.nextInt();

        InputDevice.close();

        boolean Answer = isEven(number);
        if(Answer == true){
            System.out.println(number + " is even");
        }
        else{
            System.out.println(number + " is odd");
        }
    }
    public static boolean isEven(int number) {
        if(number % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
