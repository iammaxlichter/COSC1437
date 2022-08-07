package CHAPTER4;

import java.time.*;
public class FitnessTracker {
    String activity;
    int minutes;
    LocalDate date;
 
    public FitnessTracker() {
        this.activity = "running";
        this.minutes = 0;
        this.date =  LocalDate.of(2022, 1, 1);  
    }

    public FitnessTracker(String a, int m, LocalDate d) {
        this.activity = a;
        this.minutes = m;
        this.date = d;
    }
    public String getActivity() {
        return activity;
    }
    public int getMinutes() {
        return minutes;
    }
    public LocalDate getDate() {
        return date;
    }
}
