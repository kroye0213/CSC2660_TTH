public class CSC2650_ArrayDemo {
    public static void main(String[] args) {
        //Declare and Array
        double[] salaries = new double[5];

        //Assign five values to the array elements
        salaries[0] = 645.98;
        salaries[1] = 455.99;
        salaries[2] = 345.55;
        salaries[3] = 700.77;
        salaries[4] = 666.68;
        //Remember that the array size is N -- the last element of an array is located at n-1 index

        //Display the array elemants
        System.out.println("Salaries Displayed: ");
        System.out.println("\nThird position: " + salaries[2]);
        System.out.println("\nFifth position element: " + salaries[4]);
        System.out.println("\nFirst position element: " + salaries[0]);
        System.out.println("\nSecond position element: " + salaries[1]);
        System.out.println("\nFourth position element: " + salaries[3]);

        for (double auSal : salaries) {
            System.out.println("\nElements Displayed: " + auSal);
        }
    }
}
