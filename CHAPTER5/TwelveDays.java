package CHAPTER5;

import java.util.*;
public class TwelveDays {
    Scanner input = new Scanner(System.in);
    public static void main (String args[]) {
        int choice = getChoice();

        System.out.println("\nOn the " + choice + "th day of Christmas\nMy true love gave to me");
        switch(choice){
            case 12 :
            System.out.println("Twelve drummers drumming");
            case 11:
            System.out.println("Eleven pipers piping");
            case 10 :
            System.out.println("Ten lords a-leaping");
            case 9:
            System.out.println("Nine ladies dancing");
            case 8 :
            System.out.println("Eight maids a-milking");
            case 7:
            System.out.println("Seven swans a-swimming");
            case 6 :
            System.out.println("Six geese a-laying");
            case 5:
            System.out.println("Five golden rings");
            case 4 :
            System.out.println("Four calling birds");
            case 3:
            System.out.println("Three french hens");
            case 2 :
            System.out.println("Two turtle doves and");
            case 1:
            System.out.println("A partridge in a pear tree");
            }
            
    }
    public static int getChoice() {
        Scanner SC = new Scanner(System.in);
        System.out.print("From what day do you want to start the song The Twelve Days of Christmas?\n\n>> ");
        int choice = SC.nextInt();
        SC.close();
        return choice;

    }
}


