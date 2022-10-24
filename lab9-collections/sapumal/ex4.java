package sapumal;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		// creating map of students		
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		
		// creating students	
		Student s1 = new Student(1, "Peter", 3.7);
		Student s2 = new Student(2, "Jenna", 2.9);
		Student s3 = new Student(3, "Ann", 3.8);
		
		// adding students to map
		map.put(s1.getStudentID(), s1);
		map.put(s2.getStudentID(), s2);
		map.put(s3.getStudentID(), s3);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Student ID: ");
		int id = input.nextInt();
		
		Student st = map.get(id);
		st.printDetails();
		
//		for(Entry<Integer, Student> entry: map.entrySet()) {
//			int key = entry.getKey();
//			Student value = entry.getValue();
//		}
		
		input.close();
	}
}
