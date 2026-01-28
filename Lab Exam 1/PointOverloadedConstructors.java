package Lab_Exam1;

class Point {
int xInt;
int yInt;
double xDouble;
double yDouble;

// Constructor with int parameters
Point(int x, int y) {
xInt = x;
yInt = y;
System.out.println("Integer Point: (" + xInt + ", " + yInt + ")");
}

// Constructor with double parameters
Point(double x, double y) {
xDouble = x;
yDouble = y;
System.out.println("Double Point: (" + xDouble + ", " + yDouble + ")");
}
}
 
public class PointOverloadedConstructors {
public static void main(String[] args) {
    Point p1 = new Point(3, 5);
    Point p2 = new Point(3.5, 5.5);
}
}
