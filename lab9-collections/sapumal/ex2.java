package sapumal;

import java.util.ArrayList;
import java.util.List;

public class ex2 {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Peter", 3.7);
		Student s2 = new Student(2, "Jenna", 2.9);
		Student s3 = new Student(3, "Ann", 3.8);
		
		List<Student> StudentList = new ArrayList<>();
		
		StudentList.add(s1);
		StudentList.add(s2);
		StudentList.add(s3);
		
		for(Student s: StudentList){
			s.printDetails();
		}
	}
}
