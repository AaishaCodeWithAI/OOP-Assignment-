package Assignment2.Tutorials;

import java.util.Scanner;

public class SwapWithoutThird {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter first number (a): ");
            int a = sc.nextInt();

            System.out.print("Enter second number (b): ");
            int b = sc.nextInt();

            System.out.println("\nBefore swapping:");
            System.out.println("a = " + a + ", b = " + b);

            // Swap without third variable
            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("After swapping:");
            System.out.println("a = " + a + ", b = " + b);

            System.out.print("\nDo you want to swap another pair of numbers? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program ended. Thank you!");
        sc.close();
    }
}
