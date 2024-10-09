package src.main.java.ca.nl.cna.riley.barrett.assignment2;

import java.util.Scanner;

/**
 * class that uses the objects in the previous class takes the inputs of the employees
 * and then gives the user an average salary based on there inputs
 *
 */
public class FunWithEmployees {

    public static void main(String[] args) {
        /**
         * sets the first name last name and the salary to zero until users make there inputs
         * where then the employee salary and raise is added and returned to the user for the
         * end result to be a average salary
         */
        System.out.println("Fun with employees");
        Scanner input = new Scanner(System.in);

        double SalaryTotal =0;
        int employeeCount = 0;
        int numberOfEmployees = 3;

        while (employeeCount < numberOfEmployees) {
            System.out.println("Enter the first name");
            String firstName =input.next();

            System.out.println("Enter the last name");
            String lastName =input.next();

            System.out.println("Enter Employee Salary");
            double salary = input.nextDouble();

            employee employee = new employee(firstName,lastName,salary);
            employee.giveRaise(0.08);

            System.out.printf("nameL %s,%s,Salary:$%.2f\n",firstName,lastName,salary);

            SalaryTotal += employee.getSalary();
            employeeCount++;
        }
        System.out.printf("The average salary for all employees is: $%.2f\n",SalaryTotal/numberOfEmployees);
    }
}
