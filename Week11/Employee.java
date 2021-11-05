public class Employee extends Person{
    
    private int empID;
    private double salary;
    
    public Employee(String firstName, String lastName, String gender, int empID, double salary) {
        super(firstName, lastName, gender);
        this.empID = empID;
        this.salary = salary;
    }

    public void employment(){
        if(empID == 0){
            System.out.println("\nNot Employed. ");
        }
        else{
            System.out.println("\nYou are Employed");
        }
    }

    @Override
    public String toString() {
        return "The Employee Id:" + empID + "\nSalary: " + salary + "\nFirst Name: " + getFirstName() + "\nLast Name: " + getFirstName() + "\nGender: " + getGender();
    }
    
}
