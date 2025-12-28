package controller;

import java.io.*;
import java.util.*;

/**
 * */
public class StatisticsCalculator {

    /**
     * Default constructor
     */
    public StatisticsCalculator() {
    }


    /**
     * Implementation: Calculates total number of present students for a course.
     * @param CourseID 
     * @return Total attendance count
     */
    public Integer CalculateAttendance(String CourseID) {
        // TODO implement here
        System.out.println("Calculating total attendance for Course: " + CourseID);
        // Simulation: returning a dummy count
        return 45; 
    }

    /**
     * Implementation: Calculates the percentage of students absent.
     * @param CourseID 
     * @return Absence rate as a percentage (e.g., 12.5)
     */
    public Float CalculateAbsecentRate(String CourseID) {
        // TODO implement here
        System.out.println("Calculating absence rate for Course: " + CourseID);
        // Simulation: returning a dummy rate
        return 12.5f;
    }

    /**
     * Nested Class Implementation: Handles administrative requests.
     */
    public class AcademicAffairs {

        /**
         * Default constructor
         */
        public AcademicAffairs() {
        }

        /**
         * */
        private String StaffID;

        /**
         * */
        private String Name;

        /**
         * Implementation: Simulates sending a request for low-attendance warnings.
         */
        public void RequestWarning() {
            // TODO implement here
            System.out.println("Staff " + Name + " (ID: " + StaffID + ") has requested a warning report for students with low attendance.");
        }
        
        // Added: Setters to allow the program to identify the staff member
        public void setStaffDetails(String id, String name) {
            this.StaffID = id;
            this.Name = name;
        }
    }
}