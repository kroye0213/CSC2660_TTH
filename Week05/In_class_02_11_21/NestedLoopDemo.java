package In_class_02_11_21;

import java.util.Scanner;

public class NestedLoopDemo {
    public static void main(String[] args) {
        
        int number01, dnumber;

        Scanner inputData = new Scanner(System.in);
        System.out.println("\nEnter numbers between 1 and 16");
        System.out.println("\nFirst number: ");
        number01 = inputData.nextInt();
        System.out.println("\nSecond number: ");
        dnumber = inputData.nextInt();

        for (int index01 = 0; index01 < number01; index01++) {
            System.out.println("****************************");
            for (int index02 = 0; index02 < dnumber; index02++) {
                System.out.println("\nCSC Programs at AU SP2021 are running as usual!");
            }
        }
    }
}
