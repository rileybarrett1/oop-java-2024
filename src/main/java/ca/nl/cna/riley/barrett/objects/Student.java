package src.main.java.ca.nl.cna.riley.barrett.objects;

/**
 * A simple class to represent a student.
 */
public class Student {

    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Set the first name
     * @param firstName first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get the first name
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Get the last name
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the last name
     * @param lastName last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
