// 40. check a number is even or odd using bitwise operator

import java.util.Scanner;

public class CheckOddEven {

    static boolean isOdd(int num) {
        return (num & 1) == 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = in.nextInt();
        if (isOdd(num)) {
            System.out.println("Odd number");
        } else
            System.out.println("even number");
    }
}
