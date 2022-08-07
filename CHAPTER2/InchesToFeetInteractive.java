package CHAPTER2;

import java.util.Scanner;
class InchesToFeetInteractive
{    
  public static void main(String[] args) {

     final int INCHES_IN_FOOT = 12;

     Scanner inputDevice = new Scanner(System.in);
     System.out.println("Enter inches >> ");
     int inches = inputDevice.nextInt();

     int feet;
     int inchesLeft;
     feet = inches / INCHES_IN_FOOT;
     inchesLeft = inches % INCHES_IN_FOOT;
     System.out.println(inches + " inches is " + feet + " feet and " + inchesLeft + " inches"); 
     
     inputDevice.close();
  }
}
