package Lab_Exam1;

class Vehicle {
void start() {
System.out.println("Vehicle is starting");
}
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding");
    }
} 

public class VehicleBikeInheritanceDemo {
public static void main(String[] args) {
Bike b = new Bike();
b.ride(); // Bike's own method
b.start(); // inherited method
}
}
