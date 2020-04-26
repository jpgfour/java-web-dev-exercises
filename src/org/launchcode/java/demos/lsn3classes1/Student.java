package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    //constructors (taken from textbook example)
    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = 0;
        this.gpa = 0.0;
    }

    //name getter & setter
    public String getName() {
        return name;
    }
    public void setName(String aName) {
        name = aName;
    }

    //studentID getter & setter
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int aStudentID){
        studentId = aStudentID;
    }

    //numberOfCredits getter & setter
    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    //gpa getter & setter
    public double getGpa() {
        return gpa;
    }
    private void setGpa(double aGpa) {
        gpa = aGpa;
    }

}