package Assignment2.Tutorials;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PalindromeNumber {

    static boolean isPalindrome(int x) {
        int original = x, reverse = 0;

        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice = 'y';

        do {
            try {
                System.out.print("Enter a number: ");
                int num = sc.nextInt();

                if (num < 0) {
                    System.out.println("Negative numbers cannot be palindrome.");
                } else if (isPalindrome(num)) {
                    System.out.println("Palindrome Number");
                } else {
                    System.out.println("Not a Palindrome Number");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer value.");
                sc.next(); // clear invalid input
            }

            System.out.print("Do you want to check another number? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program ended. Thank you!");
        sc.close();
    }
}
