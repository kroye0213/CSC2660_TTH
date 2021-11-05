import java.text.DecimalFormat;
import java.util.Scanner;

public class FormatStuffDemo {
    
    public static void main(String[] args) {
        int radius;
        double area, circumference;

        Scanner dataInput = new Scanner(System.in);

        System.out.println("\nEnter the circle radius: ");
        radius = dataInput.nextInt();

        area = Math.PI * Math.pow(radius, 2);
        System.out.println("\nDisplay area: " + area);
        
        circumference = 2 * Math.PI * radius;
        System.out.println("\nDisplay circumfrence: " + circumference);

        DecimalFormat fmt = new DecimalFormat("0.###");
        System.out.println("\nDisplay formatted area: " + fmt.format(area));
        
        System.out.println("\nDisplay formatted circumfrence: " + fmt.format(circumference));
    }
}
