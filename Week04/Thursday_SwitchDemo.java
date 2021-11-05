import java.security.Key;
import java.util.Scanner;

public class Thursday_SwitchDemo {
    public static void main(String[] args) {
        Scanner dataInput = new Scanner(System.in);
        System.out.println("\nEnter or choose an operation: "+ 
        "\t\nA ----- for Addition" +    
        "\t\nS ----- for Subtraction" +    
        "\t\nM ----- for Multiplication" +    
        "\t\nD ----- for Division");
        System.out.println("\nEnter a choice: ");
        char choice = dataInput.next().charAt(0);
        System.out.println("\nEnter the first number: ");
        int number01 = dataInput.nextInt();
        System.out.println("\nEnter the second number: ");
        int number02 = dataInput.nextInt();
        double result = 0;
        switch(choice) {
            case 'A':
                result += number01 + number02;
                System.out.println(number01 + "+" + number02 + " = " + result);
                break;            
            case 'S':
                result += number01 - number02;
                System.out.println(number01 + "-" + number02 + " = " + result);
                break;
            case 'M':
                result += number01 * number02;
                System.out.println(number01 + "*" + number02 + " = " + result);
                break;
            case 'D':
                result += number01 / number02;
                System.out.println(number01 + "/" + number02 + " = " + result);
                
                break;
            default:
                break;
        }

    }
}
