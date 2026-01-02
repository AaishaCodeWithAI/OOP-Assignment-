package Assignment2.Inheritance;

public class Human {
    void speak() {
        System.out.println("Person can speak");
    }
}

class Student extends human {
    void study() {
        System.out.println("Student studies");
    }
}

class InheritanceExample2 {
    public static void main(String[] args) {

        Student s = new Student();

        s.speak();  // inherited method
        s.study();  // own method
    }
}
