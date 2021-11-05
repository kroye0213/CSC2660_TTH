import java.util.Scanner;

/**
 * WhileLoopDemo
 */
public class WhileLoopDemo {

    public static void main(String[] args) {
        
       /* int index = 1;
        while (index <= 3) {
            System.out.println("\n******************************");
        
        int count = 0;
        while (count <= 5) {
            System.out.println(count);

            count++;
        }
        index++;
        }**/
        Scanner dataInput = new Scanner(System.in);
        System.out.println("\nEnter an integer less than 10: ");
        int number01 = dataInput.nextInt();
        int sum = 0;
        
       /* for (int index = 0; index < 5; index++) {
            System.out.println("\n************************");
            for (number01 = 0; number01 < 10; number01++) {
                System.out.println("\nDisplay count " + number01);

                sum += number01;
                System.out.println("\nThe sum of number01 " + sum);
            }
        }**/
        
        // while (number01 <= 10) {
        //     System.out.println("\nWhat do you want to display?");
        //     System.out.println("#############################");
            
        //     int count = 1;
        //     while (count <= 8){
        //         System.out.println("I am here again!");
        //         count++;
        //     }
        //     number01++;
        // }
        do {
            System.out.println("\nWhat do you want to display?");
            System.out.println("###########################");
            number01++;
            System.out.println("\nNumber " + number01 + " +1");
        } while (number01 < 5);
    }
}