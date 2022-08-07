package CHAPTER8;

import java.util.*;
public class CarCareChoice2 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            boolean isMatch = false;
            String[] items = {"oil change","tire rotation","battery check","brake inspection"};

            int[] prices = {25,22,15,5};
            int x;
            int matchIndex =0;

            String menu = "Enter selection:";
            String item="";
            String userItem="";

            for(x=0; x<items.length ;++x) {
                menu +="\n" + items[x];
            }

            System.out.println(menu);
            String selection = input.nextLine();

            for(x=0;x < items.length;x++){

                for(int i=0;i<3;i++){
                item += items[x].charAt(i);
                userItem += selection.charAt(i);
                }

                if(userItem.equals(item)){
                isMatch = true;
                matchIndex = x;
                }

                item ="";
                userItem="";
            }

            

            if(isMatch) {
                System.out.println(selection + " price is $ " +prices[matchIndex]);
            }
            else{
                System.out.println("Invalid Entry");
            }
        }
    }
}