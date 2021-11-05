package Assignment01.Roye_01;
import java.util.Scanner;

public class Time_pp26 {
    public static void main(String[] args) {
        Scanner dataInput = new Scanner(System.in);

        System.out.println("\nEnter your hours: ");
        int hours = dataInput.nextInt();
    
        System.out.println("\nEnter your minutes: ");
        int minutes = dataInput.nextInt();
        
        System.out.println("\nEnter your seconds: ");
        int seconds = dataInput.nextInt();

        int secondsHours = hours * 3600;
        int secondsMins = minutes * 60;
        int totalSeconds = secondsHours + secondsMins + seconds;
        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds is equivalent to, " + totalSeconds + " seconds.");
    }
}
