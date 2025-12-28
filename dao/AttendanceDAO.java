package dao;

import entity.AttendanceRecord;
import java.sql.*;

public class AttendanceDAO {
    public void addAttendance(AttendanceRecord record) throws Exception {
        // Matches schema: RecordID, Method, Status, Timestamp, StudentId, SessionID
        String sql = "INSERT INTO AttendanceRecord (RecordID, Method, Status, Timestamp, StudentId, SessionID) " +
                     "VALUES (?, ?, ?, GETDATE(), ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, record.getRecordId());
            pstmt.setString(2, record.getMethod());
            pstmt.setString(3, record.getStatus());
            pstmt.setInt(4, record.getStudentId());
            pstmt.setInt(5, record.getSessionId());
            pstmt.executeUpdate();
            System.out.println("Attendance recorded successfully.");
        }
    }
}