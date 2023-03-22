package com.coderscampus.main;

import java.util.Comparator;

public class Student implements Comparator<Student> {

	private Integer studentID;
	private String studentName;
	private String course;
	private Integer grade;

	public Student(int studentID, String studentName, String course, int grade) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.course = course;
		this.grade = grade;
	}

	public Student() {
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return studentID + ", " + studentName + ", " + course + ", " + grade;
	}

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student2.getGrade(), student1.getGrade());
	}


}
