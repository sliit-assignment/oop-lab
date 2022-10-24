package lab;

import java.util.HashMap;
import java.util.Scanner;

public class exercise4{
	public static void main(String args[]) {
		Student student = new Student(1,"Ayu",3);
		Student student1 = new Student(2,"Kushan",3);
		Student student2 = new Student(3,"Hello",4);
		HashMap<Integer,Student> studentList = new HashMap<Integer,Student>();
		
		studentList.put(student.studentID,student);
		studentList.put(student1.studentID,student1);
		studentList.put(student2.studentID,student2);
	
		Scanner in = new Scanner(System.in);
		int id = in.nextInt();
		System.out.println(studentList.get(id).studentID);
		System.out.println(studentList.get(id).name);
		System.out.println(studentList.get(id).gpa);
	}
}

