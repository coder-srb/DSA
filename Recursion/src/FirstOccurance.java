// 57. find the first occurance of the element in array.

public class FirstOccurance {

    static int firstOccurance(int arr[], int target, int i) {
        //base Condition
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return firstOccurance(arr, target, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 6, 5};
        System.out.println(firstOccurance(arr, 5, 0));
    }
}
