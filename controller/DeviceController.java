package controller;

import entity.BiometricDevice; // Added import to link to your entity class
import java.io.*;
import java.util.*;

/**
 * */
public class DeviceController {

    /**
     * Default constructor
     */
    public DeviceController() {
    }


    /**
     * Implementation: Registers a new biometric device into the system.
     * @param device The biometric device object to be registered
     * @return Boolean true if registration is successful, false otherwise
     */
    public Boolean register(BiometricDevice device) {
        // TODO implement here
        if (device == null) {
            System.out.println("Registration failed: Device object is null.");
            return false;
        }

        System.out.println("Initiating registration for Device ID: " + device.GetDeviceID());
        
        // Simulating registration logic (e.g., checking uniqueness or hardware handshake)
        device.Activate(); // Set the device status to Active upon successful registration
        
        System.out.println("Device " + device.GetDeviceID() + " has been successfully registered and activated.");
        return true;
    }

}