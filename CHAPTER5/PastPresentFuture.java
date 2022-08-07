package CHAPTER5;

import java.util.*;
public class PastPresentFuture {
    public static void main (String args[]) {

        int year,month;

        Calendar now = Calendar.getInstance();

        int thisYear = now.get(Calendar.YEAR);
        int thisMonth = now.get(Calendar.MONTH) + 1;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month >> ");
        month = scanner.nextInt();

        System.out.print("Enter a year (four digits) >> ");
        year = scanner.nextInt();

        scanner.close();

        if(thisYear==year){

            if(month==thisMonth){
                System.out.println(month + " is this month");
            }

            else if(month<thisMonth){
                System.out.println(month + " was a month earlier this year");
            }

            else if(month>thisMonth){
               System.out.println(month + " is a month later this year");
            }
        }

        else{
            System.out.println(year + " is not this year");
        }

    }

}

