package com.coderscampus.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileService {

	public Student[] readStudents() throws IOException {

		Student[] student = new Student[100];

		try (BufferedReader reader = new BufferedReader(new FileReader("studentlist.csv"))) {
			String line;

			reader.readLine();
			int i = 0;
			while ((line = reader.readLine()) != null) {
				String[] studentData = line.split(",");
				Integer studentID = Integer.parseInt(studentData[0]);
				String studentName = studentData[1];
				String course = studentData[2];
				Integer grade = Integer.parseInt(studentData[3]);

				student[i] = new Student(studentID, studentName, course, grade);
				i++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return student;
	}

	public void writeStudentsToFile(Student[] students, String fileName) throws IOException {
		try (BufferedWriter outputWriter = new BufferedWriter(new FileWriter(fileName))) {
			outputWriter.write("Student ID" + ", Student Name" + ", Course" + ", Grade\n");

			for (int i = 0; i < students.length; i++) {
				outputWriter.write(students[i] + "");
				outputWriter.newLine();
			}
		}
	}

}
