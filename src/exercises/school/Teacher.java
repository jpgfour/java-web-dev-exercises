package exercises.school;

public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    //constructor
    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    //getter and setter for firstName
    public String getFirstName() {
        return firstName;
    }
    private void setFirstName(String aFirstName) {
        firstName = aFirstName;
    }

    //getter and setter for lastName
    public String getLastName() {
        return lastName;
    }
    private void setLastName(String aLastName) {
        lastName = aLastName;
    }

    //getter and setter for subject
    public String getSubject() {
        return subject;
    }
    public void setSubject(String aSubject) {
        subject = aSubject;
    }

    //getter and setter for yearsTeaching
    public int getYearsTeaching() {
        return yearsTeaching;
    }
    public void setYearsTeaching(int aYearsTeaching) {
        yearsTeaching = aYearsTeaching;
    }
}
