// 28. Sum Of A Digits Of Number

import java.util.Scanner;

class SumOfDigits {
    static int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = in.nextInt();
        System.out.println(getSum(n));
    }
}
