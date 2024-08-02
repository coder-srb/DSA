// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double ans = 0;
        while (true) {
            System.out.println("Choose any opeartor: (+ , - , * , / , % , to Exit.. Click 'x')");
            char op = s.next().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.println("enter num1: ");
                double num1 = s.nextDouble();
                System.out.println("enter num2: ");
                double num2 = s.nextDouble();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    ans = num1 / num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }

            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Choice, choose again");
            }
            System.out.println(ans);
        }
    }
}