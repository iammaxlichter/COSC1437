package CHAPTER4;

import java.time.*;

public class TestMonthHandling {
    public static void main(String[] args) {

        LocalDate jan31 = LocalDate.of(LocalDate.now().getYear(),1,31);
        LocalDate dec31 = LocalDate.of(LocalDate.now().getYear(),12,31);

        System.out.println("First date " + jan31.toString());
        System.out.println("Second date " + jan31.plusMonths(1));
        System.out.println("Third date " + jan31.plusMonths(2));
        System.out.println("Fourth date " + jan31.plusMonths(3));

        System.out.println("First date " + dec31.toString());
        System.out.println("Second date " + dec31.plusMonths(1));
        System.out.println("Third date " + dec31.plusMonths(2));
        System.out.println("Fourth date " + dec31.plusMonths(3));
    }
}
