package com.student.management;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();

        while (true) {
            System.out.println("\n== Student Management System ==");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            // Fix: Consume invalid input if non-integer is entered
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); 
                continue;
            }
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    sm.addStudent();
                    break;
                case 2:
                    sm.displayStudents();
                    break;
                case 3:
                    sm.searchStudent();
                    break;
                case 4:
                    sm.updateMarks();
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close(); 
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
