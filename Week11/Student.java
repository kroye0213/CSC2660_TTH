import java.util.Scanner;

public class Student {
    private String studentID, firstName, lastName, major;
    private double gpa;
    
    public Student(){
        
    }
    
    public Student(String studentID, String firstName, String lastName, String major, double gpa) {
        super();
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.gpa = gpa;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student Data:" + "FirstName:" + firstName + "\nGpa:" + gpa + "\nLastName: " + lastName + "Major: " + major
                + "\nStudentID: " + studentID;
    }

    public void promptUserData() {
    }
    
    
}
