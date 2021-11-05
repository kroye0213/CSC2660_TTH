import java.util.Scanner;

public class FlowControlDemo2 {
    public static void main(String[] args) {
        int number01 = 0;

        Scanner dataInput = new Scanner(System.in);
        System.out.println("\nEnter an integer: ");
        number01 = dataInput.nextInt();
        //Simple Expression
        if (number01 > 10){
            System.out.println("\nThe integer is greater than 10");
        }
        else {
            System.out.println("\nthe integer is less than 10");
        }
        System.out.println("\nProgram DONE");
    }
}
