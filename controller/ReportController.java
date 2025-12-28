package controller;

import entity.SemesterReport;
import java.io.*;
import java.util.*;

/**
 * */
public class ReportController {

    /**
     * Default constructor
     */
    public ReportController() {
    }


    /**
     * Implementation: Creates and compiles a report for the specified semester.
     * @param Semester The name/ID of the semester (e.g., "Spring 2024")
     * @return A compiled SemesterReport object
     */
    public SemesterReport GenerateSemesterReport(String Semester) {
        // TODO implement here
        System.out.println("ReportController: Initiating report generation for " + Semester);
        
        // 1. Create a new instance of the entity
        SemesterReport newReport = new SemesterReport();
        
        // 2. Set the semester name (assuming you added the setter to SemesterReport)
        newReport.SetSemester(Semester);
        
        // 3. Run the compilation logic inside the entity
        newReport.Compile();
        
        System.out.println("ReportController: Report successfully generated.");
        
        // 4. Return the finished report object
        return newReport;
    }

}