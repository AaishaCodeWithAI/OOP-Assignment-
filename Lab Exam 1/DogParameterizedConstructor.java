package Lab_Exam1;

class Dog {
String name;
String color;

Dog(String name, String color) {
this.name = name;
this.color = color;
}

void display() {
System.out.println("Name: " + name + ", Color: " + color);
}
}

public class DogParameterizedConstructor {
public static void main(String[] args) {
Dog d = new Dog("Buddy", "Brown");
d.display();
}
}
