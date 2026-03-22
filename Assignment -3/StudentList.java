package Java_Program;

import java.util.*;

public class StudentList {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        // Add elements
        students.add("Aaisha");
        students.add("Ravi");
        students.add("Sita");

        // Remove student
        students.remove("Ravi");

        // Display
        System.out.println(students);
    }
}
