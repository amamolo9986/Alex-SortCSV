package com.coderscampus.main;

import java.io.IOException;
import java.util.Arrays;

public class StudentService {

	public void studentWriter(Student[] studentArray) throws IOException {
		Arrays.sort(studentArray, new Student());

		Student[] compsciArray = new Student[34];
		Student[] apmthArray = new Student[33];
		Student[] statArray = new Student[33];

		int c = 0;
		int a = 0;
		int s = 0;

		for (Student student : studentArray) {
			if (student.getCourse().contains("COMPSCI")) {
				compsciArray[c++] = student;
			}
			if (student.getCourse().contains("APMTH")) {
				apmthArray[a++] = student;
			}
			if (student.getCourse().contains("STAT")) {
				statArray[s++] = student;
			}
		}
		assignStudentsToCourseFile(compsciArray, "course1.csv");
		assignStudentsToCourseFile(apmthArray, "course2.csv");
		assignStudentsToCourseFile(statArray, "course3.csv");
	}

	public void assignStudentsToCourseFile(Student[] students, String fileName) throws IOException {
		FileService fileService = new FileService();
		fileService.writeStudentsToFile(students, fileName);
	}

}
