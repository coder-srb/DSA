// 6. Input currency in rupees and output in USD.

import java.util.Scanner;

public class Currency {
    static double convert(int r) {
        return r / 83.29;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the amount(in rupees): ");
        int rupees = in.nextInt();
        System.out.format("after converting(in usd): %.2f", convert(rupees));
    }
}