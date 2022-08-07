package CHAPTER12;

public class Course {

    public Course(String department, int courseNumber, double credits) throws CourseException {
    
        if(department.length()!=3 || (courseNumber<100 || courseNumber>499) || (credits<0.5 || credits>6)) {
            throw new CourseException("Invalid details "+department+", "+courseNumber+", "+credits);
        }
    }
}