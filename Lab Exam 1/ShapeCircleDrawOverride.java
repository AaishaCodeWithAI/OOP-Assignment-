package Lab_Exam1;
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
public class ShapeCircleDrawOverride {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
