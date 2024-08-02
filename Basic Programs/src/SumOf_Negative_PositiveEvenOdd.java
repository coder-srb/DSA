// 29.Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.

import java.util.Scanner;

public class SumOf_Negative_PositiveEvenOdd {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int negative_Sum = 0, even_Sum = 0, odd_Sum = 0;
        System.out.println("Enter Numbers:");
        while (true) {
            int n = in.nextInt();

            if (n == 0) {
                break;
            }

            if (n < 0) {
                negative_Sum += n;
            } else if (n % 2 == 0) {
                even_Sum += n;
            } else {
                odd_Sum += n;
            }
        }

        System.out.println("Negative No. Sum = " + negative_Sum);
        System.out.println("Positive Even No. Sum = " + even_Sum);
        System.out.println("Positive Odd No. Sum = " + odd_Sum);
    }
}
