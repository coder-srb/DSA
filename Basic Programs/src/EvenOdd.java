// 1. Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class EvenOdd {
    static boolean checkForEvenOdd(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter any number: ");
        int num = in.nextInt();

        if (checkForEvenOdd(num)) {
            System.out.println("entered number: " + num + " is an even number...");
        } else {
            System.out.println("entered number: " + num + " is an odd number...");
        }
    }
}