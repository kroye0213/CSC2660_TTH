import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class royeCustomer {
    private static String custID;
    static int zipCode;
    static long phone;
    private static String firstName;
    static String lastName;
    static String city;
    static String email;

    public static void dataUserPrompt() {
        for (int i = 0; i < 6; i++) {
            Scanner dataInput = new Scanner(System.in);
            System.out.println("\nEnter Customer ID: ");
            String custID = dataInput.nextLine();
            System.out.println("\nEnter First Name: ");
            String firstName = dataInput.nextLine();
            System.out.println("\nEnter Last Name: ");
            String lastName = dataInput.nextLine();
            System.out.println("\nEnter the City: ");
            String city = dataInput.nextLine();
            System.out.println("\nEnter the Email: ");
            String email = dataInput.nextLine();
            System.out.println("\nEnter the ZipCode: ");
            int zipCode = dataInput.nextInt();
            System.out.println("\nEnter the Phone number(ex. 6302234567): ");
            long phone = dataInput.nextLong();
            
            try {
                FileWriter writer = new FileWriter("royeCustomerData.txt", true);
                writer.write(custID);
                writer.write("\t" + firstName); // write new line
                writer.write("\t" + lastName);
                writer.write("\t" + city);
                writer.write("\t" + zipCode);
                writer.write("\t" + phone);
                writer.write("\t" + email);
                writer.write("\r\t");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public static void main(String[] args) {
        dataUserPrompt();
        txtReader();
        
    }

    {
    }

    public static void txtReader() {
        try {
            File myObj = new File("royeCuostomerData.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
}
}
