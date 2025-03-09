package com.student.management;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentManagement {
	    private ArrayList<Student> students = new ArrayList<>();
	    private Scanner scanner = new Scanner(System.in);

	 // Adding  Student
	    public void addStudent() {
	        System.out.print("Enter Roll No: ");
	        int rollNo = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        System.out.print("Enter Name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter Course: ");
	        String course = scanner.nextLine();

	        System.out.print("Enter Marks: ");
	        double marks = scanner.nextDouble();

	        students.add(new Student(rollNo, name, course, marks));
	        System.out.println("Student added successfully!\n");
	    }
	    // Displaying All Students
	    public void displayStudents() {
	        if (students.isEmpty()) {
	            System.out.println("No students found!\n");
	            return;
	        }
	        for (Student s : students) {
	            s.displayStudent();
	        }
	    }
	    // Search Student by Roll No
	    public void searchStudent() {
	        System.out.print("Enter Roll No to search: ");
	        int rollNo = scanner.nextInt();

	        for (Student s : students) {
	            if (s.getRollNo() == rollNo) {
	                s.displayStudent();
	                return;
	            }
	        }
	        System.out.println("Student not found!\n");
	    }
	    
	    // Update Student Marks
	    public void updateMarks() {
	        System.out.print("Enter Roll No to update marks: ");
	        int rollNo = scanner.nextInt();

	        for (Student s : students) {
	            if (s.getRollNo() == rollNo) {
	                System.out.print("Enter new Marks: ");
	                double newMarks = scanner.nextDouble();
	                s.setMarks(newMarks);
	                System.out.println("Marks updated successfully!\n");
	                return;
	            }
	        }
	        System.out.println("Student not found!\n");
	    }

}
