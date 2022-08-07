package CHAPTER5;

import java.util.Scanner;
public class ShadyRestRoom2 {
    public static void main (String args[]) {

        int QUEENPRICE = 125;
        int KINGPRICE = 139;
        int COUCHPRICE = 165;
        int INVALID = 0;
        int lake = 15;
       
        Scanner SC = new Scanner(System.in);
        System.out.print("(1) Queen bed\n(2) King bed\n(3) Suite with a king bed and pull-out couch\nEnter Selection (1, 2, or 3) >> ");
        int NUM = SC.nextInt();
        
        if (NUM == 1){
            System.out.println("Please choose a view:\n(1) lake view\n(2) park view");
            int choice = SC.nextInt();
            if (choice == 1){
                System.out.println("You selected Queen Bed with a lake view for $" + (lake + QUEENPRICE));
            }
            else if(choice == 2){
                System.out.println("You selected Queen Bed with a park view for $" + (QUEENPRICE));
            }
            else{
                System.out.println("You selected an invalid option $" + (lake + QUEENPRICE));
            }

        }
        else if (NUM == 2){
            System.out.println("Please choose a view:\n(1) lake view\n(2) park view");
            int choice = SC.nextInt();
            if (choice == 1){
                System.out.println("You selected King Bed with a lake view for $" + (lake + KINGPRICE));
            }
            else if(choice == 2){
                System.out.println("You selected King Bed with a park view for $" + (KINGPRICE));
            }
            else{
                System.out.println("You selected an invalid option $" + (lake + KINGPRICE));
            }


        }
        else if (NUM == 3){
            System.out.println("Please choose a view:\n(1) lake view\n(2) park view");
            int choice = SC.nextInt();
            if (choice == 1){
                System.out.println("You selected King Bed with a pullout couch with a lake view for $" + (lake + COUCHPRICE));
            }
            else if(choice == 2){
                System.out.println("You selected King Bed with a pullout couch with a park view for $" + (COUCHPRICE));
            }
            else{
                System.out.println("You selected an invalid option $" + (lake + COUCHPRICE));
            }

        }
        else{
            System.out.println("You selected an invalid optionn $" + INVALID);
        }

        SC.close();
    }
}
