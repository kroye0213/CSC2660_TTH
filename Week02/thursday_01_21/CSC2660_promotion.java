package thursday_01_21;

public class CSC2660_promotion {
    public static void main(String[] args) {
        byte bOne = 65;
        char charOne = 'r';
        short shortOne = 1024;
        int intNumber = 6500000;
        float fltNumber = 6.89f;
        double dlbNumber = .4589;

        double result = (fltNumber * bOne) + (intNumber / charOne);
        System.out.println("\nDisply result: " +result);System.out.println("\nDisply result for deviding in int with a character: " + (intNumber / charOne));
        dlbNumber = 345;

    }
}