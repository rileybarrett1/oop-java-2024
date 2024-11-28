package org.Examples.StudentManagement;

import java.util.*;

public class Student {
    private int studentId;
    private String studentName;
    private Set<Course> courses;

    // Constructor
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courses = new HashSet<>();
    }

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    // Add a course
    public void addCourse(Course course) {
        this.courses.add(course);
    }

    // Display student information
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Courses Enrolled:");
        for (Course course : courses) {
            course.displayCourseInfo();
        }
    }
}
