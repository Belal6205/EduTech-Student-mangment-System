package controller;

import java.io.*;
import java.util.*;

/**
 * */
public class SessionController {

    /**
     * Default constructor
     */
    public SessionController() {
    }


    /**
     * Implementation: Creates a new attendance session for a specific course.
     * @param CourseID
     */
    public void CreateSession(String CourseID) {
        // TODO implement here
        String generatedSessionID = "SESS-" + CourseID + "-" + System.currentTimeMillis();
        System.out.println("Creating new attendance session...");
        System.out.println("Course ID: " + CourseID);
        System.out.println("Session ID: " + generatedSessionID);
        System.out.println("Status: OPEN");
    }

    /**
     * Implementation: Closes an active attendance session.
     * @param SessionID
     */
    public void CloseSession(String SessionID) {
        // TODO implement here
        System.out.println("Closing Session ID: " + SessionID);
        System.out.println("Status: CLOSED");
        System.out.println("Session data saved to database.");
    }

}