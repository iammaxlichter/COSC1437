package CHAPTER4;

import java.time.*;
public class TenThousandDaysOld {
    public static void main(String[] args) {
       
        LocalDate jul24 = LocalDate.of(2003,7,24);

        System.out.println("I will be 10000 days old on " + jul24.plusDays(10000));
    }
}
