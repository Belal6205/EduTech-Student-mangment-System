import boundary.*;
import controller.*;
import entity.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Biometric Attendance System Starting ===\n");

        // 1. Setup Controllers and Boundary Classes
        SessionController sessionCtrl = new SessionController();
        BiometricScanner scanner = new BiometricScanner();
        BiometricMatcher matcher = new BiometricMatcher();
        AttendanceController attendanceCtrl = new AttendanceController();
        Faculty lecturer = new Faculty();

        // 2. Faculty starts a session
        lecturer.setFacultyDetails("F001", "Dr. Smith", "Computer Science");
        lecturer.CreateSession("CS101");
        sessionCtrl.CreateSession("CS101");
        System.out.println("--------------------------------------------");

        // 3. Student attempts to mark attendance
        String studentID = "STU995";
        System.out.println("Action: Student " + studentID + " places finger on scanner.");
        
        scanner.setStudentID(studentID);
        FingerPrintData capturedData = scanner.Scan();

        // 4. System matches the biometric data
        System.out.println("Action: System verifying biometric data...");
        boolean isMatch = matcher.Match(capturedData);

        if (isMatch) {
            System.out.println("Result: Match Success (Score: " + capturedData.GetQualityScore() + ")");
            
            // 5. Record the attendance
            boolean recorded = attendanceCtrl.RecordUsingQR(studentID, "QR_SESSION_CS101_VALID");
            if (recorded) {
                System.out.println("System: Attendance logged for " + studentID + " at " + new Date());
            }
        } else {
            System.out.println("Result: Match Failed. Please try again.");
        }

        System.out.println("\n--------------------------------------------");
        // 6. Faculty ends the session
        lecturer.EndSession("SESS-CS101-001");
        sessionCtrl.CloseSession("SESS-CS101-001");
        
        System.out.println("\n=== System Operation Complete ===");
    }
}