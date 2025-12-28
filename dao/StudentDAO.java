package dao;

import entity.Student;
import java.sql.*;

public class StudentDAO {
    public void addStudent(Student student) throws Exception {
        // Matches schema: StudentId, Name, Major, GPA
        String sql = "INSERT INTO Student (StudentId, Name, Major, GPA) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, student.getStudentId());
            pstmt.setString(2, student.getName());
            pstmt.setString(3, student.getMajor());
            pstmt.setDouble(4, student.getGpa());
            pstmt.executeUpdate();
            System.out.println("Student added successfully.");
        }
    }
}