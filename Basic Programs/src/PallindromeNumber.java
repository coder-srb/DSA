// 22. Find if a number is palindrome or not

import java.util.Scanner;

class PallindromeNumber {
    static int reversNumber(int n) {
        int reversed_n = 0;
        while (n > 0) {
            reversed_n = reversed_n * 10 + n % 10;
            n = n / 10;
        }
        return reversed_n;
    }

    // Main function
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = s.nextInt();
        int reverseN = reversNumber(n);
        System.out.println("Reverse of n = " + reverseN);

        if (n == reverseN)
            System.out.println("Palindrome = Yes");
        else
            System.out.println("Palindrome = No");
    }
}

