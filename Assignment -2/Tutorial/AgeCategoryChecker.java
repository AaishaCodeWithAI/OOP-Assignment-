package Assignment2.Tutorials;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeCategoryChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice = 'y';

        do {
            try {
                System.out.print("Enter your age: ");
                int age = sc.nextInt();

                if (age < 0) {
                    System.out.println("Invalid age! Age cannot be negative.");
                } else if (age < 18) {
                    System.out.println("You are a Minor");
                } else if (age < 60) {
                    System.out.println("You are an Adult");
                } else {
                    System.out.println("You are a Senior");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter vaild age numbers only.");
                sc.next(); // clear wrong input
            }

            System.out.print("Do you want to check another age? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program ended. Thank you!");
        sc.close();
    }
}
