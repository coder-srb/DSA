// 41. Find unique number in the array.

public class FindUniqueNumber {

    static int findUnique(int arr[]) {
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 9, 4, 3, 5, 2};
        System.out.println(findUnique(arr));
    }
}
