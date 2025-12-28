package entity;

public class Student {
    private int studentId;
    private String name;
    private String major;
    private double gpa;

    // Constructors, Getters, and Setters
    public int getStudentId() { return studentId; }
    public void setStudentId(int id) { this.studentId = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }
    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }
}