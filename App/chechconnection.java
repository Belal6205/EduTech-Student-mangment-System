package App;

import dao.AttendanceDAO;
import entity.AttendanceRecord;

public class chechconnection {
    public static void main(String[] args) {
        try {
            AttendanceDAO dao = new AttendanceDAO();
            AttendanceRecord rec = new AttendanceRecord();
            
            // Using IDs that exist in your Insertion script
            rec.setRecordId(9001); 
            rec.setMethod("Biometric"); 
            rec.setStatus("Present");
            rec.setStudentId(220); // Alice Johnson
            rec.setSessionId(1);   // Valid Session ID
            
            dao.addAttendance(rec);
            System.out.println("SUCCESS: Connection and DAO operation complete.");
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}