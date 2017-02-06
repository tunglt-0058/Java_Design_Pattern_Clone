// hoc theo java design pattern tutorial

package com.letattung.dao;

import java.util.ArrayList;

public class StudentDaoImpl implements StudentDao{

	ArrayList<Student> students;
	
	public StudentDaoImpl() {
		students = new ArrayList<>();
		Student student1 = new Student("tung",0);
		Student student2 = new Student("tien", 1);
		students.add(student1);
		students.add(student2);
	}
	
	@Override
	public ArrayList<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		return students.get(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
	}

}