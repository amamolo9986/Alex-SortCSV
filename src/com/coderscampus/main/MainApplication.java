package com.coderscampus.main;

import java.io.IOException;

public class MainApplication {

	public static void main(String[] args) throws IOException {
		FileService fileService = new FileService();
		Student[] studentArray = fileService.readStudents();
		StudentService studentService = new StudentService();
		studentService.studentWriter(studentArray);
		
	}

}
