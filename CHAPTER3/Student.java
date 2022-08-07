package CHAPTER3;

public class Student{
    int ID;
    int credit_hrs;
    int num_of_pts;
    
    double gpa;

    public Student() {
        this.ID=9999;
        this.num_of_pts=12;
        this.credit_hrs=3;
    }
    
    

    public void setIdNumber(int ID) {
        this.ID = ID;
    }

    public void setHours(int credit_hrs) {
        this.credit_hrs = credit_hrs;
    }

    public void setPoints(int num_of_pts) {
        this.num_of_pts = num_of_pts;
    }

    public int getIdNumber() {
        return ID;
    }

    public int getHours() {
        return credit_hrs;
    }

    public int getPoints() {
        return num_of_pts;
    }
    
    public double getGradePoint() {
        this.gpa=(double)this.num_of_pts/this.credit_hrs;
        return gpa;
        
    }

    
    public void showIdNumber(){
        System.out.println("ID Number is: "+ID);
    }
    
    public void showHours(){
        System.out.println("Credit Hours: "+credit_hrs);
    }
    
    public void showPoints(){
        System.out.println("Points Earned: "+num_of_pts);
    }
}
