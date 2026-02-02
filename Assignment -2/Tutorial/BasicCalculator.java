package Assignment2.Tutorials;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char continueCalc = 'y';

        do {
            try {
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();

                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                char choice;

                do {
                    System.out.print("Enter operator (+, -, *, /): ");
                    char op = sc.next().charAt(0);

                    switch (op) {
                        case '+':
                            System.out.println("Result = " + (a + b));
                            break;

                        case '-':
                            System.out.println("Result = " + (a - b));
                            break;

                        case '*':
                            System.out.println("Result = " + (a * b));
                            break;

                        case '/':
                            if (b != 0) {
                                System.out.println("Result = " + (a / b));
                            } else {
                                System.out.println("Division by zero not allowed");
                            }
                            break;

                        default:
                            System.out.println("Invalid operator");
                    }

                    System.out.print("Do you want to try another operator with same numbers? (y/n): ");
                    choice = sc.next().charAt(0);

                } while (choice == 'y' || choice == 'Y');

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter numeric values only.");
                sc.next(); // clear wrong input
            }

            System.out.print("Do you want to perform another calculation with new numbers? (y/n): ");
            continueCalc = sc.next().charAt(0);

        } while (continueCalc == 'y' || continueCalc == 'Y');

        System.out.println("Calculator closed. Thank you!");
        sc.close();
    }
}

