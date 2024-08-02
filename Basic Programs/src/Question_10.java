// 10. Subtract the Product and Sum of Digits of an Integer.

import java.util.Scanner;

public class Question_10 {

    // product of digits of the number
    static int product(int n) {
        int mul = 1;
        while (n != 0) {
            int rem = n % 10;
            mul *= rem;
            n /= 10;
        }
        return mul;
    }

    // sum of digits of the number
    static int sum(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = in.nextInt();
        int subtract = product(num) - sum(num);  // subtraction operation
        System.out.println("After subtracting the product and sum of digits: " + subtract);
    }
}
