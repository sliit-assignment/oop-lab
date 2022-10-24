package sapumal;

public class Student {
	private int studentID;
	private String name;
	private double gpa;
	
	public Student(int studentID, String name, double gpa) {
		this.studentID = studentID;
		this.name = name;
		this.gpa = gpa;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public String getName() {
		return name;
	}
	
	public double getGPA() {
		return gpa;
	}
	
	public void printDetails() {
		System.out.println("Student ID: " + studentID);
		System.out.println("Name: " + name);
		System.out.println("GPA: " + gpa);
		System.out.println();
	}
}
