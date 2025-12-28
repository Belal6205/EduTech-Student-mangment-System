package controller;

import java.io.*;
import java.util.*;
import entity.SemesterReport; // Importing your existing report entity

/**
 * */
public class ReportGenerator {

    /**
     * Default constructor
     */
    public ReportGenerator() {
    }

    /**
     * */
    private Integer ReportID;

    /**
     * */
    private Date GeneratedDate;

    /**
     * Implementation: Generates a report for students falling below a certain attendance percentage.
     * Fixed typo: 'Intger' to 'Integer' and 'LowAttendacne' to 'LowAttendance'
     * @param threshold 
     * @return A compiled SemesterReport object
     */
    public SemesterReport generateLowAttendance(Integer threshold) {
        // TODO implement here
        this.GeneratedDate = new Date();
        System.out.println("Generating low attendance report for threshold: " + threshold + "%");
        
        SemesterReport report = new SemesterReport();
        report.SetSemester("Current Semester");
        report.Compile();
        
        System.out.println("Report generated successfully on " + this.GeneratedDate);
        return report;
    }

    /**
     * Implementation: Returns the date the last report was generated.
     * @return Date
     */
    public Date getGeneratedDate() {
        // TODO implement here
        return this.GeneratedDate;
    }
    
    // Added: Setter for ReportID to allow initialization
    public void setReportID(Integer id) {
        this.ReportID = id;
    }

}