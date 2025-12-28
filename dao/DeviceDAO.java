package dao;

import java.io.*;
import java.util.*;
import entity.BiometricDevice; // Added import to link to your entity class

/**
 * */
public class DeviceDAO {

    /**
     * Default constructor
     */
    public DeviceDAO() {
    }

    /**
     * Implementation: Simulates a database connection status.
     */
    public void DBConnection() {
        // TODO implement here
        System.out.println("Device Database: Connection established.");
    }


    /**
     * Implementation: Simulates saving a biometric device to the database.
     * @param device
     */
    public void save(BiometricDevice device) {
        // TODO implement here
        if (device != null) {
            System.out.println("Saving device " + device.GetDeviceID() + " to the database...");
            // Logic for database insertion would go here
            System.out.println("Device saved successfully.");
        } else {
            System.out.println("Error: Cannot save a null device.");
        }
    }

}