public class OperatorsDemo {
    public static void main(String[] args) {

        int a = 10, b = 5;
        boolean x = true, y = false;

        // ---------------- Arithmetic Operators ----------------
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus
        System.out.println();

        // ---------------- Assignment Operators ----------------
        System.out.println("Assignment Operators:");
        int c = a; // Simple assignment
        System.out.println("c = a => c = " + c);
        c += b; // c = c + b
        System.out.println("c += b => c = " + c);
        c -= b; // c = c - b
        System.out.println("c -= b => c = " + c);
        c *= b; // c = c * b
        System.out.println("c *= b => c = " + c);
        c /= b; // c = c / b
        System.out.println("c /= b => c = " + c);
        c %= b; // c = c % b
        System.out.println("c %= b => c = " + c);
        System.out.println();

        // ---------------- Relational Operators ----------------
        System.out.println("Relational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println();

        // ---------------- Logical Operators ----------------
        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        System.out.println();

        // ---------------- Unary Operators ----------------
        System.out.println("Unary Operators:");
        int d = 5;
        System.out.println("d = " + d);
        System.out.println("++d = " + (++d)); // Pre-increment
        System.out.println("d++ = " + (d++)); // Post-increment
        System.out.println("--d = " + (--d)); // Pre-decrement
        System.out.println("d-- = " + (d--)); // Post-decrement
        System.out.println("-d = " + (-d));   // Unary minus
        System.out.println("+d = " + (+d));   // Unary plus
        System.out.println();

        // ---------------- Bitwise Operators ----------------
        System.out.println("Bitwise Operators:");
        int e = 6;  // 110 in binary
        int f = 3;  // 011 in binary
        System.out.println("e & f = " + (e & f)); // AND
        System.out.println("e | f = " + (e | f)); // OR
        System.out.println("e ^ f = " + (e ^ f)); // XOR
        System.out.println("~e = " + (~e));       // Complement
        System.out.println("e << 1 = " + (e << 1)); // Left shift
        System.out.println("e >> 1 = " + (e >> 1)); // Right shift
        System.out.println("e >>> 1 = " + (e >>> 1)); // Unsigned right shift
    }
}
