package Assignment2.Tutorials;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice = 'y';

        do {
            try {
                System.out.print("Enter a number: ");
                int n = sc.nextInt();

                System.out.println("Multiplication Table of " + n + ":");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + " x " + i + " = " + (n * i));
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer number.");
                sc.next(); // clear invalid input
            }

            System.out.print("Do you want to print another table? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program ended. Thank you!");
        sc.close();
    }
}



