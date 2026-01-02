package Assignment2.Polymorphism;

public class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Car is moving on roads");
    }
}

class Overriding {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.move();
    }
}

