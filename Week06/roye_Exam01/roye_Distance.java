package roye_Exam01;

public class roye_Distance {
    public static void main(String[] args) {
        //declaration of varibles for the calculation
        int feetInaMile = 5280;
        double milesFromTrainStation = 9.6;
        //calculation of miles int feet
        double distanceInfeet = milesFromTrainStation * feetInaMile; 
        //display of the calculation in a statement
        System.out.println("\nThe distance to the train station is " + milesFromTrainStation + " miles or " + distanceInfeet + " feet.");
    }
    
}
