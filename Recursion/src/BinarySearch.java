// 64. perform binary search using recursion

public class BinarySearch {

    static int search(int arr[], int target, int start, int end) {
        // base condition
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target > arr[mid]) {
            return search(arr, target, mid + 1, end);
        }
        return search(arr, target, start, mid - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6, 7, 8};
        int target = 8;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }
}
