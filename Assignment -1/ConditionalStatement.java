public class ConditionalStatement {
    public static void main(String[] args) {
        System.out.println("# Condition Statement");
        int age = 20;
        if (age >= 18) {
            System.out.println("You are an adult.");
        }
        System.out.println("# If Else Condition Statement");
        int num = 5;
        if (num % 2 == 0) {
            System.out.println(num + " is Even Number");
        } else {
            System.out.println(num + " is Odd Number");
        }
        System.out.println("# If-Else-if Condition Statement");
        int marks = 72;
        if (marks >= 90) {
            System.out.println("A Grade");
        } else if (marks >= 75) {
            System.out.println("B Grade");
        } else {
            System.out.println("C Grade");
        }
        System.out.println("# Nested IF");
        int a=10, b=20;
        if (a<20){
            if (b>15){
                System.out.println("Nested Condition true");
            }
        }
        System.out.println("# Switch Case Statement");
        int day = 3;
        switch (day) {
            case 1: System.out.println("Sunday");  break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("Invalid day");
        }
      System.out.println("# Ternary Operator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your aged: ");
        int aged = input.nextInt();
        String result = (age < 18) ? "not an adult" : "adult" ;
        System.out.println(" You are " + result);
        input.close();
    }
}
