package Assignment2.Tutorials;

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

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (isPalindrome(num))
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }
}
