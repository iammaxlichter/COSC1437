package CHAPTER4;

public class BloodData {
    private String bloodType;
    private String rhFactor;

    public BloodData() {
        this.bloodType = "O";
        this.rhFactor = "+";
    }
    public BloodData(String bType, String rh) {
        this.bloodType = bType;
        this.rhFactor = rh;
    }
    public void setBloodType(String bType) {
        this.bloodType = bType;
    }
    public String getBloodType() {
        return bloodType;
    }
    public void setRhFactor(String rh) {
        this.rhFactor = rh;
    }
    public String getRhFactor() {
        return rhFactor;
    }
}
