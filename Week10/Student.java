import java.util.Scanner;

public class Student {
    private String studentID, firstName, lastName, major, emailAddress;
    private double tuitionFees;
    
    public Student() {
    }

    public Student(String studentID, String firstName, String lastName, String major, String emailAddress,
            double tuitionFees) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.emailAddress = emailAddress;
        this.tuitionFees = tuitionFees;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public double getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(double tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    @Override
    public String toString() {
        return "\nStudent ID: " + studentID + "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nMajor: " + major + "\nEmail Address: " + emailAddress + "\nTuition Fees: " + tuitionFees;
    }

    public void promptStudentData(){
        Scanner dataInput = new Scanner(System.in);
        System.out.println("\nEnter Student ID: ");
        studentID = dataInput.nextLine();
        System.out.println("\nEnter First Name: ");
        firstName = dataInput.nextLine();
        System.out.println("\nEnter Last Name: ");
        lastName = dataInput.nextLine();
        System.out.println("\nEnter Major: ");
        major = dataInput.nextLine();
        System.out.println("\nEnter Email Address: ");
        emailAddress = dataInput.nextLine();
        System.out.println("\nEnter Tuition Fees: ");
        tuitionFees = dataInput.nextDouble();
        
        
    }
    
}
