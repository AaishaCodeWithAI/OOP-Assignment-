package Assignment2.Tutorials;

public class SwapWithoutThird {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);

        // Swap using arithmetic operations
        a = a + b;  // a becomes 15 (5 + 10)
        b = a - b;  // b becomes 5 (15 - 10)
        a = a - b;  // a becomes 10 (15 - 5)

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }
} 
