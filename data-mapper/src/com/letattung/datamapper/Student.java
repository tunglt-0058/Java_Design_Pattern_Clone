/*
 * hoc theo design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/data-mapper
 */
package com.letattung.datamapper;

import java.io.Serializable;

public final class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int studentId;
	private String name;
	private char grade;
	
	public Student(final int studentId, final String name, final char grade) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.grade = grade;
	}
	
	public void setStudentId(int studentId){
		this.studentId = studentId;
	}
	
	public int getStudentId(){
		return studentId;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setGrade(char grade){
		this.grade = grade;
	}
	
	public char getGrade(){
		return grade;
	}
	
	 @Override
	 public boolean equals(final Object inputObject){
		 
		 boolean isEqual = false;
		 if (this == inputObject){
			 isEqual = true;
		 } else if (inputObject != null && getClass() == inputObject.getClass()){
			 final Student inputStudent = (Student) inputObject;
			 if (this.getStudentId() == inputStudent.getStudentId()){
				 isEqual = true;
			 }
		 }
		 return isEqual;
	 }
	 
	 @Override
	 public int hashCode(){
		 return this.getStudentId();
	 }
	 @Override
	 public String toString(){
		 return "Student [studentId=" + studentId + ", name=" + name + ", grade=" + grade + "]";
	 }
}
