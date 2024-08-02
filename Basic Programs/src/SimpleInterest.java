// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    static double calculateSI(float p, float t, float r) {
        return (p * t * r) / 100;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("enter principal amount: ");
        float principal = in.nextFloat();
        System.out.print("enter time period: ");
        float time = in.nextFloat();
        System.out.print("enter rate of interest: ");
        float rate = in.nextFloat();

        System.out.println("Simple Interest: " + calculateSI(principal, time, rate));
    }
}