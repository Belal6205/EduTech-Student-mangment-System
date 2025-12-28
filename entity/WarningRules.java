package entity;

import java.io.*;
import java.util.*;

/**
 * */
public class WarningRules {

    /**
     * Default constructor
     */
    public WarningRules() {
    }

    /**
     * The minimum percentage required before a warning is triggered
     */
    private Integer AttendanceThreshold;

    /**
     * The message to be sent to the student
     */
    private String WarningMessage;

    /**
     * Implementation: Compares the provided percentage against the threshold.
     * @param Precent The student's current attendance percentage
     * @return Boolean true if they are BELOW the threshold (eligible for a warning)
     */
    public Boolean CheckEligibility(Float Precent) {
        // TODO implement here
        if (AttendanceThreshold == null || Precent == null) {
            return false;
        }
        // If current percentage is less than the threshold, they get a warning
        return Precent < AttendanceThreshold;
    }

    // Added: Getter for WarningMessage to use in the notification system
    public String GetWarningMessage() {
        return this.WarningMessage;
    }

    // Added: Setter for Threshold
    public void SetAttendanceThreshold(Integer Threshold) {
        this.AttendanceThreshold = Threshold;
    }

    // Added: Setter for WarningMessage
    public void SetWarningMessage(String Message) {
        this.WarningMessage = Message;
    }

}