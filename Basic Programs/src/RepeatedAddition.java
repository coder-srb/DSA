// 12. Take integer inputs till the user enters 0 and print the sum of all numbers.

import java.util.Scanner;

public class RepeatedAddition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums, sum = 0;
        System.out.println("enter the numbers to perform addition: (enter '0' to submit)=>");
        while ((nums = in.nextInt()) != 0) {
            sum += nums;
        }
        System.out.println("Addition of all the entries: "+sum);
    }
}