package thursday_01_21;

public class CSC2660_Conversion {
    
    public static void main(String[] args) {
        byte p;
        int intNumber = 678;
        double dblNumber = 453.142;

        System.out.println("\nConvesion of int to byte:");
         p  = (byte) intNumber;

         System.out.println("\nintNumber and p " + "\n" + intNumber + "\n" + p);

         System.out.println("\nConversion of double to int: ");
         intNumber = (int) dblNumber;
         
         System.out.println("\nDisplay dblNumber and intNumber" + "\n" + dblNumber + "\n" + intNumber);

    }
}
