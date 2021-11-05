

import java.util.Scanner;

//AU4567
//Jamie
//Kapirituyi
//Biology

public class Student {
  private String studentID;
  private String firstName;
  private String lastName;
  private String major;
  private double GPA;
  private String emailAddress;
  
  public Student(){

  }

  public Student(String studentID, String firstName, String lastName, String major, double GPA, String emailAddress){
      this.studentID = studentID;
      this.firstName = firstName;
      this.lastName = lastName;
      this.major = major;
      this.GPA = GPA;
      this.emailAddress = emailAddress;
  }

   {
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

public double getGPA() {
    return GPA;
}

public void setGPA(double GPA) {
    this.GPA = GPA;
}

public String getEmailAddress() {
    return emailAddress;
}

public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
}
  public void promptUserData() {
           {
            for (int i = 0; i < 3; i++) {
                //Student student01 = new Student();
                Scanner dataInput = new Scanner(System.in);
                System.out.println("\nEnter student ID: ");
                studentID = dataInput.nextLine();
                System.out.println("\nEnter First Name: ");
                firstName = dataInput.nextLine();
                System.out.println("\nEnter Last Name: ");
                lastName = dataInput.nextLine();
                System.out.println("\nEnter Major: ");
                major = dataInput.nextLine();
                System.out.println("\nEnter Email Address: ");
                emailAddress = dataInput.nextLine();
                System.out.println("\nEnter GPA: ");
                GPA = dataInput.nextDouble();
            }


}
  }
}
