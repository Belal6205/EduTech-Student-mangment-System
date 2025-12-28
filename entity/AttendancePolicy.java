package entity;

import java.io.*;
import java.util.*;

public class AttendancePolicy {

    public AttendancePolicy() {
    }

    private String PolicyId;
    private Integer MinimumAttendancePercent;
    private String PolicyDescription;

    public String GetPolicyText() {
        return this.PolicyDescription; // Added implementation
    }

    public Boolean CheckEligibility(Float AttendancePercent) {
        if (MinimumAttendancePercent == null) return true;
        return AttendancePercent >= MinimumAttendancePercent; // Logic to check eligibility
    }

    public Integer GetMinimumAttendance() {
        return this.MinimumAttendancePercent; // Return the threshold
    }

    public void SetMinimumAttendance(Integer Value) {
        this.MinimumAttendancePercent = Value; // Set the threshold
    }
}