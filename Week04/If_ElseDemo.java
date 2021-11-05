import java.util.Scanner;

public class If_ElseDemo {
    public static void main(String[] args) {
        //Prompt use to input any integer
        Scanner dataInput = new Scanner(System.in);
        int number01;
        System.out.println("\nEnter an integer: ");
        number01 = dataInput.nextInt();
        if (isNumberEven(number01)){
            System.out.println(number01 + " is even");
        }
        else 
        {
            System.out.println(number01 + " is odd");        }
    }
    public static boolean isNumberEven(int num01) {
        boolean result;
        if(num01 % 2 == 1){
            result = false;
            System.out.println("\n&&**C(ss)");

        }
        else
        {
            result = true;
        }
         return result;   
    }
}
