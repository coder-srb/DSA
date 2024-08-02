// 16. Calculate Average Of N Numbers.

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Limit: ");
        int n = in.nextInt();
        double sum = 0, a;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter The Number " + i + ": ");
            a = in.nextDouble();
            sum += a;
        }
        System.out.println("The sum of given numbers is : " + (double) Math.round(sum * 100) / 100);
        System.out.println("The Average of given numbers is : " + (double) Math.round((sum / n) * 100) / 100);
    }
}
