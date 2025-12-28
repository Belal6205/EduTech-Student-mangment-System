package entity;

import java.io.*;
import java.util.*;

/**
 * */
public class BiometricDevice {

    /**
     * Default constructor
     */
    public BiometricDevice() {
    }

    /**
     * */
    private String DeviceID;

    /**
     * */
    private String SerialNumber;

    /**
     * */
    private String Location;

    /**
     * */
    private String Status;


    /**
     * Implementation: Sets the device status to "Active"
     */
    public void Activate() {
        // TODO implement here
        this.Status = "Active";
    }

    /**
     * Implementation: Sets the device status to "Inactive"
     */
    public void DeActivate() {
        // TODO implement here
        this.Status = "Inactive";
    }

    /**
     * Implementation: Returns the unique Device ID
     * @return String DeviceID
     */
    public String GetDeviceID() {
        // TODO implement here
        return this.DeviceID;
    }

    /**
     * Implementation: Updates the Status of the device
     * @param Status
     */
    public void GetStatus(String Status) {
        // TODO implement here
        this.Status = Status;
    }

    /**
     * Implementation: Updates the physical location of the device
     * @param Location
     */
    public void SetLocation(String Location) {
        // TODO implement here
        this.Location = Location;
    }
    
    // Added: Standard Getter for the Status field
    public String GetCurrentStatus() {
        return this.Status;
    }
    
    // Added: Setter for DeviceID to allow initialization in your Controllers
    public void SetDeviceID(String DeviceID) {
        this.DeviceID = DeviceID;
    }

}