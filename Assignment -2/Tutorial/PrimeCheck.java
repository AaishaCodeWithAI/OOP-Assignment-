package Assignment2.Tutorials;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            try {
                  System.out.print("Enter a number: ");
                  int num = sc.nextInt();

                  boolean isPrime = true;

                  if (num <= 1) {
                      isPrime = false;
                  } else {
                            for (int i = 2; i <= Math.sqrt(num); i++) {
                                  if (num % i == 0) {
                                  isPrime = false;
                                  break;
                                  }
                            }
                         }

                if (isPrime) {
                       System.out.println("Prime Number");
                    
                } else {
                       System.out.println("Not a Prime Number");
                    
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

