package org.Examples.StudentManagement;

import java.util.*;

/**
 * Student management app that runs and displays all options
 * wrapped in a try block to catch for errors with each case handling
 * a different option in the console
 */
public class StudentManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        sms.loadDataFromFile(); // Load data at the beginning

        boolean running = true;
        while (running) {
            try {
                System.out.println("\nStudent Management System Menu:");
                System.out.println("1. Add Student");
                System.out.println("2. Add Course");
                System.out.println("3. Enroll Student in Course");
                System.out.println("4. Display All Students");
                System.out.println("5. Save Data to File");
                System.out.println("6. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter student ID: ");
                        int studentId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter student name: ");
                        String studentName = scanner.nextLine();
                        sms.addStudent(studentId, studentName);
                        break;

                    case 2:
                        System.out.print("Enter course ID: ");
                        int courseId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter course name: ");
                        String courseName = scanner.nextLine();
                        System.out.print("Enter instructor name: ");
                        String instructor = scanner.nextLine();
                        sms.addCourse(courseId, courseName, instructor);
                        break;

                    case 3:
                        System.out.print("Enter student ID to enroll: ");
                        int studentEnrollId = scanner.nextInt();
                        System.out.print("Enter course ID to enroll in: ");
                        int courseEnrollId = scanner.nextInt();
                        sms.enrollStudentInCourse(studentEnrollId, courseEnrollId);
                        break;

                    case 4:
                        sms.displayAllStudents();
                        break;

                    case 5:
                        sms.saveDataToFile();
                        break;

                    case 6:
                        running = false;
                        System.out.println("Exiting the system.");
                        break;

                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please try again.");
                scanner.nextLine(); // Consume invalid input
            }
        }

        scanner.close();
    }
}
