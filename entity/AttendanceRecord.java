package entity;

public class AttendanceRecord {
    private int recordId;
    private String method;
    private String status;
    private int studentId;
    private int sessionId;

    // These methods fix the red lines in chechconnection
    public void setRecordId(int recordId) { this.recordId = recordId; }
    public void setMethod(String method) { this.method = method; }
    public void setStatus(String status) { this.status = status; }
    public void setStudentId(int studentId) { this.studentId = studentId; }
    public void setSessionId(int sessionId) { this.sessionId = sessionId; }

    // These methods allow the DAO to read the data
    public int getRecordId() { return recordId; }
    public String getMethod() { return method; }
    public String getStatus() { return status; }
    public int getStudentId() { return studentId; }
    public int getSessionId() { return sessionId; }
}