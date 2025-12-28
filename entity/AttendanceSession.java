package entity;

import java.io.*;
import java.util.*;

/**
 * */
public class AttendanceSession {

    /**
     * Default constructor
     */
    public AttendanceSession() {
    }

    /**
     * */
    private String SessionID;

    /**
     * */
    private String CourseID;

    /**
     * */
    private String Status;



    /**
     * Implementation: Checks if the current status is set to "Open"
     * @return Boolean true if status is open, false otherwise
     */
    public Boolean IsOpen() {
        // TODO implement here
        return "Open".equalsIgnoreCase(this.Status);
    }

    /**
     * Implementation: Sets the session status to "Open"
     */
    public void open() {
        // TODO implement here
        this.Status = "Open";
    }

    /**
     * Implementation: Sets the session status to "Closed"
     */
    public void Close() {
        // TODO implement here
        this.Status = "Closed";
    }

    /**
     * Implementation: Returns the unique Session ID
     * @return String SessionID
     */
    public String GetSessionID() {
        // TODO implement here
        return this.SessionID;
    }

    /**
     * Implementation: Returns the current Status string
     * @return String Status
     */
    public String GetStatus() {
        // TODO implement here
        return this.Status;
    }

    /**
     * Implementation: Manually updates the Status
     * @param Status
     */
    public void SetStatus(String Status) {
        // TODO implement here
        this.Status = Status;
    }

    // Added: Getter and Setter for CourseID to support standard Java operations
    public String GetCourseID() {
        return this.CourseID;
    }

    public void SetCourseID(String CourseID) {
        this.CourseID = CourseID;
    }

    // Added: Setter for SessionID to allow initialization
    public void SetSessionID(String SessionID) {
        this.SessionID = SessionID;
    }

}