package controller;

import java.io.*;
import java.util.*;
import entity.TrendReport;       // Import Entity
import entity.AttendanceRecord;  // Import Entity

/**
 * */
public class TrendAnalyzer {

    /**
     * Default constructor
     */
    public TrendAnalyzer() {
    }

    /**
     * Implementation: Analyzes a list of records to generate a Trend Report.
     * @param Records List of attendance records to analyze
     * @return A new TrendReport object
     */
    public TrendReport Analyze(List<AttendanceRecord> Records) {
        // TODO implement here
        System.out.println("Analyzing " + Records.size() + " attendance records for trends...");
        
        TrendReport report = new TrendReport();
        report.setReportID("TR-" + System.currentTimeMillis());
        
        // Simulating analysis logic
        String summary = "Trend Analysis Result: Consistent attendance observed across the sample.";
        report.SetSummary(summary);
        report.Generate();
        
        return report;
    }

    /**
     * Implementation: Compares two semesters and returns a summary string.
     * @param semster1 
     * @param semester2 
     * @return Comparison summary
     */
    public String compareSemesters(String semster1, String semester2) {
        // TODO implement here
        String comparison = "Comparing " + semster1 + " vs " + semester2 + ": ";
        // Simulating comparison logic
        comparison += "Attendance improved by 5% in the second semester.";
        
        return comparison;
    }

}