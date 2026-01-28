package Lab_Exam1;
import java.util.Scanner;
public class FindGreatestOfThree {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter three numbers:");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();


int greatest = a;
if (b > greatest) greatest = b;
if (c > greatest) greatest = c;


System.out.println("Greatest number is: " + greatest);
}
}    
