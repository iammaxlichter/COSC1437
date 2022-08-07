package CHAPTER5;

import java.util.Scanner;
public class ShadyRestRoom {
    public static void main (String args[]) {
       
        Scanner SC = new Scanner(System.in);
        System.out.print("(1) Queen bed\n(2) King bed\n(3) Suite with a king bed and pull-out couch\nEnter Selection (1, 2, or 3) >> ");
        int NUM = SC.nextInt();
        
        SC.close();

        if (NUM == 1){
            System.out.println("You selected Queen Bed $125");
        }
        else if (NUM == 2){
            System.out.println("You selected King Bed $139");
        }
        else if (NUM == 3){
            System.out.println("You selected King Bed and pullout couch $165");
        }
        else{
            System.out.println("You selected an invalid option");
        }
    }
}
