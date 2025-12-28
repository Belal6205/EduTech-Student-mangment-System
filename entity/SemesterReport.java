package entity;

import java.io.*;
import java.util.*;

/**
 * */
public class SemesterReport {

    /**
     * Default constructor
     */
    public SemesterReport() {
    }

    /**
     * */
    private String Semester;

    /**
     * */
    private Date GeneratedDate;

    /**
     * */
    private String Summary;


    /**
     * Implementation: Sets the generation date and creates a summary string.
     */
    public void Compile() {
        // TODO implement here
        this.GeneratedDate = new Date();
        this.Summary = "Attendance Report for " + this.Semester + " compiled on " + this.GeneratedDate;
        System.out.println("Report Compiled Successfully.");
    }

    /**
     * Implementation: Simulates exporting the data to a PDF file.
     * @param FileName
     */
    public void ExportPDF(String FileName) {
        // TODO implement here
        System.out.println("Exporting report to: " + FileName + ".pdf");
    }

    /**
     * Implementation: Added a return type so you can actually get the semester name.
     * @return The semester name
     */
    public String GetSemester() {
        // TODO implement here
        return this.Semester;
    }

    /**
     * Implementation: Returns the compiled summary.
     * @param Summary 
     * @return The stored summary string
     */
    public String GetSummary(String Summary) {
        // TODO implement here
        return this.Summary;
    }

    // Added: Setter for Semester so you can initialize the report
    public void SetSemester(String Semester) {
        this.Semester = Semester;
    }

}