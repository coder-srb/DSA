// 13. Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class LargestOfAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums, max = Integer.MIN_VALUE;
        System.out.println("enter the numbers you want to compare: (enter '0' to submit)=>");
        while ((nums = in.nextInt()) != 0) {
            if(max < nums){
                max = nums;
            }
        }
        System.out.println("largest number of all the entries: "+max);
    }
}
