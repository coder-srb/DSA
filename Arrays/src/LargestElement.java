// 31. Find the largest element of a 2D-Array.

import java.util.Scanner;

public class LargestElement {

    static int max(int arr[][]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        System.out.println("enter the elements of array: ");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("largest element in the array is: " + max(arr));
    }
}
