package In_class_02_11_21;

import java.util.Scanner;

public class PatternNestedLoopDemo {
  
    public static void main(String[] args) {
        
        int number01, dnumber;

        Scanner inputData = new Scanner(System.in);
        System.out.println("\nEnter numbers between 2 and 20");
        System.out.println("\nFirst number: ");
        number01 = inputData.nextInt();
        System.out.println("\nSecond number: ");
        dnumber = inputData.nextInt();

        for (int index01 = 1; index01 <= number01; ++index01) {
            //System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
            for (int index02 = 1; index02 <= index01; ++index02) {
                System.out.print('$');
            }
            System.out.println();
        }
    }
}

