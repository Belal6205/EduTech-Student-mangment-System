package boundary;

import java.io.*;
import java.util.*;
import entity.BiometricDevice; // Import the entity class

/**
 * Boundary class representing the Administrator interface for system management.
 */
public class Admin {

    /**
     * Default constructor
     */
    public Admin() {
    }

    /**
     * Unique identifier for the Administrator
     */
    private String AdminID;

    /**
     * Name of the Administrator
     */
    private String Name;


    /**
     * Implementation: Initiates the registration process for a new biometric hardware device.
     * @param device The BiometricDevice object to be registered in the system.
     */
    public void registerDevice(BiometricDevice device) {
        // TODO implement here
        if (device != null) {
            System.out.println("Admin " + this.Name + " (ID: " + this.AdminID + ") is registering device...");
            System.out.println("Device ID: " + device.GetDeviceID());
            
            // In a full implementation, this would call DeviceController.register(device)
            device.Activate(); 
            
            System.out.println("Registration request submitted successfully.");
        } else {
            System.out.println("Error: No device data provided for registration.");
        }
    }
    
    // Added: Setters to initialize Admin details
    public void setAdminDetails(String id, String name) {
        this.AdminID = id;
        this.Name = name;
    }

}