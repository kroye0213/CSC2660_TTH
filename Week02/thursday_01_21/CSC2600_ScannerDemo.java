package thursday_01_21;

import java.util.Scanner;

public class CSC2600_ScannerDemo {
    public static void main(String[] args) {
        
        Scanner dataInput = new Scanner(System.in);

        System.out.println("\nEnter your first name: ");
        String firstName = dataInput.nextLine();
    
        System.out.println("\nEnter your last name: ");
        String lastName = dataInput.nextLine();
        
        System.out.println("\nEnter your email adtess ");
        String emailAddress = dataInput.nextLine();

        System.out.println("\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nEmail Address: " + emailAddress);
    }
}
//zip fiiles for class assignments
