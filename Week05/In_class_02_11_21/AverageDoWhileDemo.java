package In_class_02_11_21;

import java.util.Scanner;

/**
 * AverageDoWhileDemo --- Post Test While Loop
 */
public class AverageDoWhileDemo {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;
        int testScore;
        int average;

        do {
            System.out.println("\nEnter test score: ");
            testScore = inputData.nextInt();
            total = total + testScore;  //total += testScore

            gradeCounter = gradeCounter + 1;

        } while (gradeCounter <= 5);
        //Calculate the average
        average = total / 5;
        System.out.println("\nTotal of all the 5 Test Scores is: " + total);
        System.out.println("\nThe student average Test Score is: " + average);

    }

}
