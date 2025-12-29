package Assignment2;

public class Student {
    int rollNumber;
    String name;

    void displayInfo() {
        System.out.println("Roll: " + rollNumber);
        System.out.println("Name: " + name);
    }
}
class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNumber = 1;
        s1.name = "Ram";
        s1.displayInfo();
    }
}
