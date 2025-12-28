package boundary; 

import java.io.*;
import java.util.*;
import entity.FingerPrintData; 

/**
 * Boundary class representing the biometric hardware interface.
 */
public class BiometricScanner {

    /**
     * Default constructor
     */
    public BiometricScanner() {
        this.Status = "Ready";
    }

    private String StudentID;
    private String Status;

    /**
     * Implementation: Simulates the physical scanning of a fingerprint.
     * @return FingerPrintData object
     */
    public FingerPrintData Scan() {
        this.Status = "Scanning...";
        System.out.println("Hardware Status: " + this.Status);
        
        FingerPrintData capturedData = new FingerPrintData();
        
        // Ensure FingerPrintData has these methods implemented
        capturedData.SetTemplateID("TMP-" + System.currentTimeMillis());
        capturedData.SetQualityScore(85); 
        
        this.Status = "Scan Complete";
        System.out.println("Scan successful for Student: " + this.StudentID);
        
        return capturedData;
    }
    
    public void setStudentID(String studentID) {
        this.StudentID = studentID;
    }
}