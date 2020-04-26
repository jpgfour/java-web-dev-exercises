package exercises.school;

import org.launchcode.java.demos.lsn3classes1.Student;

import java.util.ArrayList;

public class Course {
    private String name;
    private int classID;
    private int creditHours;
    private ArrayList<Student> students;

    //constructors (taken from textbook example)
    public Course(String name, int classID,
                   int creditHours, ArrayList students) {
        this.name = name;
        this.classID = classID;
        this.creditHours = creditHours;
        this.students = students;
    }

    public Course(String name, int classID) {
        this.name = name;
        this.classID = classID;
        this.creditHours = 3;
        //fill in with default name of list of students
    }

    //name getter & setter
    public String getName() {
        return name;
    }
    public void setName(String aName) {
        name = aName;
    }

    //classID getter & setter
    public int getClassID() {
        return classID;
    }
    public void setClassID(int aClassID){
        classID = aClassID;
    }

    //creditHours getter & setter
    public int getCreditHours() {
        return creditHours;
    }
    public void setCreditHours(int aCreditHours) {
        creditHours = aCreditHours;
    }

    //students getter & setter
    public ArrayList<Student> getStudents() {
        return students;
    }
    private void setStudents(ArrayList aStudents) {
        students = aStudents;
    }
}
