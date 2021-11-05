/**
 * DemoString01
 */
public class DemoString01 {

    public static void main(String[] args) {
        String mw_college = "Aurora University";
        System.out.println("\nDisplay the mw_college string: " + mw_college);

        System.out.println("\nDisplay the number at which charater is found: " + mw_college.charAt(8));

        String str02 = " small mid-western college";
        System.out.println("\n" + mw_college.concat(str02));

        String str03 = "Aurora University";
        System.out.println("\n Find if strings are equal: " + mw_college.equals(str03));
        
    }
}