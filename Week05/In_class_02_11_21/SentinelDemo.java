package In_class_02_11_21;

import java.util.Scanner;

public class SentinelDemo {
    public static void main(String[] args) {
        final String SENTINEL = "quit";
        Scanner dataInput = new Scanner(System.in);
        int sum = 0;
        //Prompt user to type sentence
        System.out.println("\nType a sentence (or \"" + SENTINEL + "\" to exit): ");
        String selectOption = dataInput.nextLine();
        while(!selectOption.equals(SENTINEL)) {
            sum += selectOption.length();
            System.out.println("\nType a sentence (or \"" + SENTINEL + "\" to exit): ");
            selectOption = dataInput.nextLine();
        }
        System.out.println("\nSentence type amounted to " + sum + " characters.");
    }
}
