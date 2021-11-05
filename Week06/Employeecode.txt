package roye_Exam01;

import java.util.Scanner;

public class roye_Employee {
    public static void main(String[] args) {
        Scanner dataInput = new Scanner(System.in);
        //call for the users to enter in the ammount of employees to calcualte pay
        System.out.println("\nEnter the number of Employees: ");
        int numEmployee = dataInput.nextInt();
        //for loop to keep the calculator program running for the alloted ammount of time
        for (int i = 0; i < numEmployee; i++) {
            //call for the users pay code
            System.out.println("\nEnter your Employee Pay Code: "+ 
        "\t\nmgr01 ----- for Managers" +    
        "\t\nlect02 ----- for Lecturers" +    
        "\t\nadst03 ----- for Admission Staff" +    
        "\t\nstrec04 ----- for Student' Recruiters");
        System.out.println("\nEnter a choice: ");
        char choice = dataInput.next().charAt(0);
        switch(choice) {
            case 'm':
                //Manger play secuence for the Weekly Pay and Display
                System.out.println("\nEnter the weeks worked: ");
                int weeksWorked = dataInput.nextInt();
                System.out.println("\nEnter the Weekly Pay: ");
                int ammountWeekly = dataInput.nextInt();
                double result = 0;
                result += weeksWorked * ammountWeekly;
                System.out.println("\n the total for " + weeksWorked + " weeks is: " + result + " dollars.");
                break;            
            case 'l':
                //lectures pay calculation
                System.out.println("\nEnter the hours worked: ");
                int hoursWorked = dataInput.nextInt();
                System.out.println("\nEnter the hourly pay: ");
                int hourlyPay = dataInput.nextInt();
                //calcualtion of more that 40 hours are worked
                if (hoursWorked > 40) {
                    double hoursStandard = 40 * hourlyPay;
                    double overtimePay = 1.5 * hourlyPay;
                    double overtimeHours = hoursWorked - 40;
                    double overtimeSalary = 0;
                    overtimeSalary += overtimePay * overtimeHours;
                    double totalPay = overtimeSalary + hoursStandard;
                    System.out.println("\nThe total pay for " + hoursWorked + " hours is: " + totalPay + " dollars.");

                }
                //calculation for less than 40 hours worked
                else {
                    double result02 = 0;
                result02 += hoursWorked * hourlyPay;
                System.out.println("\nThe total pay for " + hoursWorked + " hours is: " + result02 + " dollars.");
                break;       
                }       
                break;       
            case 'a':
                //Admission staff pay calcualtion
                System.out.println("\nEnter the ammout of comitted students for the week: ");
                int students = dataInput.nextInt();
                double commissionSalrary = 0;
                double studentBonus = (480 * .078) * students;
                commissionSalrary += 480 + studentBonus;
                System.out.println("\nThe commissions for the week are: " + commissionSalrary + " dollars, with bonus.");
                break;            
            case 's':
                //Student recruiters pay calcualtion 
                System.out.println("\nEnter the ammout of comitted students for the week: ");
                int students02 = dataInput.nextInt();
                System.out.println("\nEnter the fixed per student ammount: ");
                int studentAmmount = dataInput.nextInt();
                double payout = 0;
                payout += students02 * studentAmmount;
                System.out.println("\nThe total ammout of pay for the week is : " + payout + " dollars.");
                break;            
       }
    }
}
}