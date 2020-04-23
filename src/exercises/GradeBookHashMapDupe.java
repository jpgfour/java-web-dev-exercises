package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeBookHashMapDupe {

    public static void main(String[] args) {

        HashMap<Integer,String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);

        //String IDNumber;
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID#: ");
                Integer IDNumber = input.nextInt();
                students.put(IDNumber,newStudent);

                // Read in the newline before looping back
                //THIS NEXT LINE IS WHAT TRIPS ME UP
                input.nextLine();
                //but I got it to work anyway
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");


        for (Map.Entry<Integer,String> student : students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }

    }

}
