import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        char op;

        System.out.println("=== Basic Calculator ===");

        while (true) {
            System.out.print("\nEnter first number: ");
            num1 = sc.nextDouble();

            System.out.print("Enter an operator (+, -, *, /) or q to quit: ");
            op = sc.next().charAt(0);

            if (op == 'q' || op == 'Q') {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();

            double result;
            switch (op) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
            }
        }
        sc.close();
    }
}