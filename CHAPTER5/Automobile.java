package CHAPTER5;

public class Automobile {
    private int id;
    private String make;
    private String model;
    private String color;
    private int year;
    private double mpg;

    public Automobile(int id, String make, String model, String color,
                      int year, double mpg) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mpg = mpg;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setYear(int yr) {
        this.year = yr;
    }
    public void setMpg(double mpg) {
        this.mpg = mpg;
    }
    public int getId() {
        if (id > 9999 || id <=0){
            id = 0;
        }
        return id;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        if (year > 2019 || year < 2005){
            year = 0;
        }
        return year;
    }
    public double getMpg() {
        if (mpg < 10 || mpg > 60){
            mpg = 0;
        }
        return mpg;
    }
}