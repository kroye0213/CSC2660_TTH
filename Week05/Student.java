

import java.util.Scanner;


public class Student {
  private String studentID;
  private String firstName;
  private String lastName;
  private String major;

  public Student(){

  }

  public Student(String studentID, String firstName, String lastName, String major) {
      this.studentID = studentID;
      this.firstName = firstName;
      this.lastName = lastName;
      this.major = major;
      
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
  public void promptUserData() {
           {
            for (int i = 0; i < 3; i++) {
                Scanner dataInput = new Scanner(System.in);
                System.out.println("\nEnter student ID: ");
                studentID = dataInput.nextLine();
                System.out.println("\nEnter First Name: ");
                firstName = dataInput.nextLine();
                System.out.println("\nEnter Last Name: ");
                lastName = dataInput.nextLine();
                System.out.println("\nEnter Major: ");
                major = dataInput.nextLine();
            }
                }
  }


}
