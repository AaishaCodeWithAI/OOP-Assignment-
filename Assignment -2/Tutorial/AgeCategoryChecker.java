package Assignment2.Tutorials;

import java.util.Scanner;
public class AgeCategoryChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 18)
            System.out.println("You are a Minor");
        else if (age < 60)
            System.out.println("You are a Adult");
        else
            System.out.println("You are a Senior");
    }
}
