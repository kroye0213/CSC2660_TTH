package Assignment02.Roye_02;

import java.util.Scanner;

public class PromptUserData_pp31 {
    public static void main(String[] args) {
        Scanner dataInput = new Scanner(System.in);
        System.out.println("\nEnter your first name: ");
        String firstName = dataInput.nextLine();
        System.out.println("\nEnter your last name: ");
        String lastName = dataInput.nextLine();
        System.out.println("\nThe first letter of the User's first name is: " + firstName.charAt(0) + "\nThe users first 5 letters of their last name is: " + lastName.charAt(0) + lastName.charAt(1) + lastName.charAt(2) + lastName.charAt(3) + lastName.charAt(4));
    }

 
    }

