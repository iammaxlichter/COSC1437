package CHAPTER10;

public class LabCourse extends CollegeCourse {

	public LabCourse(String dept, int id, double credits) {
		super(dept, id, credits);
		price += 50;
	}


	@Override
	public void display() {
		System.out.println(dept + id);
		System.out.println("Lab course");
		System.out.println(credits + " credits");
		System.out.println("Lab fee is $50");
		System.out.println("Total fee is $" + price);
	}
}
