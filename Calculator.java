import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Enter operator (+, -, *, /):");
        char op = sc.next().charAt(0);

        int result = 0;

        if (op == '+') {
            result = a + b;
        }
        else if (op == '-') {
            result = a - b;
        }
        else if (op == '*') {
            result = a * b;
        }
        else if (op == '/') {
            result = a / b;
        }
        else {
            System.out.println("Invalid operator");
            return;
        }

        System.out.println("Result: " + result);
    }
}
