package controller;

import entity.FingerPrintData; // Import the entity class
import java.io.*;
import java.util.*;

/**
 * Controller class responsible for matching biometric input.
 */
public class BiometricMatcher {

    /**
     * Default constructor
     */
    public BiometricMatcher() {
        this.MatchingThreshold = 80; // Default threshold set to 80%
    }

    /**
     * The minimum score required for a successful match
     */
    private Integer MatchingThreshold;

    /**
     * Implementation: Validates if the provided fingerprint data meets the threshold.
     * @param Data FingerPrintData object to be matched
     * @return Boolean true if matching score >= threshold, false otherwise
     */
    public Boolean Match(FingerPrintData Data) {
        // TODO implement here
        if (Data == null || Data.GetQualityScore() == null) {
            return false;
        }
        
        System.out.println("Processing Fingerprint Template: " + Data.GetTemplateID());
        
        // Logical check against the threshold
        return Data.GetQualityScore() >= this.MatchingThreshold;
    }

    /**
     * Implementation: Returns the current system matching threshold.
     * @return Integer MatchingThreshold
     */
    public Integer GetMatchingThreshold() {
        // TODO implement here
        return this.MatchingThreshold;
    }

    /**
     * Implementation: Updates the matching threshold value.
     * @param Value The new threshold value
     */
    public void SetMatchingThreshold(Integer Value) {
        // TODO implement here
        this.MatchingThreshold = Value;
    }

}