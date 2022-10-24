package lab;

import java.util.ArrayList;

public class exercise2{
	public static void main(String args[]) {
		Student student = new Student(1,"Ayu",3);
		Student student1 = new Student(2,"Kushan",3);
		Student student2 = new Student(3,"Hello",4);
		ArrayList <Student> studentList = new ArrayList<Student>();
		studentList.add(student);
		studentList.add(student1);
		studentList.add(student2);
		for(Student s : studentList) {
			System.out.println(s.studentID);
			System.out.println(s.name);
			System.out.println(s.gpa);
		}		
	}
}

class Student {
	public int studentID;
	public String name;
	public int gpa;
	Student(int id,String n, int g ){
		this.studentID = id;
		this.name = n;
		this.gpa = g;
	}
}