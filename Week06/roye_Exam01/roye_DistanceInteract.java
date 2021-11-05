package roye_Exam01;

import java.util.Scanner;

public class roye_DistanceInteract {
    public static void main(String[] args) {
        //scanner declaration for user inputs 
        Scanner dataInput = new Scanner(System.in);
        //user prompt for distance in miles to train station
        System.out.println("\nEnter the Distance to the train station in miles: ");
        //storage of user input
        double distanceinMiles = dataInput.nextFloat();
        //distance calculation
        double totalDistance = distanceinMiles * 5280;
        //display calculation in a readable statement
        System.out.println("\nThe distance to the train station is " + distanceinMiles + " miles or " + totalDistance + " feet.");

    }
}
