// 58. WAF to find the last occurence of an element in an array.

public class LastOccurance {
    static int lastOccurance(int arr[], int target, int i) {
        //base Condition
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance(arr, target, i + 1);
        if (isFound == -1 && arr[i] == target) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 6, 5};
        System.out.println(lastOccurance(arr, 5, 0));
    }
}
