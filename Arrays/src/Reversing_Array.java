// 30. Reverse an Array

import java.util.Arrays;
import java.util.Scanner;

public class Reversing_Array {

    static int[] reverse(int arr[]) {
        int first = 0, last = arr.length - 1;
        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
        return arr;
    }

    public static void main(String args[]) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(reverse(arr)));
    }
}
