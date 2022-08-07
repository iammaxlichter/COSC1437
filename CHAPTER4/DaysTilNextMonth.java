package CHAPTER4;

import java.time.*;
public class DaysTilNextMonth {
    public static void main(String[] args) {
        
        LocalDate currentDate = LocalDate.now();

        int dayOfMonth = currentDate.getDayOfMonth();
        int daysInMonth = currentDate.lengthOfMonth();

        int leftDays = daysInMonth - dayOfMonth;

        LocalDate nextMonth = currentDate.plusDays(leftDays + 1);

        System.out.println("There are " + leftDays + " days until " + nextMonth.getMonth() + " starts.");

    }
}
