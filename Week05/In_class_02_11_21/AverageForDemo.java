package In_class_02_11_21;

import java.util.Scanner;

/**
 * AverageForDemo
 */
public class AverageForDemo {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;
        int testScore;
        int average;

        //while (gradeCounter <= 5){
        for (gradeCounter = 1; gradeCounter <= 5; gradeCounter++){
            System.out.println("\nEnter test score: ");
            testScore = inputData.nextInt();
            total = total + testScore;  //total += testScore

            gradeCounter = gradeCounter + 1;
        }
         
        //Calculate the average
        average = total / 3;
        System.out.println("\nTotal of all the 3 Test Scores is: " + total);
        System.out.println("\nThe student average Test Score is: " + average);

    }
}