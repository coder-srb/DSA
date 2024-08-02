// 7. To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibonacci {
    static void series(int n) {
        int t1 = 0;
        int t2 = 1;
        System.out.print(t1 + "," + t2);
        for (int i = 2; i < n; i++) {
            int temp = t2;
            t2 = t1 + t2;
            System.out.print("," + t2);
            t1 = temp;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the desired no. of fibonacci series: ");
        int n = in.nextInt();
        series(n);
    }
}