// 5. Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestNumber {
    static double max(double x, double y) {
        double result;
        if (x == y) {
            System.out.println("Please enter two unique numbers");
        }
        return result = x > y ? x : y;
//        return result = Math.max(x, y);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter two numbers: ");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        System.out.println("largest number between (" + num1 + "," + num2 + ") is " + max(num1, num2));
    }
}