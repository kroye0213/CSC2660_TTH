import java.util.Scanner;

public class AU_CSCStudent extends Student {
    private final int MATH_HRS = 20;
    private final int COMPSCI_HRS = 40;
    private final int GEN_ED_HRS = 60;

    public int mathhr, cechr, genEdhr;
    public AU_CSCStudent(){

    }
    public AU_CSCStudent(int mathhr, int cechr, int genEdhr) {
        this.mathhr = mathhr;
        this.cechr = cechr;
        this.genEdhr = genEdhr;
    }
    public AU_CSCStudent(String studentID, String firstName, String lastName, String major, double gpa, int mathhr,
            int cechr, int genEdhr) {
        super(studentID, firstName, lastName, major, gpa);
        this.mathhr = mathhr;
        this.cechr = cechr;
        this.genEdhr = genEdhr;
    }
    public int getMATH_HRS() {
        return MATH_HRS;
    }
    public int getCOMPSCI_HRS() {
        return COMPSCI_HRS;
    }
    public int getGEN_ED_HRS() {
        return GEN_ED_HRS;
    }
    public int getMathhr() {
        return mathhr;
    }
    public void setMathhr(int mathhr) {
        this.mathhr = mathhr;
    }
    public int getCechr() {
        return cechr;
    }
    public void setCechr(int cechr) {
        this.cechr = cechr;
    }
    public int getGenEdhr() {
        return genEdhr;
    }
    public void setGenEdhr(int genEdhr) {
        this.genEdhr = genEdhr;
    }
    
    public int getRemainingHours(){
        int requiredHrs, remainingHrs;
        Scanner dataInput = new Scanner(System.in);
        System.out.println("\nEnter Math Hours taken: ");
        mathhr = dataInput.nextInt();
        
        System.out.println("\nEnter Comp Sci Hours taken: ");
        cechr = dataInput.nextInt();
        
        System.out.println("\nEnter Gen Ed Hours taken: ");
        genEdhr = dataInput.nextInt();

        //calculate required hours

        requiredHrs = MATH_HRS + COMPSCI_HRS + GEN_ED_HRS;
        //Calculate remaining hours
        remainingHrs = requiredHrs - (mathhr + cechr + genEdhr);
        System.out.println("\nHours Remaining to graduate: " + remainingHrs);
        return remainingHrs;
        
    }
    public void Display(){
        String secondString = super.toString() + "\nMajor: Computer Science " + 
            "\nMath Hours Taken: " + mathhr + "\nComputer Science Hours Taken: " + cechr + "\nGeneral Ed Taken: " + genEdhr;
    }
}
