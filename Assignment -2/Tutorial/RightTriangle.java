package Assignment2.Tutorials;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();

            if (rows <= 0) {
                System.out.println("Number of rows must be positive!");
            } else {
                System.out.println("Right-Angled Triangle Pattern:");
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }

            System.out.print("Do you want to print another triangle? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program ended. Thank you!");
        sc.close();
    }
}
