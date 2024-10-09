package src.main.java.ca.nl.cna.riley.barrett.assignment2;

/**
 * a class for creating a objectfor employees
 *
 */
public class employee {
    private String Firstname;
    private String Lastname;
    private double salary;

    public employee(String firstname, String lastname, double salary) {
        Firstname = firstname;
        Lastname = lastname;
        this.salary = salary;

    }
    /**
     *gets the first name
     *
     */

    public String getFirstname() {
        return Firstname;
    }
    /**
     *sets the first name
     *
     */

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }
    /**
     *gets the first name
     *
     */

    public String getLastname() {
        return Lastname;
    }
    /**
     *sets the last name
     *
     */

    public void setLastname(String lastname) {
        Lastname = lastname;
    }
    /**
     *gets the salary
     *
     */

    public double getSalary() {
        return salary;
    }
    /**
     *sets the salary
     *
     */

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * gives the raise
     * @param raise
     */

    public void giveRaise(double raise) {
        if (raise > 0) {
            this.salary = this.salary * (1+raise);
        }
    }
}
