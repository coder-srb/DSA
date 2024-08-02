// 11. Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class FactorsOfNumber {
    static void factors(int num) {
        for (int i = 1; i <= (num / 2); i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print(num);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = in.nextInt();
        factors(num);
    }
}
