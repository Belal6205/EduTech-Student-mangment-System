package boundary;

import java.io.*;
import java.util.*;

/**
 * Boundary class representing the Faculty (Lecturer) interface.
 */
public class Faculty {

    /**
     * Default constructor
     */
    public Faculty() {
    }

    /**
     * Unique identifier for the Faculty member
     */
    private String FacultyID;

    /**
     * Name of the Faculty member
     */
    private String Name;

    /**
     * Department associated with the Faculty member
     */
    private String Department;

    /**
     * Implementation: Requests attendance statistics for evaluation.
     */
    public void RequestStatistics() {
        // TODO implement here
        System.out.println("Faculty " + Name + " is requesting department statistics for: " + Department);
    }

    /**
     * Implementation: Initiates the creation of a new attendance session.
     * @param CourseID
     */
    public void CreateSession(String CourseID) {
        // TODO implement here
        System.out.println("Faculty " + Name + " is starting a new session for course: " + CourseID);
        // This would call SessionController.CreateSession(CourseID)
    }

    /**
     * Implementation: Ends an ongoing attendance session.
     * @param SessionID
     */
    public void EndSession(String SessionID) {
        // TODO implement here
        System.out.println("Faculty " + Name + " is ending Session ID: " + SessionID);
        // This would call SessionController.CloseSession(SessionID)
    }

    /**
     * Implementation: Requests a real-time view of students marking attendance.
     */
    public void requestLiveAttendance() {
        // TODO implement here
        System.out.println("Requesting live attendance feed...");
    }

    /**
     * Implementation: Selects a specific session from a list of history or active sessions.
     * @param SessionID
     */
    public void SelectSession(String SessionID) {
        // TODO implement here
        System.out.println("Session " + SessionID + " has been selected by Faculty.");
    }
    
    // Added: Setters to initialize Faculty member details
    public void setFacultyDetails(String id, String name, String dept) {
        this.FacultyID = id;
        this.Name = name;
        this.Department = dept;
    }
}