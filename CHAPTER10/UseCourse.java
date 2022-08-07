package CHAPTER10;
import java.util.*;

public class UseCourse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String dept;
		String[] labCourses = { "BIO", "CHM", "CIS", "PHY" };
		int id;
		double credits;
		int found = 0;
		System.out.print("Enter department: ");
		dept = input.nextLine();
		System.out.print("Enter id: ");
		id = Integer.parseInt(input.nextLine());
		System.out.print("Enter credits: ");
		credits = Double.parseDouble(input.nextLine());
		found = -1;
		for (int i = 0; i < labCourses.length; i++) {
			if (labCourses[i].equals(dept)) {
				found = i;
				break;
			}
		}
		if (found == -1) {
			CollegeCourse course = new CollegeCourse(dept, id, credits);
			course.display();
		}
		else {
			LabCourse course = new LabCourse(dept, id, credits);
			course.display();
		}
        input.close();
	}
}
