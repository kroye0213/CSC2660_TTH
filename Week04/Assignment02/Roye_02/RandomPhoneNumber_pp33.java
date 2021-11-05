package Assignment02.Roye_02;

import java.util.Random;

public class RandomPhoneNumber_pp33 {
    public static void main(String[] args) {
        Random rand = new Random();
        int bounds = 8;
        int bounds01 = 10;
        int bounds02 = 8;
        int bounds03 = 5;
        int bounds04 = 3;
        int number01 = rand.nextInt(bounds);
        int number02 = rand.nextInt(bounds);
        int number03 = rand.nextInt(bounds);
        int number04 = rand.nextInt(bounds02);
        int number05 = rand.nextInt(bounds03);
        int number06 = rand.nextInt(bounds04);
        int number07 = rand.nextInt(bounds01);
        int number08 = rand.nextInt(bounds01);
        int number09 = rand.nextInt(bounds01);
        int number10 = rand.nextInt(bounds01);
        System.out.println("\nThe phone number is: " + number01 + number02 + number03 + "-" + number04 + number05 + number06 + "-" + number07 + number08 + number09 + number10); 

    }
}
