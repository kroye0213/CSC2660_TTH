package Assignment01.Roye_01;
import java.util.Scanner;
public class Fraction_pp211 {
    public static void main(String[] args) {
        Scanner dataInput = new  Scanner(System.in);
        
        System.out.println("\nEnter your numerator: ");
        int numerator = dataInput.nextInt();

        System.out.println("\nEnter your denominator: ");
        int denominator = dataInput.nextInt();

        double decimalFraction = (double) numerator / denominator;

        System.out.println("\nThe decimal of, " + numerator + " over " + denominator + " is, " + decimalFraction);
    }
}
