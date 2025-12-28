package controller;

import java.io.*;
import java.util.*;
import entity.Student; // Importing your Student entity

/**
 * Controller responsible for analyzing attendance data and identifying students at risk.
 */
public class AttendanceAnalyzer {

    /**
     * Default constructor
     */
    public AttendanceAnalyzer() {
    }

    /**
     * Placeholder attribute from your diagram
     */
    public String Attribute1;

    /**
     * Implementation: Generates a list of students whose attendance is below the required threshold.
     * Corrected return type to List<Student>.
     * @return List of students requiring a warning
     */
    public List<Student> GenerateWarningList() {
        // TODO implement here
        System.out.println("Analyzing system-wide attendance to generate warning list...");
        
        List<Student> warningList = new ArrayList<>();
        
        // Simulating logic: If a student's attendance is below a threshold (e.g., 75%), add them to the list
        // In a real scenario, you would iterate through all students and call CalculateAttendancePercent(id)
        
        return warningList;
    }

    /**
     * Implementation: Calculates the attendance percentage for a specific student.
     * @param StudentID The ID of the student
     * @return Float percentage (0.0 to 100.0)
     */
    public Float CalculateAttendancePercent(String StudentID) {
        // TODO implement here
        System.out.println("Calculating attendance percentage for Student ID: " + StudentID);
        
        // Simulating calculation logic
        // Total Sessions attended / Total Sessions scheduled * 100
        float mockPercentage = 82.5f; 
        
        return mockPercentage;
    }

}