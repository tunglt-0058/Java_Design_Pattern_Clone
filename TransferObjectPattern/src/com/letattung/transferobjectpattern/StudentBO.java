// hoc theo java design pattern tutorial

package com.letattung.transferobjectpattern;

import java.util.ArrayList;

public class StudentBO {

	ArrayList<StudentVO> students;
	
	public StudentBO() {
		students = new ArrayList<>();
		StudentVO student1 = new StudentVO("tung", 0);
		StudentVO student2 = new StudentVO("tien", 1);
		students.add(student1);
		students.add(student2);
	}
	
	public void deleteStudent(StudentVO student){
		students.remove(student.getRollNo());
		System.out.println("Student Roll No: " +student.getRollNo() + " deleted from database");
	}
	
	public ArrayList<StudentVO> getAllStudents(){
		return students;
	}
	
	public StudentVO getStudent(int rollNo){
		return students.get(rollNo);
	}
	
	public void updateStudent(StudentVO student){
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student Roll No: " + student.getRollNo() + " updated in the database");
	}
}
