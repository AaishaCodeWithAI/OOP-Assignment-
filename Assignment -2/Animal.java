package Assignment2.Inheritance;

public class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class InheritanceExample1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); // inherited method
        d.bark();// child method
    }
}
