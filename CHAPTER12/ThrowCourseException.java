package CHAPTER12;

public class ThrowCourseException {

    public static void main(String[] args) throws CourseException {
    
    Course course1 = new Course("DE1", 101, 0.7f);
    System.out.print(course1);

    System.out.println("Course1 create successfully");
    
    Course course2 = new Course("DE2", 102, 0.8f);
    System.out.print(course2);
    System.out.println("Course2 create successfully");
    
    Course course3 = new Course("DE3", 103, 0.9f);
    System.out.print(course3);

    System.out.println("Course3 create successfully");
    
    Course course4 = new Course("DE4", 104, 1.0f);
    System.out.print(course4);

    System.out.println("Course4 create successfully");
    
    Course course5 = new Course("DE5", 105, 1.1f);
    System.out.print(course5);

    System.out.println("Course5 create successfully");
    
    Course course6 = new Course("DE6", 99, 1.2f);
    System.out.print(course6);

    System.out.println("Course6 create successfully");
    
    }
}
