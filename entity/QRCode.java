package entity;

import java.io.*;
import java.util.*;

/**
 * */
public class QRCode {

    /**
     * Default constructor
     */
    public QRCode() {
        this.IsUsed = false; // Initialized to false by default
    }

    /**
     * */
    private String CodeValue;

    /**
     * */
    private Date ExpiryTime;

    /**
     * */
    private Boolean IsUsed;

    /**
     * Implementation: Checks if the QR code is not used and not expired.
     * @return true if valid, false if expired or already used
     */
    public Boolean IsValid() {
        // TODO implement here
        if (IsUsed) return false;
        if (ExpiryTime == null) return true;
        
        Date now = new Date();
        return ExpiryTime.after(now);
    }

    /**
     * Implementation: Marks the QR code as used.
     */
    public void MarkAsUsed() {
        // TODO implement here
        this.IsUsed = true;
    }

    /**
     * Implementation: Fixed the syntax error and returned the code value.
     * @return String CodeValue
     */
    public String GetCodeValue() {
        // TODO implement here
        return this.CodeValue;
    }

    /**
     * Implementation: Allows manual override of the usage status.
     * @param IsUsed
     */
    public void SetUsed(Boolean IsUsed) {
        // TODO implement here
        this.IsUsed = IsUsed;
    }

    // Added: Setter for CodeValue and ExpiryTime for initialization
    public void SetCodeValue(String value) {
        this.CodeValue = value;
    }

    public void SetExpiryTime(Date expiry) {
        this.ExpiryTime = expiry;
    }
}