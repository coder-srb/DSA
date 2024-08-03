// 32. find the smallest element in the array in a given range.

public class FindSmallestElement_In_A_Range {
    static int min(int arr[], int start, int end) {
        int min = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = {1, 34, 5, 6, 3, 2, 12, 56, 67, 0};
        System.out.println(min(arr, 3, 8));
    }
}
