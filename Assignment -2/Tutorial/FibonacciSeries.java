package Assignment2.Tutorials;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice = 'y';

        do {
            try {
                System.out.print("Enter number of terms (n): ");
                int n = sc.nextInt();

                if (n <= 0) {
                    System.out.println("Please enter a positive number.");
                } else {
                    int a = 0, b = 1;

                    System.out.print("Fibonacci Series: ");
                    for (int i = 1; i <= n; i++) {
                        System.out.print(a + " ");
                        int next = a + b;
                        a = b;
                        b = next;
                    }
                    System.out.println();
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer value.");
                sc.next(); // clear invalid input
            }

            System.out.print("Do you want to check again? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program ended. Thank you!");
        sc.close();
    }
}

