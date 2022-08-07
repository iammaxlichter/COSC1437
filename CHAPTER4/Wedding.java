package CHAPTER4;

import java.time.*;
public class Wedding {

    private Couple couple;
    private LocalDate weddingDate;
    private String location;

    public Wedding(Couple c, LocalDate date, String loc) {
        this.couple = c;
        this.weddingDate = date;
        this.location = loc;
    }
    public Couple getCouple() {
        return couple;
    }
    public LocalDate getWeddingDate() {
        return weddingDate;
    }
    public String getLocation() {
        return location;
    }
}