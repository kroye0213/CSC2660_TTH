public class DataTypeThursday {
    //Variable Declarationd and Assignments
    public static void main(String[] args) {
        int intNumber = 26;
        byte firstByte = 34;
        short firstShort = 26;
        long firstLong = 34;

        final double MILK_PRICE = 45.76;
        //Display values from declared Variables
        System.out.println("\nFirst integer stored: " + intNumber);
        System.out.println("\nThe First byte is stored: " + firstByte);
        System.out.println("\nFirst short stored: " + firstShort);
        System.out.println("\nLong stored: " + firstLong);
        
        System.out.println("\nMilk price stored: " + MILK_PRICE);
        
        double result = (firstLong + MILK_PRICE);
        System.out.println(result);


    }
}
