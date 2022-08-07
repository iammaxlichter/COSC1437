package CHAPTER5;

public class JobApplicant {

    private String name, phone;
    private boolean hasWordSkill, hasSpreadsheetSkill, hasDatabaseSkill, hasGraphicsSkill;

    public JobApplicant(String name, String phone, boolean w, boolean s, boolean d, boolean g) {
        this.name = name;
        this.phone = phone;
        this.hasWordSkill = w;
        this.hasSpreadsheetSkill = s;
        this.hasDatabaseSkill = d;
        this.hasGraphicsSkill = g;
    }
    public String getName() {
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public boolean getHasWordSkill() {
        return hasWordSkill;
    }
    public boolean getHasSpreadsheetSkill() {
        return hasSpreadsheetSkill;
    }
    public boolean getHasDatabaseSkill() {
        return hasDatabaseSkill;
    }
    public boolean getHasGraphicsSkill() {
        return hasGraphicsSkill;
    }
}