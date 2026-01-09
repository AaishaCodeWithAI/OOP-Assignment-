package Assignment2.Simple_concepts;

public class Students {
    String name; // instance variable

    // Constructor to set name directly
    Students(String name) {
        this.name = name;
    }

    // Setter method
    void setName(String name) {
        this.name = name;
    }

    // Getter method
    String getName() {
        return this.name;
    }

    // Main method
    public static void main(String[] args) {
        // Create student objects
        Students student1 = new Students("Alice");
        Students student2 = new Students("Bob");

        // Print student names
        System.out.println("Student 1: " + student1.getName());
        System.out.println("Student 2: " + student2.getName());

        // Change name of student2
        student2.setName("Charlie");
        System.out.println("Updated Student 2: " + student2.getName());
    }
}
