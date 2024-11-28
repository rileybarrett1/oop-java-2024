package org.Examples.StudentManagement;

import java.io.*;
import java.util.*;

/**
 * Student management system that Stores all the info and
 * adds/creates a csv file and pushes the info to the csv
 * with multiple user info checks to make sure the data
 * entered is correct
 */
public class StudentManagementSystem {
    private final Map<Integer, Student> students;
    private final Map<Integer, Course> courses;
    private static final String DATA_FILE = "students_data.csv";

    /**
     * Creates a empty hashmap for students and courses
     */
    public StudentManagementSystem() {
        students = new HashMap<>();
        courses = new HashMap<>();
    }

    /**
     * adds a student using the id and name while
     * checking to see if the id is already taken
     * @param studentId
     * @param studentName
     */
    public void addStudent(int studentId, String studentName) {
        if (students.containsKey(studentId)) {
            System.out.println("Error: Student ID already exists.");
        } else {
            Student student = new Student(studentId, studentName);
            students.put(studentId, student);
        }
    }

    /**
     * adds a course using a course id a course name
     * and an instructor , the id is also checked to
     * see if the id is a duplicate
     * @param courseId
     * @param courseName
     * @param instructor
     */
    public void addCourse(int courseId, String courseName, String instructor) {
        if (courses.containsKey(courseId)) {
            System.out.println("Error: Course ID already exists.");
        } else {
            Course course = new Course(courseId, courseName, instructor);
            courses.put(courseId, course);
        }
    }

    /**
     * enroll a student in a course using an student id
     * and a course id while checking if either is empty
     * it also checks when getting the information
     * if the information is there or correct
     * @param studentId
     * @param courseId
     */
    public void enrollStudentInCourse(int studentId, int courseId) {
        Student student = students.get(studentId);
        Course course = courses.get(courseId);
        if (student == null) {
            System.out.println("Error: Student not found.");
        } else if (course == null) {
            System.out.println("Error: Course not found.");
        } else {
            student.addCourse(course);
            System.out.println("Student enrolled in course successfully.");
        }
    }

    // Display all students and their courses
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            students.values().forEach(Student::displayStudentInfo);
        }
    }

    /**
     * this was very confusing for me , not being what I remember from python
     * a new buffered writer object saved into a csv file then a for loop to write/store
     * id and name and another for loop to store the course info if this fails
     * you get an error
     */
    public void saveDataToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATA_FILE))) {
            for (Student student : students.values()) {
                writer.write(student.getStudentId() + "," + student.getStudentName() + "\n");
                for (Course course : student.getCourses()) {
                    writer.write(student.getStudentId() + "," + course.getCourseId() + "," + course.getCourseName() + "\n");
                }
            }
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    /**
     * load the data into the csv using the buffered reader object
     * while splitting the data to make it more readable for the user
     * depending on the length while also checking if an error happens in
     * the process
     */
    public void loadDataFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 2) {
                    int studentId = Integer.parseInt(data[0]);
                    String studentName = data[1];
                    addStudent(studentId, studentName);
                } else if (data.length == 3) {
                    int studentId = Integer.parseInt(data[0]);
                    int courseId = Integer.parseInt(data[1]);
                    String courseName = data[2];

                    addCourse(courseId, courseName, "Instructor TBD");
                    enrollStudentInCourse(studentId, courseId);
                }
            }
            System.out.println("Data loaded successfully.");
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid data format in file.");
        }
    }
}
