package Lab_Exam1;
class Car {
String model;

// Constructor
Car(String model) {
this.model = model; // this refers to the instance variable
}

void display() {
System.out.println("Car model: " + model);
}
}

public class CarThisKeywordDemo {
public static void main(String[] args) {
Car c = new Car("Toyota");
c.display();
}
}
