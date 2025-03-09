package com.student.management;

public class Student {
	private int rollNo;
    private String name;
    private String course;
    private double marks;
    
    // Constructor
    public Student(int rollNo, String name, String course, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }
 // Getter and Setter methods
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    // Displaying student details
    public void displayStudent() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Course: " + course + ", Marks: " + marks);
    }
}
