package Assignment2.Polymorphism;

public class Mathutil {
    int multiply(int a, int b) {
        return a*b;
    }
    double multiply(double a, double b) {
        return a*b;
    }
    int multiply(int a, int b, int c) {
        return a*b*c;
    }
}

class Overloading {
    public static void main(String[] args) {
        Mathutil m = new Mathutil();
        System.out.println(m.multiply(2, 3));
        System.out.println(m.multiply(2.5, 3.5));
        System.out.println(m.multiply(2, 3, 4));
    }
}

