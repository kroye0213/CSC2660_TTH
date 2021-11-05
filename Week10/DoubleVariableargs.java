public class DoubleVariableargs {
    

    public static void main(String[] args) {
        //Call the varargs method with different numbers of parameters
        variableLength(245.05); //one parameter

        variableLength(26.13, 54.67, 17.09, 205.01, 139.69); // Five parameters

        variableLength(); //Empty
    }

    public static void variableLength(double ... au_length) {

        System.out.println("\nNumber of arguments: " + au_length);
        
        //Use a For-each (enhance) loop

        for (double num03 : au_length) {
            System.out.println(num03 + " ");
        }
        System.out.println();
    }
}
