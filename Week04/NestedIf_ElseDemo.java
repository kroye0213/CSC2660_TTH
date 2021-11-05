import java.util.Scanner;

public class NestedIf_ElseDemo {
    public static void main(String[] args) {
        Scanner dataInput = new Scanner(System.in);

        int testScore;
        System.out.println("\nEnter the points to be evaluated: ");
        testScore = dataInput.nextInt();

        char letterGrade;
        if(testScore >= 90){
            letterGrade = 'A';
        }
        else if(testScore >= 80){
            letterGrade = 'B';
        }
        else if(testScore >= 70){
            letterGrade = 'C';
        }
        else if(testScore >= 60){
            letterGrade = 'D';
        }
        else {
            letterGrade = 'F';
        }
        System.out.println("\nthe letter Grade is: " + letterGrade);
    }
}
